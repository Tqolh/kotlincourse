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

fun main(){
    // les founction :
    println("exercice 1  function : ")
    println("Bounjour "+helloUser("tarik")+", bienvenue dans kotlin")
    println("la somme c'est : "+sommeDeuxNombre(5 , 10))
    println("le max c'est :"+maxOfThree(5,7,2))
    println("le nombre c'est positive : "+isPositive(0))
}