package moduuli8_4.task2;

import java.util.List;

public class FilterDoubleAndSum {
    public static int filterDoubleAndSum(List<Integer> numbers) {

    return numbers.stream()
            .filter(n -> n % 2 != 0)
            .map(n -> n * 2)
            .reduce(0,(sum, n) ->sum + n);
    }
}
