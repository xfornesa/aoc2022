package day06

import org.junit.jupiter.api.Test
import util.InputReader
import kotlin.test.Ignore
import kotlin.test.assertEquals
import day06.solveProblem01 as solveProblem01
import day06.solveProblem02 as solveProblem02

internal class ProblemTest {

    @Test
    internal fun testExample01() {
        assertEquals(7, solveProblem01(InputReader.asListOfStrings("day06/input01-example.txt")))
    }

    @Test
    internal fun testProblem01() {
        assertEquals(1802, solveProblem01(InputReader.asListOfStrings("day06/input01.txt")))
    }

    @Test
    internal fun testExample02() {
        assertEquals(19, solveProblem02(InputReader.asListOfStrings("day06/input01-example.txt")))
    }

    @Test
    internal fun testProblem02() {
        assertEquals(3551, solveProblem02(InputReader.asListOfStrings("day06/input01.txt")))
    }
}
