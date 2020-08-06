import java.util.Scanner

fun main(args: Array<String>) {
    var foundPositive:Boolean =false
    var canContinue:Boolean = true
    var positiveCounter = 0
    val scanner = Scanner(System.`in`)
    val firstNum = scanner.nextInt()
    val secondNum = scanner.nextInt()
    val thirdNum = scanner.nextInt()

    if (firstNum>0 ){
        positiveCounter++
    }
    if (secondNum>0){

        positiveCounter++

    }
    if(thirdNum>0){

        positiveCounter++
    }

    print(positiveCounter==1)


}