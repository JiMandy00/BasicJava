package method;

// method 기초
public class method1 {
    public static void main(String[] args) {
        MyMath mm = new MyMath(); // 객체를 선언하고 생성

        long addResult = mm.add(10, 20);
        System.out.println(addResult);
    }
}

class MyMath { // MyMath라는 클래스를 생성
    long add (long a, long b) { // long type 매개변수 두 개를 받는 add method
                                // 해당 method는 long type을 return한다.
        return a+b; // long a+b의 값을 return
                    // 주의 : return만 할 뿐 출력은 하지 않는다.
                    // 출력을 원한다면? System.out.print에서 method를 호출하거나
                    // 임의의 변수에 method 값을 담고, 해당 변수를 System.out.print에서 출력한다.
    }
}
