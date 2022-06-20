package me.glicz.anvus.core;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AMVUSAPI {

    private static final HashMap<String, String> authorizedPlayers = new HashMap<>();

    public static boolean isAuthorized(String player, String ip) {
        return authorizedPlayers.containsKey(player) && authorizedPlayers.get(player).equals(ip);
    }

    private static void updateAuthorizedPlayers(String key) {

    }

    public static void load(String key) {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> updateAuthorizedPlayers(key), 0, 5, TimeUnit.SECONDS);
    }
}
