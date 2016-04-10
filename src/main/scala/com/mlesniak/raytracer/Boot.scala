package com.mlesniak.raytracer

import java.awt.Color
import java.awt.image.BufferedImage
import javax.imageio.ImageIO

import com.typesafe.scalalogging.StrictLogging

/**
  * Application entry point.
  *
  * @author Michael Lesniak (mlesniak@micromata.de)
  */
object Boot extends App with StrictLogging {
  logger.info("Starting")

  // Draw single pixels.
  val size = (320, 200)
  val canvas = new BufferedImage(size._1, size._2, BufferedImage.TYPE_INT_RGB)
  (0 until size._2).foreach { y =>
    (0 until size._1).foreach { x =>
      val rgb = {
        val r = x % 0xFF
        val g = y % 0xFF
        val b = 30 % 0xFF
        val rgb = r << 16 | g << 8 | b
        rgb.asInstanceOf[Int]
      }
      canvas.setRGB(x, y, rgb)
    }
  }

  ImageIO.write(canvas, "png", new java.io.File("image.png"))
  logger.info("Finished")
}
