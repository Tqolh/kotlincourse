package com.example.myapplication

fun main(){
    // Les Boucles : " For , While , Do While"
// exercice 1 :
    println("exercice 1")

    for ( i in 1 .. 10){
        println("i = $i")
    }
// exercice 2 :
    println("exercice 2 ")
    for ( i in 1 .. 20){
        if(i % 2 == 0){
            println("i = $i")
        }
    }
// exxercice 3 :

    println("exerccice 3")
    println("entre le nombre pour table de multiple : ")
    var nombre : Int = readLine()!!.toInt()
    for (i in 1..10){
        println("$nombre * $i = ${nombre * i }")
    }
// exercice 4 :
    println("exercice 4")
    println("entre un nombre : ")
    var c : Int = readLine()!!.toInt()
    var s :Int = 0
    for (i in c downTo 1) {
        println(i)
        s=s+i
    }
    println("la somme c'est : $s")

// exercice 5 :
    println("exercice 5 ")
    println("entre un nombre")
    var nom : Int = readLine()!!.toInt()
    var somme : Int =0
    for (i in 1.. nom step 2) {
        somme = somme + i
    }
    println("la somme c'est : $somme")
    println("exercice")
    println("entre un nombre ::::::")
    var va : Int = readLine()!!.toInt()
    var fac : Int =1
    for (i in 1 .. va ) {
        fac *= i
    }
    println("la fac c'est : $fac")
}