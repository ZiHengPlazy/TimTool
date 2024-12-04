package top.sacz.timtool.net.entity

data class HasUpdate(
    val hasUpdate: Boolean,
    val isForceUpdate: Boolean,
    val version: Int
)

data class UpdateInfo(
    val fileName: String,
    val forceUpdate: Boolean,
    val id: Int,
    val time: String,
    val updateLog: String,
    val versionCode: Int,
    val versionName: String
)