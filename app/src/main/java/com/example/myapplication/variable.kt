package com.example.myapplication

fun main(){
// ---------------------------
// 1. Variables de base
// ---------------------------
    val Name : String = "Tarik Oulehiane" // val = mkn9drouche nbdelo 9ima ta3ha
    var Age : Int = 20 // var = n9dero nbdelo 9ima ta3ha
    println("You username is : $Name")
    println("your age is : $Age")
    Age = 21
    println("you change your age, your age is : $Age")


// -------------------------------
// 2. Opérations arithmétiques :
// " + , - , * , / , % "
// -------------------------------
    var nb1 :Int = 10
    var nb2 :Int = 5
    println("$nb1 + $nb2 = $nb1 + $nb2")
    println("$nb1 - $nb2 = $nb1 - $nb2")
    println("$nb1 * $nb2 = $nb1 * $nb2}")
    println("$nb1 / $nb2 = $nb1 / $nb2")
    println("$nb1 % $nb2 = $nb1 % $nb2")



// -------------------------------------------
// 3. Data Types :
// " Boolean , Int , Double , String , char "
// -------------------------------------------
    val name : String = "tarik"
    var age : Int = 21
    var annoyance : Double = 15.15
    var letter : Char = '$'
    var student : Boolean = true

    println("\n My name is : $name , I'm : $age , I get last years  : $annoyance , my favorite character is : $letter , I'm Student : $student")
// Input in Kotlin
//exercice : 1
    println("entre un nombre :")
    var nb  = readLine()!!.toInt()
    if (nb > 0){
        println("le nombre est positife")
    }else if (nb < 0){
        println("le nombre est nigative")
    }else{
        println("le nombre egal 0 ")
    }
//exercice : 2
    println("entre votre age :")
    var agge : Int = readLine()!!.toInt()
    if (agge < 13){
        print("you are child")
    }else if (agge >= 13 && agge < 17){
        println("You are a teenager")
    }else{
        println("Your are an adult")
    }
// exercice : 3
    print("donne un nombre : ")
    var n : Int = readLine()!!.toInt()
    print ("donne le deuxeme nombre :")
    var n1 : Int = readLine()!!.toInt()
    var max : Int = if(n>n1) n else n1
    println("le max c'est : $max")

// exercie : 4
    print("entre vore Name :")
    var namme : String = readLine()!!
    print("entre votre age :")
    var aage : Int = readLine()!!.toInt()
    var nextage : Int = aage + 1
    println("Hello $namme , next year you will be $nextage years old")







}