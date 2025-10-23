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