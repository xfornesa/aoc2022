package day03

fun solveProblem01(input: List<String>): Int {
    val commonTypes = mutableListOf<Char>()
    input.forEach {
        val first = it.substring(0 until it.length/2)
        val second = it.substring((it.length / 2) until it.length)
        val commonType = commonType(first, second)
        commonTypes.add(commonType)
    }
    return commonTypes.sumOf { toScore(it) }
}

fun toScore(it: Char): Int {
    return if (it.isLowerCase())
        it.minus('a') + 1
    else
        it.minus('A') + 27
}

fun commonType(first: String, second: String): Char {
    val occurrencesFirst = HashSet<Char>()
    first.forEach {
        occurrencesFirst.add(it)
    }

    val occurrencesSecond = HashSet<Char>()
    second.forEach {
        occurrencesSecond.add(it)
    }

    val common = first.asIterable().toSet() intersect second.asIterable().toSet()
    return common.first()

}

fun solveProblem02(input: List<String>): Int {
    val windowed = input.windowed(3, 3)
    return windowed.map {
        findCommonTypes(it)
    }.sumOf {
        toScore(it)
    }
}

fun findCommonTypes(it: List<String>): Char {
    val (first, second, third) = it

    val occurrencesFirst = HashSet<Char>()
    first.forEach {
        occurrencesFirst.add(it)
    }

    val occurrencesSecond = HashSet<Char>()
    second.forEach {
        occurrencesSecond.add(it)
    }

    val occurrencesThird = HashSet<Char>()
    third.forEach {
        occurrencesThird.add(it)
    }

    val common = first.toSet() intersect second.toSet() intersect third.toSet()

    return common.first()
}
