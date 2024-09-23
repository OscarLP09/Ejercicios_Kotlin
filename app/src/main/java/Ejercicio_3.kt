fun main(){
    val peliculas = listOf<String>("" +
            "Jumanji", "Pulp Fiction", "Batman: El caballero de la noche", "Kill Bill")
    var largo = peliculas.maxByOrNull { it.length}
    println("$largo")

}