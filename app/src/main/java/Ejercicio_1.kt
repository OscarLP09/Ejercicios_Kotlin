fun main() {
    print("Introduce la cantidad en miligramos: ")
    var cantidad = readLine()?.toInt() // Declaramos la variable cantidad para guardar el dato introducido por el usuario
    if (cantidad!! > 100){ //Si la cantidad supera los 100 imprimirá un mensaje, si no, imprimirá otro
        println("Felicidades, es una buena poción")
    } else {
        println("La poción es mediocre, sangre sucia inmunda")
    }
}
fun segunda() {
    print("Escribe un número: ")
    var numero = readLine()?.toInt()  //Declaramos ambas variables que nos sirven para guardar el numero del usuario y para alamcenar la sumatoria
    var suma = 0
    for (i in 1..numero!!) { // Bucle for en el que mientras que i esté entre el 1 y el número que haya elegido el usuario, almacene esos números en la sumatoria
        suma += i
    }
    println("La suma es $suma")

    suma=0
    var j=1
    while (numero>0){
        suma+=numero
        numero--
    }
    println("La suma es $suma")
}