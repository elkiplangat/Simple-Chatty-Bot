import java.util.*

val calendar = createCalendar()

fun createCalendar(): Any {
    var calendar = Calendar.getInstance()
    val day = "${calendar.get(Calendar.DAY_OF_MONTH)} ${calendar.get(Calendar.MONTH)} ${calendar.get(Calendar.YEAR)}"
    return day

}
fun selectCurrentDay(calendar: String){
    return 
}

// write your code here