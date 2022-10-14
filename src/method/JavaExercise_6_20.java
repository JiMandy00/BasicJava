package method;

import java.util.Arrays;

public class JavaExercise_6_20 {
    public int[] Shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(java.util.Arrays.toString(arr));

        JavaExercise_6_20 a = new JavaExercise_6_20();
        a.Shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// 오류: 기본 클래스 method.JavaExerciss_6_20을(를) 찾거나 로드할 수 없습니다.
// JavaExercise_6_20원인: java.lang.ClassNotFoundException: method.JavaExerciss_6_20
