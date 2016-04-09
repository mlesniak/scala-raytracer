package com.mlesniak.raytracing

import com.mlesniak.raytracer.{Vector3DOperations, Vector3D}
import org.scalatest._

/**
  * Unit tests for math operations.
  *
  * @author Michael Lesniak (mlesniak@micromata.de)
  */
class Vector3DTest extends FlatSpec with Matchers with Vector3DOperations {
  "A 3D Vector" should "be defined using a case class " in {
    val vec = Vector3D(1, 2, 3)

    vec.x should be(1)
    vec.y should be(2)
    vec.z should be(3)
  }

  "A Vector3D(1,2,3)" should "have length " in {
    val vec = Vector3D(1, 2, 3)

    val len = length(vec)
    len should be(3.7416573867739413)
  }

  "A Vector3D(1,2,3)" should "be normalizable" in {
    val vec = Vector3D(1, 2, 3)

    val len = length(vec)
    val normVec = normalize(vec)
    normVec.x should be(vec.x / len)
    normVec.y should be(vec.y / len)
    normVec.z should be(vec.z / len)
  }
}
