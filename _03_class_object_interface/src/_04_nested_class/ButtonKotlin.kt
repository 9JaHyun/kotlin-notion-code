package _04_nested_class

class ButtonKotlin : View {
    override fun getCurrentState() = ButtonState()

    override fun restoreState(state: State) {
        TODO("Not yet implemented")
    }

    class ButtonState() : State {

    }
}