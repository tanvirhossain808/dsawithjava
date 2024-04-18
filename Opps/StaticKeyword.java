package Opps;

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.scoolAdrees = 3;
        s1.result(4);
        System.out.println(s1.scoolAdrees);
        Student s2 = new Student();
        System.out.println(s2.scoolAdrees);
        s2.result(0);
    }

}

class Student {

    static int scoolAdrees;

    static void result(int result) {
        System.out.println("result of the student is" + result);
    }

    String name;

}