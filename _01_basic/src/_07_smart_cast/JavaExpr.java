package _07_smart_cast;

interface JavaExpr {

}

class JavaNum implements JavaExpr {

    private int value;

    public JavaNum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class JavaSum implements JavaExpr {

    private JavaExpr left;
    private JavaExpr right;

    public JavaSum(JavaExpr left, JavaExpr right) {
        this.left = left;
        this.right = right;
    }

    public JavaExpr getLeft() {
        return left;
    }

    public JavaExpr getRight() {
        return right;
    }
}

class Calculator {

    public static void main(String[] args) {
        System.out.println(doSomething(
              new JavaSum(
                    new JavaSum(new JavaNum(1), new JavaNum(2)),
                    new JavaNum(3))));
    }

    public static int doSomething(JavaExpr e) {
        if (e instanceof JavaNum) {
            return ((JavaNum) e).getValue();
        }

        if (e instanceof JavaSum) {
            return doSomething(((JavaSum) e).getLeft())
                  + doSomething(((JavaSum) e).getRight());
        }
        throw new IllegalArgumentException("오류 발생");
    }
}
