//while
//Este ciclo hace uso de una condición en la que se valida la condición de parada, 
//si esta condición es verdadera entonces se
//ingresa al ciclo repitiendose hasta que la condición sea Falsa y el ciclo termine.

//creamos la funcion main
fun main() {
//creamos dos variables, una de tipo entero y otra de tipo string
    var numero: Int
    var continuar = "si"
    //entramos a la condicion si el valor ingresado es si continua 
    while (continuar.uppercase() == "SI"){
        //pedimos un numero
    print("Ingrese un número: ")
    //capturamos el valor en la variable numero
    numero = readLine()!!.toInt()
    //entramos a la condicion y se hace la condicion para
    //asignar un valor positivo
    if (numero < 0) {
    numero = numero * -1
    }
    //imprime el numero positivo
    println("El número positivo es: $numero")
    //pregunta si quiere seguir ingresadon un numero
    print("¿Desea ingresar otro número? (si/no): ")
    //aqui almacena el valor ingresado y como dioje anteriormente 
    //si el valor es si continua de lo contrario termina
    continuar = readLine()!!
    }
    }
    
    