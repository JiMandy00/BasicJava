import java.util.Scanner;

public class Array5_2 {
    // 10개의 수를 받아서 배열에 넣고 총합과 평균을 구하라
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner scn = new Scanner(System.in);

        int sum = 0;
        double avg = 0;

        for (int i=0; i<arr.length; i++) {
            System.out.print(i+1 + "번째 점수 입력(총 5개의 점수 입력) >> ");
            arr[i] = scn.nextInt();
            sum += arr[i];
        }

        avg = sum/(double)arr.length;
        // avg = (double)(sum/arr.length); -> 이렇게 작성하면 error // 왜냐하면 int int계산을 진행 후 double로 바꾸면 소수점이 사라진다.
        //                                                       // int double을 계산해야 형변환이 일어나면서 소수점이 생성된다.

        System.out.println("점수의 합 : " + sum);
        System.out.println("점수의 평균 : " + avg);




    }
}
