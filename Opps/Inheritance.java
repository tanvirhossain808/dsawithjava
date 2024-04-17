package Opps;

public class Inheritance {
    public static void main(String[] args) {

        Cow cow1 = new Cow();
        cow1.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eat");
    }

    void breath() {
        System.out.println("yes");
    }
}

class Cow extends Animal {
    void name() {
        System.out.println("fish");
    }
}