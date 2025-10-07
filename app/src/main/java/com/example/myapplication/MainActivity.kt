// Classe mère
open class Voiture(
    val marque: String,
    val modele: String,
    val matricule: String
) {
    open fun afficherInfo() {
        println("Marque : $marque")
        println("Modèle : $modele")
        println("Matricule : $matricule")
    }
}

// Classe fille
class Camion(
    marque: String,
    modele: String,
    matricule: String,
    val couleur: String
) : Voiture(marque, modele, matricule) {

    override fun afficherInfo() {
        super.afficherInfo()
        println("Couleur : $couleur")
    }
}

// Exemple d'utilisation
fun main() {
    val camion1 = Camion("Mercedes", "Actros", "123-TN-456", "Blanc")
    camion1.afficherInfo()
}
