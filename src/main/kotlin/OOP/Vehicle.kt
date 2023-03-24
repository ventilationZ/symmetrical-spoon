package OOP

class Vehicle (owner:String,colour:String,wheels:Int, model:String){
    init {


        println("Owned is $owner")
        println("Colour is $colour")
        println("Has $wheels in total")
        println("Model is $model")
    }
}

fun main(args: Array<String>) {
    var owner_one =Vehicle("Sharon","White",4,"Corrola")
    var owner_two =Vehicle("Shanice","Grey",4,"Camry")
    var owner_three =Vehicle("Shallom","Blue",4,"Cora")
    var owner_four =Vehicle("Sheldon","Yellow",4,"Carla")
}