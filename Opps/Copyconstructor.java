package Opps;

public class Copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student(19, "pass", "selim");
        s1.hobby[0] = "Playing";
        s1.hobby[2] = "Cyling";
        s1.hobby[1] = "Cricket";
        Student s2 = new Student(s1);
        s1.hobby[2] = "football";
        s2.passowrd = "new password";
        for (int i = 0; i < s2.hobby.length; i++) {
            System.out.println(s2.hobby[i]);
        }

    }
}

/**
 * Student
 */
class Student {
    int age;
    String passowrd;
    String name;
    String hobby[];

    Student(Student s1) {
        this.age = s1.age;
        this.hobby = s1.hobby;
        this.name = s1.name;
    }

    Student(int age, String password, String name) {
        this.age = age;
        this.passowrd = password;
        this.name = name;
        hobby = new String[3];
    }

}