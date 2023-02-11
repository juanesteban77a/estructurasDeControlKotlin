///Condicionales simples
//Se evalúa una sola condición, si no se cumple la condición no se efectúa ningún proceso 
//y si se cumple realiza la acción
//correspondiente.,

//Creamos una funcion llamada main
fun main(args: Array<String>) {
//aqui se crea una variable
var prom=0.0
//en este punto se pide al usuario que ingrese el nombre
print("Ingrese el nombre del estudiante: ")
//aqui tomamos el valor que ingrese el usuario y lo almacenamos en la variable "nombre"
var nombre:String?=readLine()
//tambien pedimos la nota1
print("Ingrese la nota 1: ")
//y  almacenamos el valor ingresado en la variable "n1"
var n1=readLine()!!.toDouble()
//tambien pedimos la nota2
print("Ingrese la nota 2: ")
//y almacenamos el valor ingresado en la variable "n2"
var n2=readLine()!!.toDouble()
//tambien pedimos la nota3
print("Ingrese la nota 3: ")
//y almacenamos el valor ingresado en la variable "n3"
var n3=readLine()!!.toDouble()
//aqui lo que hacemos es hacer el procedimiento de sacar el promedio de las tres notas
prom=(n1+n2+n3)/3
//y imprimimos el promedio
println("El promedio es $prom")
//Aqui hacemos una condicion y es que si el promedio es mayor o igual a 3
//gana la materia de lo contrario pierde la materia
if(prom>=3.0){
println("Gana la materia")
}else{
println("Pierde la materia")
}
}

