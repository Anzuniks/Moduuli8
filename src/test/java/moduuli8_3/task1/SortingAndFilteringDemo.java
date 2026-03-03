package moduuli8_3.task1;


import java.util.ArrayList;
import java.util.List;
import moduuli8_3.task1.Person;


public class SortingAndFilteringDemo {
    public static void main(String [] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice ", 28 , " New York"));
        people.add(new Person("Bob ", 35 , " Los Angeles"));
        people.add(new Person("Charlie ", 22 , " New York"));
        people.add(new Person("David ", 30 , " Chicago"));
        people.add(new Person("Eva ", 25 , " New York"));
        people.add(new Person("Frank ", 40 , " Boston"));


        System.out.println("== Alkuperäinen lista ==");
        people.forEach(System.out::println);

        System.out.println("\n== Järjestetty ikäjärjestykseen ==");
        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        people.forEach(System.out::println);

        System.out.println("\n== Suodatus: Henkilöt, jotka asuvat New Yorkissa ==");
        List<Person> newYorkPeople = new ArrayList<>(people);
        people.removeIf(person -> !person.getCity().trim().equals("New York"));
        people.forEach(System.out::println);
    }
}
