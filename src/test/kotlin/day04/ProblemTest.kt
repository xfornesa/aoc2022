package day04

import org.junit.jupiter.api.Test
import util.InputReader
import kotlin.test.Ignore
import kotlin.test.assertEquals
import day04.solveProblem01 as solveProblem01
import day04.solveProblem02 as solveProblem02

internal class ProblemTest {

    @Test
    internal fun testExample01() {
        assertEquals(2, solveProblem01(InputReader.asListOfStrings("day04/input01-example.txt")))
    }

    @Test
    internal fun testProblem01() {
        // < 548
        assertEquals(498, solveProblem01(InputReader.asListOfStrings("day04/input01.txt")))
    }

    @Test
    internal fun testExample02() {
        assertEquals(4, solveProblem02(InputReader.asListOfStrings("day04/input01-example.txt")))
    }

    @Test
    internal fun testProblem02() {
        assertEquals(859, solveProblem02(InputReader.asListOfStrings("day04/input01.txt")))
    }
}
