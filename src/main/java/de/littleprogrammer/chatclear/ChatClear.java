package de.littleprogrammer.chatclear;

import org.bukkit.entity.Player;

public class ChatClear {

    public ChatClear(Player target) {

        for (int i = 0; i < 40; i++) {
            //Sending a black message to clear his chat
            target.sendMessage(" ");
        }

    }

}
