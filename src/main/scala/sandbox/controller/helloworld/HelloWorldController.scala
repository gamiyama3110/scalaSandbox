package sandbox.controller.helloworld

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.event.ActionEvent
import scalafx.geometry.Pos
import scalafx.scene.Scene
import scalafx.scene.control.{Button, Label}
import scalafx.scene.input.MouseEvent
import scalafx.scene.layout.VBox
import scalafx.scene.paint.Color

/**
  * ScalaFX（JavaFXをscalaっぽくしたもの）を利用したGUIコンポーネント。
  *
  * JavaFX同様にApplicationはmainメソッドが不要なのでこれで動いちゃう。
  *
  */
object HelloWorldController extends JFXApp {

  stage = new PrimaryStage {
    title = "Hello, ScalaFX!!!"
    val layout = new VBox(10.0)
    layout.setAlignment(Pos.Center)
    layout.children.add(new Label("Hello, Hello!!!"))
    val resultLabel = new Label()
    layout.children.add(resultLabel)

    val button = new Button("まだまだ分からないことが多い")
    layout.children.add(button)
    scene = new Scene(layout, 640.0, 480.0, Color.WHITE)

  }
}
