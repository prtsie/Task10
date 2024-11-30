fun main() {
    print("Элементы массива через запятую >>>")
    val first = readln().split(",").map { s -> s.toInt() }
    val startTime = System.nanoTime()
    val result = first.count() != first.distinct().count()
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    println("Результат: $result")
}