package sandbox.helloworld

/**
  * ClassファイルはJavaと同じ感じ。
  * 初期化してからじゃないとメソッドにアクセスできない。
  * Classだとmainメソッドは実装できない（と思う）
  */
class HelloClass extends HelloTrait {

  override def printHello(): Unit = {
    println("Hello, Class")
  }

  def sum(a: Int, b: Int): Int = {
    // scalaはすべてメソッドらしい。
    // 演算子書いても実はメソッド
    // a+b = a.+(b)
    // a.+(b)

    val add: (Int, Int) => Int = (x,y) => x + y
    add(a,b)
  }
}
