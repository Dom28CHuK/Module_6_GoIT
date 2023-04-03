import classes.Distance;
import classes.RectangleArea;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Distance(10, 10, 20, 20).getDistance());
//
//        //Expect 23
//        System.out.println(new Distance(10, 10, 27, 25).getDistance());

        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
