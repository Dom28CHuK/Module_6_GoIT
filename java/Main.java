import classes.ArrayWorker;
import classes.AvgDamageCalculator;

public class Main {
    public static void main(String[] args) {
//        //5
//        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));
//
//        //0
//        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));

        int[] array = {1, 2, 3};

        //value is 1
        //index is 0
        new ArrayWorker().printElement(array, 0);

        //wrong index
        //index is 10
        new ArrayWorker().printElement(array, 10);
    }
}
