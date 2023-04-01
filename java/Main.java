import classes.GameSaver;
import classes.PowTable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        //GameSaver created!
//        for(int i = 0; i < 10; i++) {
//            new GameSaver();
//        }

        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
