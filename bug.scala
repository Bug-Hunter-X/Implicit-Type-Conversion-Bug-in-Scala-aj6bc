```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main extends App {
  val obj = new MyClass(10)
  println(obj.myMethod(5)) // Output: 15
}
```