package com.example.myapplication

fun helloUser(name : String) : String{
    return name

}
fun sommeDeuxNombre(a : Int , b : Int) : Int{
    return  a+b
}
fun maxOfThree(n1: Int , n2 : Int , n3 : Int) : Int {
    var max1 :Int = 0
    if (n1 > n2 && n1 > n3){
        max1 = n1
    }else if (n2 > n1 && n2 > n3){
        max1 = n2
    }else{
        max1 = n3
    }
    return  max1
}
fun isPositive(numbrr : Int): Boolean{
    if(numbrr > 0){
        return true
    }else{
        return false
    }

}
fun NoteToMention(note : Int){
    return when (note){
        in 0..9 -> println("Echec")
        in 10..13 -> println("Passable")
        in 14..16 -> println("Bien")
        in 17..20 -> println("Excelent")
        else -> print("error")
    }
}

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

 // les founction :
println("exercice 1  function : ")
    println("Bounjour +"+helloUser("tarik")+", bienvenue dans kotlin")
    println("la somme c'est : "+sommeDeuxNombre(5 , 10))
    println("le max c'est :"+maxOfThree(5,7,2))
    println("le nombre c'est "+isPositive(0))
// when
    println("entre un nommbre entre 1 et 7 : ")
    var jour : Int =readLine()!!.toInt()
    when(jour){
        1 -> println("lundi")
        2 -> println("Mardi")
        3 -> println("Mercredi")
        4 -> println("Jeudi")
        5 -> println("Vendredi")
        6 -> println("Samedi")
        7 -> println("Dimanche")
        else -> println("en ne trouve pas se jour")
    }
    println("votre niveau est :"+NoteToMention(10))











}