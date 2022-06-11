package me.kelsi;

import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class newworld implements CommandExecutor {
    World world;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (args.length == 0) {
                p.sendMessage("Вы не написали не одного аргумента. Повторите попытку.");
                p.sendMessage("Пример: /newworld <Ник владельца мира>");
            }else{
                String nick = args[0];
                String world_name = "Мир " + nick;
            }

        }
        createWorld();
        return false;
    }

    public void createWorld() {
        WorldCreator c = new WorldCreator("World %player_name%");
        String world_name = "Мир %player_name%";
        c.type(WorldType.FLAT);
        c.generateStructures(false);
        world.getWorldBorder().setSize(400);
        world = c.createWorld();

    }

}
