package com.mlesniak.raytracer

import java.awt.Color
import java.awt.image.BufferedImage
import javax.imageio.ImageIO

/**
  * Application entry point.
  *
  * @author Michael Lesniak (mlesniak@micromata.de)
  */
object Boot extends App {
  println("Start")

  // Draw single pixels.
  val size = (320, 200)
  val canvas = new BufferedImage(size._1, size._2, BufferedImage.TYPE_INT_RGB)
  (0 until size._2).foreach { y =>
    (0 until size._1).foreach { x =>
      canvas.setRGB(x, y, (Math.random() * Int.MaxValue).asInstanceOf[Int])
    }
  }

  ImageIO.write(canvas, "png", new java.io.File("image.png"))
  println("Finish")
}
