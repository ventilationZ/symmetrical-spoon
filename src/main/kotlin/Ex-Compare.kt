fun main(args: Array<String>) {
    println("Enter Option To Select")
    println("0:Sh20 =1GB for 1hr")
    println("1:Data Deals")
    println("2:Daily Bundles")
    println("3:Weekly Bundles")
    println("4:Go Monthly")
    println("5:No Expiry")
    println("6:Video Bundles")
    println("7:Okoa Data")
    println("8:Lipa Mdogo")
    println("9:Data Plus NEW")
    println("10:Hot Minutes")
    println("98:MORE")
    var num:Int = readLine()!!.toInt()
    if (num ==0){
        print("Confirm purchase of :Sh20 =1GB for 1hr")
        println("Pay with")
        println("1:Mpesa")
        println("2:Airtime")

        var opt1:Int = readLine()!!.toInt()
        if (opt1 ==1){
            print("Enter Your Mpesa PIN")

        }
        else if (opt1 ==2){
            print("Enter Your Service PIN")

        }
        else{
            print("Invalid Characters")
        }
    }
    else if(num ==1){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt1:Int = readLine()!!.toInt()
    }
    else if(num ==2){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt1:Int = readLine()!!.toInt()
    }
    else if(num ==3){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt1:Int = readLine()!!.toInt()
    }
    else if(num ==4){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt1:Int = readLine()!!.toInt()
    }
    else if(num ==5){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt1:Int = readLine()!!.toInt()
    }
    else if(num ==6){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt1:Int = readLine()!!.toInt()
    }
    else if(num ==7){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt7:Int = readLine()!!.toInt()
    }
    else if(num ==8){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt8:Int = readLine()!!.toInt()
    }
    else if(num ==9){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt9:Int = readLine()!!.toInt()
    }
    else if(num ==10){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt10:Int = readLine()!!.toInt()
    }
    else if(num ==98){
        println("1:Data Deals")
        println("2:Daily Bundles")
        println("3:Weekly Bundles")
        println("4:Go Monthly")
        println("5:No Expiry")

        var opt98:Int = readLine()!!.toInt()
    }
    else {
        print("Invalid Characters")
    }
}