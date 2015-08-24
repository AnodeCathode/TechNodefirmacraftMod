package TechNodefirmacraft.core;


import com.bioxx.tfc.api.TFCBlocks;

import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class ModFluids extends Fluid {
	
	public static Fluid OAKMIX;
	public static Fluid BIRCHMIX;
	public static Fluid SPRUCEMIX;
	public static Fluid JUNGLEMIX;
	public static Fluid ACACIAMIX;
	public static Fluid DARKOAKMIX;
	
	public ModFluids(String fluidName) {
		super(fluidName);
	}

	private int color = 0xffffff;

	public ModFluids setBaseColor(int c)
	{
		color = c;
		return this;
	}

	@Override
	public int getColor(FluidStack fs)
	{
		return color;
	}

	@Override
	public int getColor()
	{
		return color;
	}

	@Override
	public IIcon getStillIcon()
	{
		if(this.stillIcon == null)
			return TFCBlocks.HotWater.getIcon(0, 0);
		return this.stillIcon;
	}

	@Override
	public IIcon getFlowingIcon()
	{
		if(this.flowingIcon == null)
			return TFCBlocks.HotWater.getIcon(2, 0);
		return this.flowingIcon;
	}

}
