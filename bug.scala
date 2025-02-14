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

    // This will cause an error because the type parameter T isn't specified and cannot be inferred by Scala
    val myGeneric = new MyClass
    myGeneric.printValue()
  }
}
```