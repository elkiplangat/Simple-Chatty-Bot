import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var firstNum = scanner.nextLine()
    var secondNum = scanner.nextLine()
    if (firstNum.equals(secondNum, true)) {
        print("true")
    } else print("false")

}