import kotlin.math.pow

fun main() {
    print("Элементы массива через запятую >>>")
    val first = readln().split(",").map { s -> s.toInt() }
    print("k >>>")
    val k = readln().toInt()
    val startTime = System.nanoTime()
    var result = false
    for (i in 0..<(first.count() - 1 )) {
        for (j in (i + 1)..<first.count()) {
            if (j - i > k) {
                break;
            }
            if (first[i] == first[j]) {
                result = true;
            }
        }
        if (result) {
            break;
        }
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: %.4f мс".format(elapsedTime / 10.0.pow(6)))
    println("Результат: $result")
}