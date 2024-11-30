fun main() {
    print("Элементы массива через запятую >>>")
    val first = readln().split(",").map { s -> s.toInt() }.sorted()
    val startTime = System.nanoTime()
    var result = 0
    for (i in first.indices) {
        if (i == first.count() - 1) {
            result = i + 1
            break
        }
        if (first[i + 1] - first[i] == 2) {
            result = first[i] + 1;
            break;
        }
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    println("Результат: $result")
}