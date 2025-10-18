import kotlin.Int
import kotlin.collections.MutableList

class Liste() {
    val list : MutableList<Int> = mutableListOf()
    fun remremplirList(){
        for (i in 0..10){
            list.add(i)
        }
    }
    fun getMax() : Int {
       var max = list[0]
        for (elc in list){
            if(max < elc){
                max = elc            }
        }
        return  max
    }
    fun getNbrimPair():List<Int>{
        var nvlist : MutableList<Int> = mutableListOf()
        for(impair in list){
            if(impair % 2 != 0){
                nvlist.add(impair)
            }
        }
        return nvlist
    }
    fun getNbrPair():List<Int>{
        var nvlist : MutableList<Int> = mutableListOf()
        for(pair in list){
            if(pair % 2 == 0){
                nvlist.add(pair)
            }
        }
        return nvlist
    }

    fun getNbrPremier():MutableList<Int>{
        var nouvList : MutableList<Int> = mutableListOf()
        for (elt in list){
            if(estPremier(elt) ){
                nouvList.add(elt)
            }
        }
        return nouvList
    }

    private fun estPremier(elt: Int): Boolean {

        for (i in 2..elt-1){
            if(elt % i == 0){
                return false
            }
        }

        return true
    }

}
fun main() {
    val list2 = Liste()
    val list1 = Liste()
    list2.remremplirList()
    list1.remremplirList()
    println("list c'est  : ${list1.list}")
    println("le max c'est: ${list1.getMax()}")
    println("les nbpair c'est : ${list1.getNbrPair()}")
    println("les nbimpair c'est : ${list1.getNbrimPair()}")
    println("les nombre premier :${list1.getNbrPremier()}")
}


