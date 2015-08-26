package TechNodefirmacraft.handlers;



import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;
import TechNodefirmacraft.core.ModRecipes;



public class ServerTickHandler 
{
    @SubscribeEvent 
    public void onServerWorldTick(WorldTickEvent e) 
    { 
        if (e.phase == Phase.START) 
        { 
        	if (e.world.provider.dimensionId == 0)
        	{
        		//ModRecipes.initialiseAnvil(); 
        		ModRecipes.initMTScripts();
        	}	
        } 
		else if(e.phase == Phase.END)
		{

		}
    } 
}
