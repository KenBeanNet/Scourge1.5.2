package mods.scourgecraft.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.minecraft.potion.PotionEffect;

public class BuffHandler {

    public static Map<String, BuffHandler> buffHandlers = new HashMap<String, BuffHandler>();

    private List<Buff> activeBuffs = new ArrayList<Buff>();
    private List<Buff> removeBuffQueue = new LinkedList<Buff>();
    
    public static BuffHandler getPlayerBuffHandler(String name)
    {
    	if (buffHandlers.get(name) == null)
    		buffHandlers.put(name, new BuffHandler());
    	return buffHandlers.get(name);
    }
    
    public boolean canCast(int skillId)
    {
    	for(Buff b : activeBuffs)
    	{
    		if (b.skillId == skillId)
    			return false;
    	}
    	return true;
    }
    
    public void stopCast(int skillId, int coolDown)
    {
    	activeBuffs.add(new Buff(skillId, coolDown));
    }
    
    public void onTick()
    {
    	for(Buff b : activeBuffs)
    	{
    		if (b.onTick())
    			removeBuffQueue.add(b);
    	}
    	for (Buff pe : removeBuffQueue)
		{
			activeBuffs.remove(pe);
		}
    	removeBuffQueue.clear();
    }
    
    public class Buff
    {
    	public int skillId;
    	public int coolTimer;
    	public Buff(int skillIdAmount, int coolTimerAmount)
    	{
    		skillId = skillIdAmount;
    		coolTimer = coolTimerAmount;
    	}
    	
    	public boolean onTick()
    	{
    		if (coolTimer == 0)
    			return true;
    		else
    			coolTimer--;
    		return false;
    	}
    }
}
