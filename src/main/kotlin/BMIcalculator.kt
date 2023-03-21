fun main(args: Array<String>) {
    println(" Enter your body height in meters")
    var bodyheightinmeters: Float = readLine()!!.toFloat()
    println(" Enter your body weight in kilograms")
    var bodyweightinkg:Int = readLine()!!.toInt()
    var heightsquared =bodyheightinmeters*bodyheightinmeters
    var BMI =bodyweightinkg/heightsquared
    var message ="Your BMI Index is "
    print(message)
    print(BMI)
    if (BMI <= 17){
        println(" You are Underweight")
    }
    else if (BMI <= 27){
        println(" You are in Normal weight")
    }
    else if (BMI <= 37){
        println(" You are Overweight")
    }
    else {
        println(" You are Obese")
    }

}