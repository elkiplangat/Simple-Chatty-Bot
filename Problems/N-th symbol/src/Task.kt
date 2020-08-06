import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val index = scanner.nextInt()
    print("Symbol # $index of the string \"$str\" is '${str[index]}' " )

}