package org.example
import org.example.ColorsUtilities.*
fun main() {
    val lampada1 = Lampada("Menjador")
    val lampada2 = Lampada("Cuina")

    // Primera làmpada (menjador)
    lampada1.encendre()
    lampada1.canviarColor(RED_BOLD + "vermell" + RESET)
    lampada1.canviarColor(GREEN_BOLD + "verd" + RESET)
    lampada1.canviarColor(BLUE_BOLD + "blau" + RESET)
    lampada1.canviarIntensitat(5)

    // Segona làmpada (cuina)
    lampada2.encendre()
    lampada2.canviarColor(YELLOW_BOLD + "groc" + RESET)
    lampada2.canviarColor("taronja")
    lampada2.canviarIntensitat(5)
    lampada2.apagar()
    lampada2.canviarColor("rosa")
    lampada2.encendre()
    lampada2.canviarColor(PURPLE_BOLD + "lila" + RESET)
    lampada2.canviarIntensitat(5)
}


