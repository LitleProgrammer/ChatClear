package de.littleprogrammer.chatclear;

import de.littleprogrammer.chatclear.commands.ChatClearCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("___________________________________");
        System.out.println("   ChatClear by    ");
        System.out.println("   LittleProgrammer");
        System.out.println("   Discord:         ");
        System.out.println("   https://discord.gg/ssfd7zKSrA");
        System.out.println("___________________________________");

        //Commands
        getCommand("clearChat").setExecutor(new ChatClearCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Thanks for using ClearChat");
        System.out.println("If you have any questions or suggestions");
        System.out.println("check out my discord server:");
        System.out.println("https://discord.gg/ssfd7zKSrA");
    }
}
