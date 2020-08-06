import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val name = scanner.nextLine()
    greet(name)
}
fun greet(name:String):Unit{
    if (name == "HIDDEN"){
        print("Hello, secret user!")
    }
    else
        print("Hello, $name!")
}