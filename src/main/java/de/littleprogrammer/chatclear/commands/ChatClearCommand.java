package de.littleprogrammer.chatclear.commands;

import de.littleprogrammer.chatclear.ChatClear;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatClearCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (!(commandSender instanceof Player)) {
            return false;
        }

        Player player = (Player) commandSender;

        if (strings.length == 0) {
            //Player wants to clear his own chat
            //Checking if the player has the permission to clear his own chat or to clear the chat for everyone
            if (player.hasPermission("chatClear.clear") || player.hasPermission("chatClear.clear.all")){

                new ChatClear(player);
            }
        } else if (strings.length == 1 && (strings[0].equals("@a") || strings[0].equals("all"))) {

            //Checking if the player has the permission to clear the chat for everyone
            if (player.hasPermission("chatClear.clearAll")) {

                //Player wants to clear the chat for all players online
                for (Player target : Bukkit.getOnlinePlayers()) {

                    //Looping through every player and clearing his chat
                    new ChatClear(target);

                }
            }
        }



        return false;
    }
}
