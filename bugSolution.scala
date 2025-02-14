```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    myInt.printValue()

    val myString = new MyClass("Hello")
    myString.printValue()

    // Solution: Specify the type parameter explicitly
    val myGenericInt = new MyClass[Int](10)
    myGenericInt.printValue()

    val myGenericString = new MyClass[String]("Hello")
    myGenericString.printValue()
  }
}
```