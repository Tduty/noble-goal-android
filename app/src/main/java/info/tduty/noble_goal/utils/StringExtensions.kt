package info.tduty.noble_goal.utils

/**
 * Created by Evgeniy Mezentsev on 14.05.2020.
 */

fun String?.getToken(): String {
    return this?.split("/")?.lastOrNull() ?: ""
}