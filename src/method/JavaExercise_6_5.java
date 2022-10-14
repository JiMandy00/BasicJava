package method;

public class JavaExercise_6_5 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}
class Student {
    String name;
    int ban, num, korean, math, english;

    public Student (String name, int ban, int num, int korean, int math, int english) {
        this.name = name;
        this.ban = ban;
        this.num = num;
        this.korean = korean;
        this.math = math;
        this.english = english;
    }

    String info() {
        int sum = korean + math + english;
        double avg = (double)sum / 3;
        // 이런식으로 말고 다른 방법이 있을거 같은데 :/
        return name +"," + Integer.toString(ban) + "," + Integer.toString(num) + "," + Integer.toString(korean) + "," + Integer.toString(math) + "," + Integer.toString(english) + "," + Integer.toString(sum) + "," + Double.toString(avg);
    }
}
