package me.char321.sfadvancements.core.tasks;

import me.char321.sfadvancements.SFAdvancements;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.IOException;
import java.util.logging.Level;

public class AutoSaveTask extends BukkitRunnable {
    @Override
    public void run() {
        try {
            SFAdvancements.getAdvManager().save();
        } catch (IOException e) {
            SFAdvancements.logger().log(Level.SEVERE, e, () -> "无法保存进度!");
        }
    }
}
