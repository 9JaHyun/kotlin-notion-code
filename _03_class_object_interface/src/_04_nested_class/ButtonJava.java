package _04_nested_class;

import org.jetbrains.annotations.NotNull;

public class ButtonJava implements View {

    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

    // static을 통해 바깥 참조를 끊어야 함.
    public class ButtonState implements State {

    }

    public static void main(String[] args) {
        ButtonJava buttonJava = new ButtonJava();
        buttonJava.getCurrentState();
    }

}
