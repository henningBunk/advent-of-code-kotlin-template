package common

import kotlin.system.exitProcess

fun Array<String>.readSessionCookie() = try {
    this[0]
} catch (_: Exception) {
    println("Please pass your session cookie as a parameter.")
    exitProcess(1)
}