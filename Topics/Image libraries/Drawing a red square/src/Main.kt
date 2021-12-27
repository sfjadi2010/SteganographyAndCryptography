import java.awt.Color
import java.awt.image.BufferedImage  

const val HEIGHT = 500
const val WIDTH = 500
const val POSITION = 100
const val LENGTH = 300

fun drawSquare(): BufferedImage {
    // Add your code here
    val image = BufferedImage(HEIGHT, WIDTH, BufferedImage.TYPE_INT_RGB)

    val graphics = image.createGraphics()
    graphics.color = Color.RED
    graphics.drawRect(POSITION, POSITION, LENGTH, LENGTH)

    return image
}