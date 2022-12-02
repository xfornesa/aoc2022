package day02

import org.junit.jupiter.api.Test
import util.InputReader
import kotlin.test.assertEquals
import day02.solveProblem01 as solveProblem01
import day02.solveProblem02 as solveProblem02

internal class ProblemTest {

    @Test
    internal fun testExample01() {
        assertEquals(15, solveProblem01(InputReader.asListOfPairsStringString("day02/input01-example.txt")))
    }

    @Test
    internal fun testProblem01() {
        assertEquals(12586, solveProblem01(InputReader.asListOfPairsStringString("day02/input01.txt")))
    }

    @Test
    internal fun testExample02() {
        assertEquals(12, solveProblem02(InputReader.asListOfPairsStringString("day02/input01-example.txt")))
    }

    @Test
    internal fun testProblem02() {
        assertEquals(13193, solveProblem02(InputReader.asListOfPairsStringString("day02/input01.txt")))
    }
}
