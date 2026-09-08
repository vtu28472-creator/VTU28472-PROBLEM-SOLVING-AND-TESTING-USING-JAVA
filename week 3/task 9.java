import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class SortPeople {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Diana", 28));

        System.out.println("Original List:");
        for (Person p : people) {
            System.out.println(p);
        }

        // Sort by age
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        System.out.println("\nSorted by Age:");
        for (Person p : people) {
            System.out.println(p);
        }

        // Sort by name
        people.sort((p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("\nSorted by Name:");
        for (Person p : people) {
            System.out.println(p);
        }

        // Multi-level sort: by age, then by name
        people.sort((p1, p2) -> {
            int ageCompare = Integer.compare(p1.age, p2.age);
            if (ageCompare == 0) {
                return p1.name.compareTo(p2.name);
            }
            return ageCompare;
        });

        System.out.println("\nSorted by Age, then Name:");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
