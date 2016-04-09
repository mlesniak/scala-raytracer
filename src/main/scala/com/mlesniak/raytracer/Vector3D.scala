package com.mlesniak.raytracer

/**
  * Simple vector class for raytracing operations.
  *
  * @author Michael Lesniak (mlesniak@micromata.de)
  */
case class Vector3D(x: Double, y: Double, z: Double)

/**
  * Vector operations.
  *
  * TODO ML Design principle?
  */
trait Vector3DOperations {
  def normalize(vec: Vector3D): Vector3D = {
    val len = length(vec)
    Vector3D(vec.x / len, vec.y / len, vec.z / len)
  }

  def length(vec: Vector3D): Double = {
    Math.sqrt(vec.x * vec.x + vec.y * vec.y + vec.z * vec.z)
  }
}
