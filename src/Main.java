import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Smith", 23, 4));
        students.add(new Student("John", 20, 1));
        students.add(new Student("Jane", 21, 2));
        students.add(new Student("Doe", 22, 3));
        students.add(new Student("Alex", 24, 5));
        students.add(new Student("Alice", 26, 7));
        students.add(new Student("Bob", 25, 6));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });    // sort by age









        Collections.sort(students,new Comparator<Student>(){
            public int compare(Student o1, Student o2){
                return o1.rollNo - o2.rollNo;
            }
        });    // sort by rollNo











        Collections.sort(students,new Comparator<Student>(){
            public int compare(Student o1, Student o2){
                return o1.name.compareTo(o2.name);
            }
        });    // sort by name


        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student {
    String name;
    int age;
    int rollNo;

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String toString() {
        return name + " " + age + " " + rollNo;
    }
}