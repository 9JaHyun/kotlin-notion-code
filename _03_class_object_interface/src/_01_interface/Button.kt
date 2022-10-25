package _01_interface

class Button : Clickable {
    override fun introduce() {
        println("저는 Button입니다.")
    }
}

class ButtonV2 : Clickable {
    override fun click() {
        println("살짝 버튼 누르기")
    }

    override fun introduce() {
        println("저는 ButtonV2입니다")
    }
}

class Mouse : Clickable, Movable {
    override fun introduce() {
        super<Clickable>.introduce()
//        super<Movable>.introduce()
//        println("저는 Mouse입니다.")
    }
}

fun main() {
    val button = Button()
    val buttonV2 = ButtonV2()
    val mouse = Mouse()
    mouse.click()
    mouse.introduce()


    button.click()
    buttonV2.click()
}