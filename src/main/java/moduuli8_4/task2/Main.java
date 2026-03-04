package moduuli8_4.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Integer> numbers1 = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println("Input: " + numbers1);
        System.out.println("Tulos: " + FilterDoubleAndSum.filterDoubleAndSum(numbers1));

        System.out.println();

        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println("Input: " + numbers2);
        System.out.println("Tulos: " + FilterDoubleAndSum.filterDoubleAndSum(numbers2));


    }
}
