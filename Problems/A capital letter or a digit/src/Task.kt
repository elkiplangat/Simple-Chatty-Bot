import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val character = scanner.nextLine()
    print("${character[0] in '\u0031'..'\u0039' || character[0].isUpperCase()}")
}