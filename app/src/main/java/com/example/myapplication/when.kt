package com.example.myapplication

fun NoteToMention(note : Int){
    return when (note){
        in 0..9 -> println("Echec")
        in 10..13 -> println("Passable")
        in 14..16 -> println("Bien")
        in 17..20 -> println("Excelent")
        else -> print("error")
    }
}
fun main (){
    // when
    println("votre niveau est :"+NoteToMention(10))
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

}