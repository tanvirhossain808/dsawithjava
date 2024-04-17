package Opps;

public class CoverLoading {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("abul");
        Student s3 = new Student(16);
        System.out.println(s3.age);
    }
}

/**
 * Student
 * 
 */
class Student {

    String name;
    int age;

    Student() {

    }

    Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }

}