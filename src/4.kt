fun main() {
    print("Элементы массива через запятую >>>")
    val first = readln().split(",").map { s -> s.toInt() }
    val startTime = System.nanoTime()
    val result = MutableList<Int>(0) { _ -> 0 }
    for (index in first.indices) {
        result.add(first.count {num -> num < first[index]})
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    println("Результат: ")
    if (result.isEmpty()) {
        println("Ничего не найдено")
    }
    else {
        for (item in result) {
            print("$item \t")
        }
    }
}