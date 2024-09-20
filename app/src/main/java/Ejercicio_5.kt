fun main(){
    println("¿Cómo es el clima de hoy? ")
    var numero=readLine()!!.toInt() // Declaramos la variable numero para luego utilizarlo en el when

    when(numero!!){ // Dependiendo del numero que elija, imprimirá lo que aparece abajo, "!!" significa que no puede ser nulo
        1 -> println("Soleado")
        2 -> println("Nublado")
        3 -> println("Lluvioso")
        4 -> println("Tormentoso")
        5 -> println("Nevado")
        else -> println("Pregúntale a Google")
    }
}
