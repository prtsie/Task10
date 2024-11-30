fun main() {
    print("Элементы массива через запятую >>>")
    val first = readln().split(",").map { s -> s.toInt() }
    print("target >>>")
    val target = readln().toInt()
    val startTime = System.nanoTime()
    val result = MutableList<Int>(0) { _ -> 0 }
    for (index in first.indices) {
        for (index2 in first.indices) {
            if (index == index2) {
                continue
            }
            if (first[index] + first[index2] == target) {
                result.add(index)
                result.add(index2)
            }
        }
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