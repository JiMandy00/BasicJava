// 22 10 26
// 7-1
// 섯다카드 20장을 포함하는 섯다카드 한 벌을 정의
// 섯다카드 20장을 담는 SutdaCard배열을 초기화 하세요


package Chapter07;


public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    int num1 = 0;
    int num2 = 0;

    SutdaDeck() {
        for (int i = 0; i < cards.clone() ; i++) {
            num1 = i;
            if (num1 > 10) {
                num2 = num1 - 10;
            }
            boolean isKwang = (i<10) && (num1==1 || num1==3 || num1 == 8);

            // 배열에 2개의 값을 어떻게 동시에 배정하지?
        }
    }

}
