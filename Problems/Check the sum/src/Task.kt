import java.util.Scanner

fun main(args: Array<String>) {
    var outPut:Boolean
    val scanner = Scanner(System.`in`)
    var firstNum = scanner.nextInt()
    var secondNum = scanner.nextInt()
    var thirdNum = scanner.nextInt()
    val listOfNumbers = listOf(firstNum, secondNum, thirdNum)

    for(number in listOfNumbers){
    when(subtractFrom20(number)){
        firstNumber-> outPut=true
        thirdNumber-> outPut=true
        secondNumber-> outPut=true
    }


    }

    fun subtractFrom20(number:Int){
        return 20 - number

    }

}
