fun main(){
    println("Distancia del conductor en km: ")

    var conductor = readLine()?.toInt()
    println("Disponibilidad: ")
    var disponible = readLine().toBoolean()

    if (conductor != null) {
        if (conductor <= 0.5 && disponible == true){
            println("Listo para iniciar recorrido")
        }else if (conductor <= 0.5 && disponible == false) {
            println("Conductor cercano, pero no disponible")

        }else if (conductor > 0.5 && disponible == true){
            println("Conductor disponible pero muy lejos, aplicarán a tarifas más altas")
        }else if (conductor > 0.5 && disponible == false){
            println("No hay conductores disponibles")
        }else{
            println("Introduce números válidos")
        }
    }
}