//Condicionales múltiples con when
//La estructura when en Kotlin es una estructura de control de flujo que funciona como un switch case en otros lenguajes de
//programación. Se utiliza para evaluar una expresión y ejecutar un bloque de código específico en función del valor de la expresión

//creamos una funcion
fun checkNumber() {
    //creamos una variable con un valor negativo
    var num=-8  
    //se ejecuta  when (cuando) en base al valor de la variable num
    //ejecutando las condiciones
    when (num) {
    //si el valor de la variable es cero engra a el primer caso
    0 -> println("El número es 0")
    //si el numero es 1,2 o 3 entra en el segundo caso
    1, 2, 3 -> println("El número está entre 1 y 3")
    //si el numero es del 4  hasta el 10 entra en el tercer caso
    in 4..10 -> println("El número está entre 4 y 10")
    //si no se culple ninguna de estas entra a la condicion else que es cuando no se cumple ninguna
    else -> println("El número no se encuentra")
    }
    }
    