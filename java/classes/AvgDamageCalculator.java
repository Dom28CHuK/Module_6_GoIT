package classes;

public class AvgDamageCalculator {

    public int calculateAvg(int[] samples) {
        int sum = 0;
        for(int sampleValue: samples) {
            sum += sampleValue;
        }

        try {
            return sum / samples.length;
        } catch (ArithmeticException exception) {
            System.out.println("ERROR: Division by zero");
            return 0;
        }
    }
}
