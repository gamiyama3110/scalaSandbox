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

}
