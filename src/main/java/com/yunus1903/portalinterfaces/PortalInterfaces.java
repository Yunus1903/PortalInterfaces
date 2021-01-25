package com.yunus1903.portalinterfaces;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Yunus1903
 * @since 25/01/2021
 */
@Mod(PortalInterfaces.MOD_ID)
@Mod.EventBusSubscriber(modid = PortalInterfaces.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PortalInterfaces
{
    public static final String MOD_ID = "portalinterfaces";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @SubscribeEvent
    public static void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Portal Interfaces is being initialized");
    }
}
