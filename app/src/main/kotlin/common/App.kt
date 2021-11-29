@file:JvmName("App")

package common

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    val day: Int = try { System.getProperty("day").toInt() } catch (_: Exception) {
        println("Please specify which day should be executed by adding '-Dday=1' to your run command.")
        exitProcess(1)
    }

    val sessionCookie: String = try { System.getProperty("sessionCookie") } catch (_: Exception) {
        println("Please set the session cookie in the gradle.properties file or by adding '-DsessionCookie=yourCookie' to your run command.")
        exitProcess(1)
    }

    when (day) {
        1 -> day01.main(arrayOf(sessionCookie))
        2 -> day02.main(arrayOf(sessionCookie))
        3 -> day03.main(arrayOf(sessionCookie))
        4 -> day04.main(arrayOf(sessionCookie))
        5 -> day05.main(arrayOf(sessionCookie))
        6 -> day06.main(arrayOf(sessionCookie))
        7 -> day07.main(arrayOf(sessionCookie))
        8 -> day08.main(arrayOf(sessionCookie))
        9 -> day09.main(arrayOf(sessionCookie))
        10 -> day10.main(arrayOf(sessionCookie))
        11 -> day11.main(arrayOf(sessionCookie))
        12 -> day12.main(arrayOf(sessionCookie))
        13 -> day13.main(arrayOf(sessionCookie))
        14 -> day14.main(arrayOf(sessionCookie))
        15 -> day15.main(arrayOf(sessionCookie))
        16 -> day16.main(arrayOf(sessionCookie))
        17 -> day17.main(arrayOf(sessionCookie))
        18 -> day18.main(arrayOf(sessionCookie))
        19 -> day19.main(arrayOf(sessionCookie))
        20 -> day20.main(arrayOf(sessionCookie))
        21 -> day21.main(arrayOf(sessionCookie))
        22 -> day22.main(arrayOf(sessionCookie))
        23 -> day23.main(arrayOf(sessionCookie))
        24 -> day24.main(arrayOf(sessionCookie))
        25 -> day25.main(arrayOf(sessionCookie))
        else -> println("Invalid day.")
    }
}
