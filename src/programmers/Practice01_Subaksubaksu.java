// 22 10 20
// 1을 입력하면 수, 2를 입력하는 박, 3을 입력하면 수박수 ...
// 입력한 숫자만큼 반복하며, i를 1씩 중가하여 짝수면 수, 홀수면 박을 result에 +=
// ? 반대 아닌가... 1을 입력하면 홀수니까 수
// 2를 입력하면 짝수니까 박.. 아닌가?

// (int i = 1; i <= n; i++)
// 조건을 위의 식으로 변경
// 해결!

package programmers;

public class Practice01_Subaksubaksu {

    public String solution(int n) {
        String result = ""; // String형 result변수 생성 및 초기화
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) { // 짝수
                result += '박';
            }
            if (i%2 == 1) { // 홀수
                result += '수';
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Practice01_Subaksubaksu p = new Practice01_Subaksubaksu();
        System.out.println(p.solution(1));
        System.out.println(p.solution(2));
    }
}
