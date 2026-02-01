package com.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

/**
 * Unit tests for Calculator class
 */
class CalculatorTest extends AnyFlatSpec with Matchers {
  
  val calculator = new Calculator()
  
  "Calculator" should "add two numbers correctly" in {
    calculator.add(2, 3) should be (5)
    calculator.add(0, 0) should be (0)
    calculator.add(-5, 5) should be (0)
  }
  
  it should "subtract two numbers correctly" in {
    calculator.subtract(5, 3) should be (2)
    calculator.subtract(0, 5) should be (-5)
    calculator.subtract(10, 10) should be (0)
  }
  
  it should "multiply two numbers correctly" in {
    calculator.multiply(2, 3) should be (6)
    calculator.multiply(0, 100) should be (0)
    calculator.multiply(-2, 3) should be (-6)
  }
  
  it should "divide two numbers correctly" in {
    calculator.divide(10, 2) should be (5)
    calculator.divide(9, 3) should be (3)
  }
  
  it should "throw exception when dividing by zero" in {
    assertThrows[IllegalArgumentException] {
      calculator.divide(10, 0)
    }
  }
}
