package TechNodefirmacraft.core;


import com.bioxx.tfc.api.TFCBlocks;

import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class ModFluids extends Fluid {
	
	public static final Fluid OAKMIX = new ModFluids("oakmix").setBaseColor(0x00b000);
	public static final Fluid BIRCHMIX = new ModFluids("birchmix").setBaseColor(0xa0e6a0);
	public static final Fluid SPRUCEMIX = new ModFluids("sprucemix").setBaseColor(0x50a064);
	public static final Fluid JUNGLEMIX = new ModFluids("junglemix").setBaseColor(0x5a820a);
	public static final Fluid ACACIAMIX = new ModFluids("acaciamix").setBaseColor(0x7d820a);
	public static final Fluid DARKOAKMIX = new ModFluids("darkoakmix").setBaseColor(0x5a785a);
	public static final Fluid REGENPOT = new ModFluids("regenpot").setBaseColor(0xf600f7);
	public static final Fluid SWIFTPOT = new ModFluids("swiftpot").setBaseColor(0x7aacc3);
	public static final Fluid FIRERESPOT = new ModFluids("firerespot").setBaseColor(0xe09839);
	public static final Fluid POISONPOT = new ModFluids("poisonpot").setBaseColor(0x4d9130);
	public static final Fluid HEALTHPOT = new ModFluids("healthpot").setBaseColor(0xf42322);
	public static final Fluid NIGHTVISIONPOT = new ModFluids("nightvisionpot").setBaseColor(0x1f1f9e);
	public static final Fluid WEAKNESSPOT = new ModFluids("weaknesspot").setBaseColor(0x474c47);
	public static final Fluid STRPOT = new ModFluids("strpot").setBaseColor(0x912322);
	public static final Fluid SLOWPOT = new ModFluids("slowpot").setBaseColor(0x596a7f);
	public static final Fluid HARMPOT = new ModFluids("harmpot").setBaseColor(0x420a09);
	public static final Fluid WATERBREATHINGPOT = new ModFluids("waterbreathingpot").setBaseColor(0x2d5197);
	public static final Fluid INVISIBILITYPOT = new ModFluids("invisibilitypot").setBaseColor(0x7d8190);

	public static final Fluid ENERGIZINGFLUID = new ModFluids("energizingfluid").setBaseColor(0x2ccdb1);
	public static final Fluid EXTENDINGFLUID = new ModFluids("extendingfluid").setBaseColor(0xffa300);


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
			return TFCBlocks.hotWater.getIcon(0, 0);
		return this.stillIcon;
	}

	@Override
	public IIcon getFlowingIcon()
	{
		if(this.flowingIcon == null)
			return TFCBlocks.hotWater.getIcon(2, 0);
		return this.flowingIcon;
	}

}
