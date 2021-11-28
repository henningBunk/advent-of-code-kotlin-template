package day23

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 23
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay23Part1, ::solveDay23Part2)
}


fun solveDay23Part1(input: List<String>): Int {
    TODO()
}

fun solveDay23Part2(input: List<String>): Int {
    TODO()
}