package OOP

class House(owner:String,price:Int,bedrooms:Int) {
    init {
        println("Owner Is $owner")
        println("The asking price Is $price")
        println("It has $bedrooms bedrooms")
    }
}
fun main(args: Array<String>) {
    var house_one =House("Sharon",10019000,2)
    var house_two =House("Shanice",189900,4)
    var house_three =House("Shallom",1300000,4)
    var house_four =House("Sheldon",2000000,4)
}