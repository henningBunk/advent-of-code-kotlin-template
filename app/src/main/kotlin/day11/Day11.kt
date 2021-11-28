package day11

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 11
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay11Part1, ::solveDay11Part2)
}


fun solveDay11Part1(input: List<String>): Int {
    TODO()
}

fun solveDay11Part2(input: List<String>): Int {
    TODO()
}