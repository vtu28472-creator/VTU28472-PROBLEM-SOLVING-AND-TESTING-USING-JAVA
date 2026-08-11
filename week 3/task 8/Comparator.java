import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " " + marks;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Vignesh", 85));
        students.add(new Student("Arun", 70));
        students.add(new Student("Rahul", 90));

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.marks - s2.marks;
            }
        });

        System.out.println("Students sorted by marks:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}