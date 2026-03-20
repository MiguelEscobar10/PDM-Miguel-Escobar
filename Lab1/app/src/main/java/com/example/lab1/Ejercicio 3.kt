package com.example.lab1

data class Estudiante(
    val nombre: String,
    val carnet: String,
    val asignatura: String
)

fun main() {
    val Ciclo01 = listOf(
        Estudiante("Francisco Giron", "00095225", "Programación de Dispositivos Móviles"),
        Estudiante("Daniel Perez", "00122422", "Programación de Dispositivos Móviles"),
        Estudiante("Enrique Torres", "00765223", "Programación de Dispositivos Móviles"),
        Estudiante("Alisson Gutierrez", "24136924", "Programación de Dispositivos Móviles"),
        Estudiante("Adam Aguilar", "12345623", "Programación de Dispositivos Móviles"),

        Estudiante("Alberto Mendez", "65432521", "Análisis numérico"),
        Estudiante("Lucas Gonzalez", "00012324", "Análisis numérico"),
        Estudiante("Carlos Arias", "00321423", "Análisis numérico"),
        Estudiante("Carolina Lara", "00024223", "Análisis numérico"),
        Estudiante("Juan Flores", "05067421", "Análisis numérico")
    )

    val dispositivosMoviles = Ciclo01.filter {
        it.asignatura == "Programación de Dispositivos Móviles"
    }

    println("Estudiantes inscritos únicamente en Programación de Dispositivos Móviles:")
    dispositivosMoviles.forEach {
        println("Nombre: ${it.nombre}, Carnet: ${it.carnet}")
    }
}