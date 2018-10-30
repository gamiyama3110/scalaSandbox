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
    HelloObject.printHello

    // Class access
    val helloClass = new HelloClass
    helloClass.printHello

    println("******************")

    // 変数は val と var の2種類があり、valは定数（不変）、varは変数。
    // scalaはvalのみで書くのが基本だとか。
    val x=2
    val y=1
    println("sum "+x+"+"+y+"=?")
    println(helloClass.sum(x,y))

  }
}
