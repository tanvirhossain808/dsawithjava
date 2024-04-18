
public class PolyMethodOverRiding {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("anythin");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("eat only beef");
    }
}