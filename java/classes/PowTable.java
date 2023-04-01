package classes;

public class PowTable {
    public static final int[] POWERS_2 = new int[10];

    static {
        for (int i = 1; i <= 10; i++) {
            POWERS_2[i - 1] = i * i;
        }
    }
}
