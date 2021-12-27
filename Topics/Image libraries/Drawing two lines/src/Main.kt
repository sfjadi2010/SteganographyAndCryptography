import java.awt.Color
import java.awt.image.BufferedImage

const val HEIGHT = 200
const val WIDTH = 200

fun drawLines(): BufferedImage {
    // Add your code here
    val height: Int = HEIGHT
    val width: Int = WIDTH

    val image = BufferedImage(height, width, BufferedImage.TYPE_INT_RGB)

    val graphics = image.createGraphics()
    graphics.color = Color.RED
    graphics.drawLine(0, 0, width, height)

    graphics.color = Color.GREEN
    graphics.drawLine(width, 0, 0, height)

    return image
}
