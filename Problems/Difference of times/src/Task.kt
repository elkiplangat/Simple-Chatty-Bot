import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val hour1 = scanner.nextInt()
    val minute1 = scanner.nextInt()
    val seconds1 =scanner.nextInt()
    val hour2 = scanner.nextInt()
    val minute2 = scanner.nextInt()
    val seconds2 = scanner.nextInt()

    var difference = ((hour2 - hour1)*3600) +((minute2-minute1)*60) +(seconds2-seconds1)

    print(difference)


}