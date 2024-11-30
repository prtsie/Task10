fun main() {
    print("Элементы первого массива через запятую >>>")
    val first = readln().split(",")
    print("Элементы второго массива через запятую >>>")
    val second = readln().split(",")
    val startTime = System.nanoTime()
    val result = MutableList<String>(0) { _ -> "" }
    for (item in first) {
        if (second.contains(item))  {
            result.add(item)
        }
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    println("Результат: ")
    if (result.isEmpty()) {
        println("Ничего не найдено")
    }
    else {
        for (item in result.distinct()) {
            print("$item \t")
        }
    }
}