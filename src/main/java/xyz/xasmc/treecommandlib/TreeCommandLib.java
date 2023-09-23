package xyz.xasmc.treecommandlib;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class TreeCommandLib extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info(ChatColor.GREEN + "TreeCommandPlugin Loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
