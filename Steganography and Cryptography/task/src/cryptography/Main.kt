package cryptography

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import java.lang.Exception
import javax.imageio.ImageIO

fun main() {
    showMenu()
    while (true) {
        val task = readLine()!!.toString()

        when(task) {
            "hide" -> hidingMessage()
            "show" -> showingMessage()
            "exit" -> break
            else -> wrongTask(task)
        }
    }
    println("Bye!")
}

fun wrongTask(taskName: String) {
    println("Wrong task: $taskName")
    showMenu()
}

fun showingMessage() {
    println("Obtaining message from image.")
    showMenu()
}

fun hidingMessage() {
    // println("Hiding message in image.")
    println("Input image file:")
    val inputImageFile = readLine()!!
    println("Output image file:")
    val outputImageFile = readLine()!!
    println("Message to hide:")
    val message = "${readLine()!!}\u0000\u0000\u0003"
        .encodeToByteArray()
        .map { it.toString(2).padStart(8, '0') }
        .map { it.toCharArray().toList() }
        .flatten()

    println("Input Image: $inputImageFile")
    println("Output Image: $outputImageFile")

    try {
        val bufferedImage = ImageIO.read(File(inputImageFile))
        val width = bufferedImage.width
        val height = bufferedImage.height
        val outputImage = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
        var messageIndex = 0

        if (width * height * 3 > message.size * 8 + 8) {
            for (jndx in 0 until height) {
                for (indx in 0 until width) {
                    var color = Color(bufferedImage.getRGB(indx, jndx))

                    if (messageIndex < message.size) {
                        val red = setLeastSignificantBit(color.red, message[messageIndex].digitToInt())
                        val green = setLeastSignificantBit(color.green, message[messageIndex + 1].digitToInt())
                        val blue = setLeastSignificantBit(color.blue, message[messageIndex + 2].digitToInt())

                        messageIndex += 3
                        color = Color(red, green, blue)
                    }

                    outputImage.setRGB(indx, jndx, color.rgb)
                }
            }

            ImageIO.write(outputImage, "png", File(outputImageFile))
            println("Image $outputImageFile.png is saved")
        } else {
            println("The input image is not large enough to hold this message.")
        }
    } catch (e: Exception) {
        println("Can't read input file!")
    }

    showMenu()
}

fun setLeastSignificantBit(value: Int, bit: Int) : Int {
    return if (bit == 1) {
        if (value % 2 == 0) value + 1 else value
    } else {
        if (value % 2 == 0 ) value else value -1
    }
}

fun showMenu() {
    println("Task (hide, show, exit):")
}

