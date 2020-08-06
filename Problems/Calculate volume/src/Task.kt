// write your code here

// do not change code below
fun main() {
    val (length, width, height) = readLine()!!.split(" ").map(String::toInt)

    print("${getVolume(length)} ") // Volume of the stick
    print("${getVolume(length, width)} ") // Volume of the plate
    print("${getVolume(length, width, height)} ") // Volume of the box
}
fun getVolume(length:Int, width:Int = 1, height:Int = 1) = length*width*height