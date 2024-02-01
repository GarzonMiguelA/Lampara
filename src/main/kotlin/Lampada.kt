package org.example

class Lampada(val identificador: String) {
    var estat: Boolean = false
    var color: String = "blanc"
    var intensitat: Int = 0

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
        val estatLampada = if (estat) "encesa" else "apagada"
        println("$identificador: Lampada $estatLampada - Color: $color - Intensitat: $intensitat")
    }
}