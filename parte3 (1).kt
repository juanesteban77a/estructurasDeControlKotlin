//Condicionales múltiples (Anidados)
//Cuando se trabaja con condicionales, es muy común encontrar casos en los que después de tomar
// una decisión, se requiera
//seguir un posible camino donde se tengan que implementar nuevas condiciones,
// para esto se aplican las estructuras
//condicionales, donde en cada bloque de SI o SINO, pueden existir nuevas condiciones
// y dentro de estas nuevos procesos y así sucesivamente


//creamos la funcion main
fun main() {
//creamos 4 variables "num1,num2,num3,prom"
    val num1 = 2.0
    val num2 = 1.0
    val num3 = 1.0
//esta variable tiene una funcion y es almacenar y calcular el promedio de las 3 notas
    val prom = (num1 + num2 + num3) / 3
//la primera condicion es que si el priomedio es mayor a 3.5 gana la materia
    if (prom > 3.5) {
        //imprimimos el resultado segun la condicion
    println("Gana la materia")
//entra la otra condicion y es que si el promedio es mayor a 2 puede recuperar
    } else if (prom > 2) {
//imprimimos el resultado de la condicion
    println("Puede recuperar")
//y entra aqui si no se cumple nimguna de las anteriores
    } else {
    println("Perdió la materia")
    }
    }