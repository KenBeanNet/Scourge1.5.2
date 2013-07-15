package mods.scourgecraft.client;

import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHandler
{
	public static String[] soundFiles = new String[] {"mob/goldenorbspider.ogg", "mob/clipper.ogg", "mob/clipperhurt.ogg",
		"mob/crawler.ogg", "mob/crawlerhurt.ogg", "mob/dramcryx.ogg", "mob/dramcryxhurt.ogg", "mob/iceman.ogg", "mob/icemanhurt.ogg",
		"mob/whale.ogg", "mob/whalehurt.ogg", "mob/shark.ogg", "mob/sharkhurt.ogg", "mob/archer.ogg", "mob/highhurt.ogg",
		"mob/hiss.ogg", "mob/growlhurt.ogg"};

    @ForgeSubscribe
    public void onSoundsLoaded(SoundLoadEvent var1)
    {
        SoundManager var2 = var1.manager;
        System.out.println("[ScourgeCraft] Trying to Load Sounds");
        String[] var3 = soundFiles;
        int var4 = var3.length;

        for (int var5 = 0; var5 < var4; ++var5)
        {
            String var6 = var3[var5];

            try
            {
                var2.soundPoolSounds.addSound(var6, this.getClass().getResource("/mods/scourgecraft/sounds/" + var6));
            }
            catch (Exception var8)
            {
            	System.out.println("[ScourgeCraft] Failed loading sound file: " + var6);
            }
        }
    }
}
