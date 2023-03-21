fun main(args: Array<String>) {
    print("Enter Your Mean Marks")
    var mrks:Int = readLine()!!.toInt()
    if(mrks >=80){
        print("You Got Grade A ")
    }else if(mrks >=70 ){
        print("You Got Grade B ")
    }
    else if(mrks >=60 ){
        print("You Got Grade C ")
    }
    else if(mrks >=50 ){
        print("You Got Grade C- ")
    }
    else if(mrks >=40 ){
        print("You Got Grade D ")
    }
    else if(mrks >=30 ){
        print("You Got Grade D- ")
    }
    else if(mrks >=0 ){
        print("You Got Grade E You have to repeat the exam")
    }


}