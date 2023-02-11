//do while
//Una sentencia que se ejecuta al menos una vez y 
//es reejecutada cada vez que la condición se evalúa a verdadera. Para ejecutar múltiples sentencias dentro de un bucle

//creamos una variable cpn valor 0
var numero = 5
do {
    //solicitamos que el usuario ingrese un valor
print("Ingrese un número: ")
//capturamos el valor y lo almacenamos en la variable numero
numero = readLine()!!.toInt()
//la condiicon es que si la variable numero es diferente a 5 ingresa a la condiicon
//de lo contrario sigue solicitando un valor
} while (numero != 5)
println("Ha ingresado el número 5.")
