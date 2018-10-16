package sandbox.helloworld

/**
  * Objectファイルはシングルトンになるのでアクセスはstaticみたいな形で行う。
  *
  * HelloObject.#medhod()
  *
  * mainメソッドはObjectクラスじゃないと実装できない（たぶん）
  */
object HelloObject extends HelloTrait {

  /**
    * トレイトのメソッドを実装するときは override キーワードを付ける。
    */
  override def printHello(): Unit = {

    println("Hello, Object")
  }
}
