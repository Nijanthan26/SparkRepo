package com.spark.practice

object functions {

  def main(args:Array[String]): Unit = {

    //print("check the function")
    def square(x:Int):Int = {
      x*x
    }

    // pass function as paramater to other function

    def anonyFunc(x:Int, f : Int => Int) : Int= {
    f(x)
    }
    val result= anonyFunc(2,square)
    print(result)

  }

}
