package cloud.acog.bukkit
import java.util.UUID

data class GuildData(
    val guildName: String,
    val guildLevel: Int,
    val guildPoint: Long,

    val guildMaxMember: Int,
    val  guildMembers: Map<UUID, MemberData>,
    val inviteMember: Map<UUID, UUID>,
    val applyMember: Map<UUID, UUID>
) {
    companion object {
        fun simple(guildName: String) : GuildData {
            return GuildData(
                guildName, 1, 0, 15,
                mutableMapOf(), mutableMapOf(), mutableMapOf()
            )
        }
    }
}