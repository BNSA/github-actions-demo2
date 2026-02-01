package com.example

/**
 * A simple Calculator class for demonstration
 */
class Calculator {
  
  def add(a: Int, b: Int): Int = {
    a + b
  }
  
  def subtract(a: Int, b: Int): Int = {
    a - b
  }
  
  def multiply(a: Int, b: Int): Int = {
    a * b
  }
  
  def divide(a: Int, b: Int): Int = {
    if (b == 0) throw new IllegalArgumentException("Cannot divide by zero")
    a / b
  }
}
