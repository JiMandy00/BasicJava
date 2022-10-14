package method;

import java.util.Arrays;

public class JavaExercise_6_24 {
    // method작성란

    public static int abs(int value) {
        int result = Math.abs(value);
        return result;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값 :"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값 :"+abs(value));
    }
}