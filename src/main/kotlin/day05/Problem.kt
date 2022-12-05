package day05

import java.util.*

fun solveProblem01(input: List<String>): String {
    val stackInput = Stack<String>()
    val movements = mutableListOf<String>()
    var stackHalf = true
    for (value in input) {
        if (value.isEmpty()) {
            stackHalf = false
            continue
        }
        if (stackHalf) {
            stackInput.push(value)
        } else {
            movements.add(value)
        }
    }

    val stacks = buildInitialStack(stackInput)
    for (movement in movements) {
        val (num, from, to) = parseMovement(movement)
        repeat(num) {
            val value = stacks[from]?.pop()
            stacks[to]?.push(value)
        }
    }
    return (1..stacks.size)
        .mapNotNull { stacks[it]?.pop() }
        .joinToString("")
}

fun parseMovement(movement: String): List<Int> {
    val regex = """move (\d+) from (\d+) to (\d+)""".toRegex()
    val matchResult = regex.find(movement)
    val destructured = matchResult!!.destructured
    return destructured.toList().map { it.toInt() }
}

fun buildInitialStack(stackInput: Stack<String>): MutableMap<Int, Stack<String>> {
    val result = mutableMapOf<Int, Stack<String>>()
    val keys = stackInput
        .pop()
        .trim().split("\\s+".toRegex())
        .map {
            it.toInt()
        }
    keys
        .forEach {
            result[it] = Stack<String>()
        }
    val rowLength = keys.count()*4 - 1
    for (value in stackInput.reversed()) {
        val row = value.padEnd(rowLength)
        row.asSequence()
            .windowed(3, 4)
            .forEachIndexed { index, letters ->
                val letter = letters.filter { it.isLetter() }.joinToString("")
                if (letter.isNotBlank()) {
                    result[index+1]?.push(letter)
                }
            }
    }

    return result
}

fun solveProblem02(input: List<String>): String {
    val stackInput = Stack<String>()
    val movements = mutableListOf<String>()
    var stackHalf = true
    for (value in input) {
        if (value.isEmpty()) {
            stackHalf = false
            continue
        }
        if (stackHalf) {
            stackInput.push(value)
        } else {
            movements.add(value)
        }
    }

    val stacks = buildInitialStack(stackInput)
    for (movement in movements) {
        val (num, from, to) = parseMovement(movement)
        val temp = Stack<String>()
        repeat(num) {
            val value = stacks[from]?.pop()
            temp.push(value)
        }
        repeat(num) {
            val value = temp.pop()
            stacks[to]?.push(value)
        }
    }
    return (1..stacks.size)
        .mapNotNull { stacks[it]?.pop() }
        .joinToString("")
}
