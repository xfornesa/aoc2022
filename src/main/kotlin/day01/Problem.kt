package day01

fun solveProblem01(input: List<String>): Int {
    var calories = 0
    var maxCalories = 0
    input.forEach {
        if (it == "") {
            maxCalories = maxOf(maxCalories, calories)
            calories = 0
        } else {
            calories += it.toInt()
        }
    }
    maxCalories = maxOf(maxCalories, calories)

    return maxCalories
}

fun solveProblem02(input: List<String>): Int {
    var calories = 0
    val caloriesPerElf = mutableListOf<Int>()
    input.forEach {
        if (it == "") {
            caloriesPerElf.add(calories)
            calories = 0
        } else {
            calories += it.toInt()
        }
    }
    caloriesPerElf.add(calories)

    return caloriesPerElf.sorted().reversed().take(3).sum()
}
