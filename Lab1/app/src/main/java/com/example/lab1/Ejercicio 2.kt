package com.example.lab1

class calculadora(
    val marca: String,
    val anhosVida: Int,
    var precio: Double
){
    fun sumar(x: Double, y: Double): Double{
        return x + y
    }
    fun restar(x: Double, y: Double): Double{
        return x - y
    }
    fun multiplicar(x: Double, y: Double): Double{
        return x * y
    }
    fun dividir(x: Double, y: Double): Double{
        if (y == 0.0){
            throw ArithmeticException("No es posible dividir entre 0")
        }else{
            return x / y
        }
    }

    }
fun main() {
    val calc = calculadora("Casio", 6, 39.95)

    println("Marca: ${calc.marca}")
    println("Años de vida: ${calc.anhosVida}")
    println("Precio: $${calc.precio}")

    println("Suma: ${calc.sumar(40.0, 25.6)}")
    println("Resta: ${calc.restar(32.0, 22.0)}")
    println("Multiplicación: ${calc.multiplicar(8.0, 2.0)}")

    try {
        println("División: ${calc.dividir(40.0, 2.0)}")
        println("División entre cero: ${calc.dividir(1.0, 0.0)}")
    } catch (e: ArithmeticException) {
        println(e.message)
    }
}