//For
//El ciclo for es una estructura de control de bucle en Kotlin 
//que se utiliza para iterar una secuencia de elementos. Por ejemplo,
//puedes usar un ciclo for para recorrer un rango de números, 
//recorrer cada uno de los elementos de una lista, o ejecutar una
//función para cada elemento de una lista

//creamos la funcion main
fun main() {
    //solicitamos la cantuidad de numeros a procecar
    print("Ingrese la cantidad de números a procesar: ")
    //almacenamos la cantidad en la variable cantidad
    val cantidad = readLine()!!.toInt()
    //incrementamos de dos en dos
    for (i in 1..cantidad) {
        //pedimos un numero
    print("Ingrese un número: ")
    //lo almacenamos
    val numero = readLine()!!.toInt()
//entramos a la condicion y hacemos el procedimiento
//para determinar si el numero es divisible de entre 11, la condicion es
//si el numero el modulo es igual a cero es divisbloe entre once
    if (numero % 11 == 0) {
    //imprimimos el numero divisible
    println("El número $numero es divisible entre 11")
    } else {
        //entramos a esta condicion si no se cumple la primera
    println("El número $numero no es divisible entre 11")
    }
    