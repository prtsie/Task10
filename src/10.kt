import kotlin.math.pow

fun main() {
    print("Строка >>>")
    val first = readln()
    val startTime = System.nanoTime()
    var result = 0
    var count = 0
    var substr = MutableList<Char>(0) { _ -> ' ' }
    val strlen = first.length
    var i = 0
    while (i < strlen) {
        if (substr.contains(first[i])) {
            if (count > result) {
                result = count
            }
            count = 0
            substr.clear()
        }
        substr.add(first[i])
        i++
        count++
    }
    if (count > result) {
        result = count
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: %.4f мс".format(elapsedTime / 10.0.pow(6)))
    println("Результат: $result")
}