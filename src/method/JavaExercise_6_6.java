package method;

public class JavaExercise_6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        return java.lang.Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }

    public static void main(String[] args) {
       MyPoint p = new MyPoint(1, 1) ;

        System.out.println(p.getDistance(1, 1, 2, 2));
    }
}


