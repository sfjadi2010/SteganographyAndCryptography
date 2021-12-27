import java.awt.Color
import java.awt.image.BufferedImage

const val HEIGHT = 200
const val WIDTH = 200
const val FIFTY = 50
const val FIFTYONE = 51
const val FIFTYTWO = 52
const val MESSAGE = "Hello, images!"

fun drawStrings(): BufferedImage {
    // Add your code here
    val image = BufferedImage(HEIGHT, WIDTH, BufferedImage.TYPE_INT_RGB)

    val graphics = image.createGraphics()
    graphics.color = Color.RED
    graphics.drawString(MESSAGE, FIFTY, FIFTY)

    graphics.color = Color.GREEN
    graphics.drawString(MESSAGE, FIFTYONE, FIFTYONE)

    graphics.color = Color.BLUE
    graphics.drawString(MESSAGE, FIFTYTWO, FIFTYTWO)

    return image
}