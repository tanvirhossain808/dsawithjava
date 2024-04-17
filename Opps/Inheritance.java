package Opps;

public class Inheritance {
    public static void main(String[] args) {

        Cow cow1 = new Cow();
        // cow1.eat();
        Fox fox1 = new Fox();
        System.out.println(fox1.eye);
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

// Single inheritance
class Cow extends Animal {
    void name() {
        System.out.println("fish");
    }

}
// second type of inheritance (multi level inheritance)

class Mammals extends Animal {
    int eye = 2;
}

class Fox extends Mammals {
    boolean canRun = true;

}

// 3rd type of inheritance hirarcy inheritance;

class Fish extends Animal {
    boolean canSwime = true;

}

class Tiger extends Animal {
    boolean isDangeroud = true;
}

// 4rth type of inheritance or hybrid inheritance

// combination of all this 4 type of inheritance
