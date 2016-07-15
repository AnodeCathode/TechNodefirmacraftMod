package TechNodefirmacraft.items;

import java.util.HashMap;
import java.util.Map;

import TechNodefirmacraft.core.ModDetails;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class TFCRecord extends ItemRecord {
    private static final Map field_150928_b = new HashMap();
    /** The name of the record. */
    public final String recordName;
    
	public TFCRecord(String p_i45350_1_) {
		super(p_i45350_1_);
		this.recordName = p_i45350_1_;
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabMisc);
        field_150928_b.put(ModDetails.ModID + ":" + "records." + p_i45350_1_, this); //Forge Bug Fix: RenderGlobal adds a "records." when looking up below.
	}
	
    /**
     * Return the record item corresponding to the given name.
     */
    @SideOnly(Side.CLIENT)
    public static TFCRecord getRecord(String p_150926_0_)
    {
        return (TFCRecord)field_150928_b.get(p_150926_0_);
    }
    
    /*
    * Retrieves the resource location of the sound to play for this record.
    * 
    * @param name The name of the record to play
    * @return The resource location for the audio, null to use default.
    */
   public ResourceLocation getRecordResource(String name)
   {
       return new ResourceLocation(ModDetails.ModID + ":" + "records." + this.recordName);
   }

}
