package cloud.acog.bukkit

import org.bukkit.entity.Player
import java.util.UUID

data class MemberData(
    val uuid: UUID,
    val role: GuildRole,
    val point: Long
) {
    companion object {
        fun of(player: Player) : MemberData {
            return MemberData(
                player.uniqueId, GuildRole.MASTER, 0
            )
        }
    }
}