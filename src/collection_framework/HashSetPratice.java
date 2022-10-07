package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member { // Mamber class 생성
    String name; // 필드, 멤버변수
    String id;

    public Member(String name, String id) { // 생성자
        this.name = name; // 초기화
        this.id = id; // 초기화
    }
}

public class HashSetPratice {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();
        // 제네릭 타입이 Member인 HashSet 생성
        // 제네릭 다시 공부하기 !!

        set.add(new Member("맨디", "student")); // 객체추가
        set.add(new Member("쓰앵님", "teacher")); // 객체추가

        Iterator<Member> iterator = set.iterator(); // 반복자 생성
        while (iterator.hasNext()) {
            Member member = iterator.next(); // Set에 저장된 다음 객체의 참조값을 저장

            System.out.println("아이디 : " + member.id);
            System.out.println("이름 : " + member.name);
        }
    }
}
