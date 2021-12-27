import java.awt.Color
import java.awt.image.BufferedImage  

const val WIDTH = 200
const val HEIGHT = 200
const val FIFTY = 50
const val SEVENTYFIVE = 75
const val OVALSIZE = 100

fun drawCircles(): BufferedImage {
    // Add your code here
    val image = BufferedImage(HEIGHT, WIDTH, BufferedImage.TYPE_INT_RGB)

    val graphics = image.createGraphics()
    graphics.color = Color.RED
    graphics.drawOval(FIFTY, FIFTY, OVALSIZE, OVALSIZE)

    graphics.color = Color.YELLOW
    graphics.drawOval(FIFTY, SEVENTYFIVE, OVALSIZE, OVALSIZE)

    graphics.color = Color.GREEN
    graphics.drawOval(SEVENTYFIVE, FIFTY, OVALSIZE, OVALSIZE)

    graphics.color = Color.BLUE
    graphics.drawOval(SEVENTYFIVE, SEVENTYFIVE, OVALSIZE, OVALSIZE)

    return image
}