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