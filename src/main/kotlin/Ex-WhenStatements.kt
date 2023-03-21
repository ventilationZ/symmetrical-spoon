fun main(args: Array<String>) {
    println("Enter Number To Select")

    var nunez:Int = readLine()!!.toInt()
    when (nunez){
        0-> println("Confirm purchase of :Sh20 =1GB for 1hr")
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly Bundles")
        4-> println("Go Monthly")
        5-> println("No Expiry")
        6-> println("Video Bundles")
        7-> println("Okoa Data")
        8-> println("Lipa Mdogo")
        9-> println("Data Plus NEW")
        10-> println("Hot Minutes")
        98-> println("MORE")

        else -> println("Invalid Option")




    }

}