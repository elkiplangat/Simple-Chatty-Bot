import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var class1 = scanner.nextInt()
    var class2 = scanner.nextInt()
    var class3 = scanner.nextInt()

    val additionalSeats = (class1%2)+(class2%2)+(class3%2)
    val seats = (class1/2)+(class2/2)+(class3/2)
    print(seats+additionalSeats)


}
