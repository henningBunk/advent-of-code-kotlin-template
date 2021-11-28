package day15

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 15
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay15Part1, ::solveDay15Part2)
}


fun solveDay15Part1(input: List<String>): Int {
    TODO()
}

fun solveDay15Part2(input: List<String>): Int {
    TODO()
}