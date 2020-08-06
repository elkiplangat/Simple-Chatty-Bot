import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
   val students = scanner.nextInt()

    var grades = mutableMapOf<Char, Int>('D' to 0,'B' to 0,'B' to 0,'A' to 0 )

    repeat(students){
       when(scanner.nextInt()){
           2 -> {var value = grades['D']?:0
                    grades['D'] = value+1 }
           3 -> {var value = grades['C']?:0
               grades['C'] = value+1 }
           4 -> {var value = grades['B']?:0
               grades['B'] = value+1 }
           5 -> {var value = grades['A']?:0
               grades['A'] = value+1 }

       }

        print(Long.MAX_VALUE)
    }
    print("${grades['D']} ${grades['C']} ${grades['B']} ${grades['A']}")
}