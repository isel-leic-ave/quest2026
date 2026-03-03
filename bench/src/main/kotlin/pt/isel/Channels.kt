package pt.isel

import java.sql.Connection

fun getChannelsNames(connection: Connection): List<String> {
    val stmt = connection.prepareStatement("SELECT * FROM channels")
    val rs = stmt.executeQuery()
    return mutableListOf<String>().apply {
        while (rs.next()) {
            add(rs.getString("name"))
        }
    }
}
