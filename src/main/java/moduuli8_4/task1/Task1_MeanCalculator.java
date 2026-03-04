package moduuli8_4.task1;

import java.util.Arrays;

public class Task1_MeanCalculator {
    public static double calculateMean(int [] numbers) {
        if (numbers.length == 0) {
            return 0;
        }


        int sum = Arrays.stream(numbers)
                .reduce(0, (accumulator, current) -> accumulator + current);


        double mean = (double) sum / numbers.length;
        return mean;
    }
}
