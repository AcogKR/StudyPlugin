package cloud.acog.bukkit

import org.bukkit.plugin.java.JavaPlugin

class StudyPlugin : JavaPlugin() {
    var guildDataMap: Map<String, GuildData> = mapOf()

    companion object {
        fun getInstance() : StudyPlugin {
            return JavaPlugin.getPlugin(StudyPlugin::class.java)
        }
    }

}