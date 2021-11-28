package day03

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 3
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay03Part1, ::solveDay03Part2)
}


fun solveDay03Part1(input: List<String>): Int {
    TODO()
}

fun solveDay03Part2(input: List<String>): Int {
    TODO()
}