import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val string1 = scanner.nextLine()
    val string2 = scanner.nextLine()
    val string3 = scanner.nextLine()
    val separator = scanner.nextLine()

   print( concatenator(string1, string2, string3, separator))


}
fun concatenator(string1:String, string2:String, string3:String, separator:String = " "):String{
    if (separator == "NO SEPARATOR") {
      val space = " "
    return "$string1$space$string2$space$string3" }
    else
        return "$string1$separator$string2$separator$string3"
}