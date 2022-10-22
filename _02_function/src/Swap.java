public class Swap {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Num c = new Num(5);
        Num d = new Num(3);
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        swap2(c, d);
        System.out.println("c = " + c.value);
        System.out.println("d = " + d.value);
        System.out.println(c);
        System.out.println(d);
    }

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static void swap2(Num num1, Num num2) {
        int temp = num1.value;
        num1.value = num2.value;
        num2.value = temp;

        System.out.println("====== 메소드 내부의 참조 주소 =====");
        System.out.println(num1);
        System.out.println(num2);
    }

}

class Num {
    int value;

    public Num(int value) {
        this.value = value;
    }
}
