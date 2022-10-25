package _04_nested_class

interface View {
    fun getCurrentState(): State

    fun restoreState(state: State)
}