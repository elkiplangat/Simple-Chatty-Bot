fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(totalPrice(house))
}
fun totalPrice(house: House):Int{
   val tempPrice =  when{
        house.price <0 -> 0
        house.price >1_000_000 -> 1_000_000
       else -> house.price
    }
    return when{
          house.rooms <= 1 -> (tempPrice*1.0).toInt() //Cabin
          house.rooms in  2..3 -> (tempPrice*1.2).toInt() //Bungalow
          house.rooms == 4 -> (tempPrice*1.25).toInt() //Cottage
          house.rooms in 5..7 -> (tempPrice*1.4).toInt() //Mansion
          house.rooms in 8..10 ->(tempPrice * 1.6).toInt() //Palace
        else -> (tempPrice * 1.6).toInt()
    }
}
class House(val rooms: Int, val price: Int) { }