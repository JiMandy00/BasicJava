package collection_framework;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();

        arrList1.add(0);
        arrList1.add(2);
        arrList1.add(3);
        arrList1.add(4);
        arrList1.add(5);
        // arrList1 = 0, 2, 3, 4, 5가 저장되어 있다.
        System.out.println("기존 arrList1 : " + arrList1);

        arrList1.add(1,1);
        // 배열 index 1번에 1을 넣어라
        // 나머지는 뒤로 밀림
        // arrList1 = 0, 1, 2, 3, 4, 5

        System.out.println("arrList1.add(1, 1) : " + arrList1);

        arrList2.add(10);
        arrList2.add(20);
        arrList2.add(30);
        arrList2.add(40);
        arrList2.add(50);

        System.out.println("기존 arrList2 : " + arrList2);

        arrList1.addAll(arrList2);
        // arrList1에 arrList2를 담아라

        System.out.println("arrList1.addAll(arrList2) : " + arrList1);


        System.out.print("for방식으로 arrLIst.addAll(arrLIst2) : ");
        for(int i : arrList1) {
            System.out.print(i + " ");
        }

        System.out.println();

        // [6]에 6을 추가하라
        // 기존 [6]에 들어있던 값은 교체된다.
        arrList1.set(6, 6);
        System.out.println(arrList1);

        // remove로 index값 지우기
        arrList1.remove(6);
        System.out.println(arrList1);

        // 해당 값이 배열안에 존재하는지 확인
        // true, false로 반환
        System.out.println("contain으로 0이 arrList1에 존재하는지 확인 : " + arrList1.contains(0));

        // 해당 값이 배열안에 존재하는지 확인
        // 인덱스 값을 return
        System.out.println("indexOf로 20이 arrList1에 어디에 있는지 확인 : " + arrList1.indexOf(20));




    }


}
