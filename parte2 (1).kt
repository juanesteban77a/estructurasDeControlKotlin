//Condicionales dobles
//Funciona de la misma manera que el anterior, solo que 
//estas estructuras permiten no solo ejecutar una determinada acción
//cuando se cumple determinada condición, sino que en caso 
//de que la condición no se cumpla, brinda otro camino para realizar
//acciones diferentes.

//primero creamos una funcion llamada main
fun main() {
//solicitamos al usuario quie ingrese la edad
    println("Ingrese la edad:")
//optenemos el valor ingresado y lo almacenamos en la variable "edad"
    val edad = readLine()!!.toInt()
//aqui entra la condicion y es si la edad es menor a 18
//la persona es menor de edad
//si no se cumple es menor de edad y por ultimo imprimimos la edad
    if (edad < 18) {
    println("La persona es menor de edad")
    } else {
    println("La persona es mayor de edad")
    }
    println("La edad es: $edad")
    }