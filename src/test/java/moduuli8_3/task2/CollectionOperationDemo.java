package moduuli8_3.task2;

import java.util.ArrayList;
import java.util.List;



public class CollectionOperationDemo {
    public static void main(String [] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);


        System.out.println("== Alkuperäinen lista ==");
        System.out.println(numbers);

        System.out.println("\n=== SUODATUS: POISTA PARILLISET ===");
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Parittomat numerot: " + numbers);

        System.out.println("\n== TUPLA PARITTOMAT NUMEROT ==");
        numbers.replaceAll(n -> n * 2);
        System.out.println("Tuplattu: " + numbers);

        System.out.println("\n== LASKE SUMMA ==");
        int summa = 0;
        for (Integer n : numbers) {
            summa += n;
        }
        System.out.println("Summa: " + summa);
    }
}
