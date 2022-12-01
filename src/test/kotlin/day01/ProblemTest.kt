package day01

import org.junit.jupiter.api.Test
import util.InputReader
import kotlin.test.assertEquals
import day01.solveProblem01 as solveProblem01
import day01.solveProblem02 as solveProblem02

internal class ProblemTest {

    @Test
    internal fun testExample01() {
        assertEquals(24000, solveProblem01(InputReader.asListOfStrings("day01/input01-example.txt")))
    }

    @Test
    internal fun testProblem01() {
        assertEquals(68775, solveProblem01(InputReader.asListOfStrings("day01/input01.txt")))
    }

    @Test
    internal fun testExample02() {
        assertEquals(45000, solveProblem02(InputReader.asListOfStrings("day01/input01-example.txt")))
    }

    @Test
    internal fun testProblem02() {
        assertEquals(202585, solveProblem02(InputReader.asListOfStrings("day01/input01.txt")))
    }
}
