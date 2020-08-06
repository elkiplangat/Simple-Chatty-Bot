import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val color = input.nextLine()

    val colorArray = Rainbow.values()
        for (tempcolor in colorArray){
            if (color.equals(tempcolor)){
                println("Color found")
            }
        }

}

enum class Rainbow{
    RED,ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}