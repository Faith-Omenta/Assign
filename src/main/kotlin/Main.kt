fun main() {
    println("hello,world")
    greetings()
}
fun greetings(){
    println("good morning")

    var name=("Faith")
    println(name)
    var age=(45)
    println(age)
    var phoneNumber=("0746807381")
    println(phoneNumber)
    var weight=(88.3)
    println(weight)
    var isKenyan=true
    var citizen=("Kenyan")
    println(citizen)

    person("Glenah")

    println(modulus(73,4))

    println(addition(43,54,65,76))

    println(multiply(23,26))

    println(subract(786,543))

    fact("I love my family")

    var X=text("Melvin",25)
    println(X)

    var s=text("Faith")
    var z=text ("Glenah")

    students("Vinny","Robin","Riaga","chris")

    cities()

}
//VARIABLES AND DATATYPE
//You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number, weight in kg and citizen. For the
//citizen field you will track whether a student is a Kenyan or not.

//Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g
//given “Ada” it will print out “Hello Ada” (2 points)
fun person(name:String){
    println("Hello " +name)
}
//Create and invoke a function that given 2 numbers returns the remainder of their
//division (3 points)
fun modulus(num:Int,num1:Int):Int{
    var remainder=num%num1
    return remainder
}
//Create and invoke function that returns the sum of any given 4 numbers (3 points)
fun addition(num2:Int,num3:Int,num4:Int,num5:Int):Int{
    var sum=num2+num3+num4+num5
    return sum
}
fun multiply(num6:Int,num7:Int):Int{
    var product=num6*num7
    return product

}
fun subract(num8:Int,num9:Int):Int{
    var sub=num8-num9
    return sub
}
//Create and invoke a function that prints out an interesting fact about yourself
fun fact(sentence:String){
    println(sentence)
}
fun text(name:String,years:Int):String{
    var text="Hi! my name is $name and i am $years years old"
    return text
}
fun text(name:String){
    var names="Faith"
    if(name.equals(names)){
        println("That's me!")
    }else{
        println("I don't know who that is")
    }
}
fun students(name1:String,name2:String,name3:String,name4:String){
    println(arrayOf(name1,name2,name3,name4).contentToString())
}
fun cities(){
    var cities=arrayOf("kenya","uganda","tanzania","rwanda")
    for(city in cities){
        println(city.capitalize())
    }
}

