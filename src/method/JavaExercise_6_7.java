package method;

class MyPoint {
    int x, y;

    MyPoint (int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance (int x, int y, int x1, int y1) {
        return java.lang.Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }
}


public class JavaExercise_6_7 {

    public static void main(String args[]) {
        MyPoint p = new MyPoint(1, 1);
// p (2,2) . 와 의 거리를 구한다
        System.out.println(p.getDistance(1, 1, 2, 2));
    }


}

