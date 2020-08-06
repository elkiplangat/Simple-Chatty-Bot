import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt().toString()
    print(number.substring(number.length-1))

}