package day11

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class Day11Test : FreeSpec({

    val sampleInput: List<String> = listOf(
    )

    val sampleSolutionPart1: Int = -1

    val sampleSolutionPart2: Int = -1

    "Solving day 11" - {
        "part 1 for the sample input should return the correct output" {
            solveDay11Part1(sampleInput) shouldBe sampleSolutionPart1
        }

        "part 2 for the sample input should return the correct output" {
            solveDay11Part2(sampleInput) shouldBe sampleSolutionPart2
        }
    }
})