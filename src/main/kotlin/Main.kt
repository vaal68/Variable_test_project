fun main() {
    println("Введите длину: ")
    val length = readLine()!!.toInt()
    println("Введите ширину: ")
    val width = readLine()!!.toInt()
    println("Введите высоту: ")
    val height = readLine()!!.toInt()
    val volume = length * width * height
    println("Объем равен: $volume")
}