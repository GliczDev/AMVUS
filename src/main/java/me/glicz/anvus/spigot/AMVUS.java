package me.glicz.anvus.spigot;

import me.glicz.anvus.core.AMVUSAPI;
import me.glicz.anvus.spigot.listeners.PreLoginListener;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.Set;

public class AMVUS extends JavaPlugin {
    
    @Override
    public void onEnable() {
        AMVUSAPI.load("");
        getServer().getPluginManager().registerEvents(new PreLoginListener(), this);
    }
}
