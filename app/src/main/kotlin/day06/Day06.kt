package day06

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 6
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay06Part1, ::solveDay06Part2)
}


fun solveDay06Part1(input: List<String>): Int {
    TODO()
}

fun solveDay06Part2(input: List<String>): Int {
    TODO()
}