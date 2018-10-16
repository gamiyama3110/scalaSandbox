package sandbox.helloworld

/**
  * ようこそ、scala言語へ
  */
object HelloWorldLaunch {

  /**
    * mainメソッド。
    * scalaにはdefとvarの型（type）があって、defがメソッド、varが関数の宣言になる。
    * @param args
    */
  def main(args: Array[String]): Unit = {

    println("******************")
    println("Hello, Scala!!!")
    println("******************")

    // Object access
    HelloObject.printHello()

    // Class access
    var helloClass = new HelloClass
    helloClass.printHello()

  }
}
