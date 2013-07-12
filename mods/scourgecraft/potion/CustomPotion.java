package mods.scourgecraft.potion;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;

public class CustomPotion extends Potion
{
	private boolean instant;
	private int customColor;
	private boolean isBadEffect;

	public CustomPotion(String name, boolean bad, int color, boolean instant, String iconFile, int iconX, int iconY)
	{
		this(name, bad, color, instant, iconFile, iconX, iconY, -1);
	}

	public CustomPotion(String name, boolean bad, int color, boolean instant, String iconFile, int iconX, int iconY, int customColor)
	{
		super(getNextFreeID(), bad, color);
		this.setPotionName(name);
		this.instant = instant;
		this.setIconIndex(iconX, iconY);
		this.customColor = customColor;
		this.isBadEffect = bad;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getStatusIconIndex()
	{
		return super.getStatusIconIndex();
	}

	public int getCustomColor()
	{
		return customColor;
	}

	public boolean isInstant()
	{
		return instant;
	}

	public boolean isBadEffect()
	{
		return isBadEffect;
	}

	public static int getNextFreeID()
	{
		int id = 32;
		for (int i = 0; i < potionTypes.length; i++)
		{
			if (potionTypes[i] == null)
			{
				id = i;
			}
		}
		return id;
	}

	static
	{
		expandPotionList();
	}

	public static void expandPotionList()
	{
		Potion[] potionTypes = null;

		for (Field f : Potion.class.getDeclaredFields())
		{
			f.setAccessible(true);
			try
			{
				if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a"))
				{
					Field modfield = Field.class.getDeclaredField("modifiers");
					modfield.setAccessible(true);
					modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);

					potionTypes = (Potion[])f.get(null);
					final Potion[] newPotionTypes = new Potion[64];
					System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
					f.set(null, newPotionTypes);
				}
			}
			catch (Exception e)
			{
				System.err.println("Severe error, please report this to the mod author:");
				System.err.println(e);
			}
		}
	}

}