package com.example.lab1

import androidx.compose.ui.tooling.preview.Preview

class Computadora(
    var procesador: String,
    var RAM: Int,
    var almacenamiento: Int,
    var sistemaOperativo: String,
    var programasInstalados: MutableList<String>
){
    fun encender(){
        println("La computadora se esta encendiendo")
    }

    fun apagar(){
        println("La computadora se esta apagando")
    }

    fun actualizarRam(acRAM: Int){
        RAM = acRAM
        println("Ahora tienes una RAM de $RAM GB")
    }

    fun actualizarMemoria(acMemoria: Int){
        almacenamiento = acMemoria
        println("Ahora tienes una $almacenamiento GB de almacenamiento")
    }

    fun actualizarSistema(acSistema: String){
        sistemaOperativo = acSistema
        println("Tu sistema operativo es $sistemaOperativo")
    }

    fun mostrarProgramasAnho(anhoBusqueda: String){
        val programasRecientes = programasInstalados.filter { it.contains(anhoBusqueda) }
        println("Programas de $anhoBusqueda")
        if(programasRecientes.isEmpty()){
            println("No hay programas instalados de ese anho")
        }else{
            programasRecientes.forEach { println(it) }
        }
    }

}


fun main() {
    val programas = mutableListOf(
        "Notion 2026",
        "Facebook 2024",
        "Visual Studio Code 2026",
        "WhatsApp 2022",
        "Spotify 2026",
        "Opera 2026",
        "Android Studio 2022",
        "Instagram 2025"
    )

    val pc = Computadora(
        procesador = "Intel Core i7",
        RAM = 8,
        almacenamiento = 512,
        sistemaOperativo = "Windows 11",
        programasInstalados = programas
    )

    pc.encender()
    pc.actualizarRam(16)
    pc.actualizarMemoria(1024)
    pc.actualizarSistema("Android")
    pc.mostrarProgramasAnho("2026")
    pc.apagar()
}