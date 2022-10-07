package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("two");
        set.add("three");
        set.add("three");
        set.add("three");
        set.add("1");
        set.add("2");
        set.add("3");

        // 총 9개의 중복이 포함된 데이터를 추가했다.
        // 그렇다면 set에 몇 개의 데이터가 들어갔을까?
        System.out.println("중복이 포함된 데이터 9개를 저장했다. set에 저장된 데이터의 수 : " + set.size());


        // HashSet의 데이터를 가져오기 위해선
        // Iterator(반복자)를 생성해야한다.
        Iterator<String> iterator = set.iterator(); // 반복자 생성
        while (iterator.hasNext()) { // hasNext : 데이터가 있으면 true, 없으면 false
            System.out.println(iterator.next()); // next : 다음 데이터 return
            // 즉, interator(set배열)에서 다음 데이터가 있으면 다음 데이터를 출력하라는 명령어
        }

        System.out.println("---------------------------------");

        // HashSet의 데이터 제거
        // 삭제하고 싶은 데이터를 제거한다.
        // 내 생각 : 주소값이 아닌 이유는 HashSet은 순서가 없이 저장되기 때문이다.
        set.remove("three");
        System.out.println("three를 제거하고 난 뒤 HashSet에 저장된 데이터 수(기존에 6개) : " + set.size());

        iterator = set.iterator(); //반복자를 재생성한다. 왜냐하면 위의 반복문에서 next로 다 가져왔기 때문에!!
        while(iterator.hasNext()) { // iterator에 다음 데이터가 있으면
            System.out.println(iterator.next()); // 다음에 있는 데이터를 출력
        }

    }
}
