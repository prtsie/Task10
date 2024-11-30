fun main() {
    print("Элементы массива через запятую >>>")
    val first = readln().split(",").map { s -> s.toInt() }
    val startTime = System.nanoTime()
    var result = 0
    for (num in first.distinct()) {
        if (first.count {n -> n == num} > first.count() / 2) {
            result = num;
            break;
        }
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    println("Результат: $result")
}