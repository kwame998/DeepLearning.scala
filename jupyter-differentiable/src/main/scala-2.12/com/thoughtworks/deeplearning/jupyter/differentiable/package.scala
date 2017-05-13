package com.thoughtworks.deeplearning.jupyter

import com.thoughtworks.deeplearning.Tape
import com.thoughtworks.raii.asynchronous.Do
import com.thoughtworks.raii.ownership.Borrowing

//workaround for jupyter-scala bug https://github.com/alexarchambault/jupyter-scala/issues/156
package object differentiable {
  type Any = Do[ Tape[scala.Any, scala.Nothing]]
  val Any = com.thoughtworks.deeplearning.differentiable.Any

  type Float = Do[Tape[scala.Float, scala.Float]]
  val Float = com.thoughtworks.deeplearning.differentiable.Float

  type Double = Do[Tape[scala.Double, scala.Double]]
  val Double = com.thoughtworks.deeplearning.differentiable.Double
}
