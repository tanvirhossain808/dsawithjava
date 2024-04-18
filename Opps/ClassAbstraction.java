public class ClassAbstraction {
    public static void main(String[] args) {
        Fox fox1 = new Fox();
        fox1.setColor();
        System.out.println(fox1.color);
        fox1.walk();
    }
}

abstract class Animal {
    String color = "Brown";

    void eat() {
        System.out.println("Can eat");

    }

    Animal() {
        System.out.println("hey");
    }

    abstract void walk();
}

class Fox extends Animal {
    void setColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("it walks usign 4 legs");
    }
}
