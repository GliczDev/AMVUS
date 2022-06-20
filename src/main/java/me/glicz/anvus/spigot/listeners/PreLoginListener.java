package me.glicz.anvus.spigot.listeners;

import me.glicz.anvus.core.AMVUSAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class PreLoginListener implements Listener {

    @EventHandler
    public void onPreLogin(AsyncPlayerPreLoginEvent e) {
        if (!AMVUSAPI.isAuthorized(e.getName(), e.getAddress().getHostName())) {
            e.setLoginResult(AsyncPlayerPreLoginEvent.Result.KICK_OTHER);
            e.setKickMessage("Please authorize on *url*");
        }
    }
}
