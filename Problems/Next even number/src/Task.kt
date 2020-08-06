import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var number = scanner.nextInt()
    if (number>0 && number<1000 ){
        if (number%2 == 0){
            print(number+2)
        }
        else
            print(number+1)
    }


}