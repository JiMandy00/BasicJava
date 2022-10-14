package method;

class Exercise_6_22 {
    /*
    (1) isNumber . 메서드를 작성하시오
    */
    public static Boolean isNumber(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            // str.length()는 안 되나? 오류 떴다.
            // 아.. 내가 if가 아니라 for을 했어..
            char cha = str.charAt(i);
            if (cha < '0' || cha > '9') {
                // 숫자에서 에러가 안 나긴하는데, 정확한 값을 얻으려면
                // char형이라 '' <-에 단어 넣어줘야 한다.
                return false;
            }
        }
        return true;
        // for문에서 false는 바로 method를 나가버리는가?
        // 반복문 밖에 return true;를 해주니까 method를 닫는 }에서 error가 사라졌다.
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까 ? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까 ? " + isNumber(str));
    }
}
