package _05_string;

import java.util.Arrays;

public class UsingSplitInJava {

    public static void main(String[] args) {
        String[] result = "split.by.point".split(".");
        System.out.println(Arrays.toString(result));
    }

}
