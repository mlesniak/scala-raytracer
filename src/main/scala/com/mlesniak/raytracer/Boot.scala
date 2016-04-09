package com.mlesniak.raytracer

/**
  * Application entry point.
  *
  * @author Michael Lesniak (mlesniak@micromata.de)
  */
object Boot extends App {
  println("Hello, raytracing world")

  (0 until 320).foreach { y =>
    (0 until 200).foreach { x =>
      println(s"y=$y x=$x")
    }
  }
}
