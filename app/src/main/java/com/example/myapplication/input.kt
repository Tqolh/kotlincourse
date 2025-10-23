package com.example.myapplication
fun main(){
    // Input  and condition in Kotlin
//exercice : 1
    println("exercice 1")
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
    println("exercice 2 ")
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
    println("exerccice 3")
    print("donne un nombre : ")
    var n : Int = readLine()!!.toInt()
    print ("donne le deuxeme nombre :")
    var n1 : Int = readLine()!!.toInt()
    var max : Int = if(n>n1) n else n1 // expression if
    println("le max c'est : $max")

// exercie : 4
    println("exercice 4")
    print("entre vore Name :")
    var namme : String = readLine()!!
    print("entre votre age :")
    var aage : Int = readLine()!!.toInt()
    var nextage : Int = aage + 1
    println("Hello $namme , next year you will be $nextage years old")
}