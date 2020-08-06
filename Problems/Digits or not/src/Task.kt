

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputStr = scanner.nextLine()
    var tempString = ""


    print("${inputStr[0].isDigit()}\\${inputStr[2].isDigit()}\\${inputStr[4].isDigit()}\\${inputStr[6].isDigit()}")
}