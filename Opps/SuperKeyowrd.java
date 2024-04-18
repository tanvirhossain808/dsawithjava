package Opps;

public class SuperKeyowrd {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.fishFcun();
        System.out.println(f1.name);
    }

}

class Animal {
    String name = "abul";

    Animal() {
        System.out.println("This is for parent function");
    }

    void prac() {
        System.out.println("Parent function");
    }
}

class Fish extends Animal {
    Fish() {
        super.name = "hatat";
    }

    void fishFcun() {
        System.out.println("fish");
    }
}