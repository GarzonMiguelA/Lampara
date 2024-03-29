package org.example

class Lampada(val identificador: String) {
    private var estat: Boolean = false
    private var color: String = "blanc"
    private var intensitat: Int = 0

    fun encendre() {
        estat = true
        mostrarEstat()
    }

    fun apagar() {
        estat = false
        mostrarEstat()
    }

    fun canviarColor(nouColor: String) {
        color = nouColor
        mostrarEstat()
    }

    fun canviarIntensitat(novaIntensitat: Int) {
        if (novaIntensitat in 0..5) {
            intensitat = novaIntensitat
        } else {
            intensitat = 5
        }
        mostrarEstat()
    }

    fun mostrarEstat() {
        val estatLampada = when (estat) {
            true -> "encendida"
            false -> "apagada"
        }
        println("$identificador: Lámpara $estatLampada - Color: $color - Intensidad: $intensitat")
    }
}
