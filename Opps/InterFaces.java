class InterFaces {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        // t1.eat();
        HilsaFish h1 = new HilsaFish();
        h1.isAnimalCategry();

    }

}

interface Animal {
    void eat();
}

class Tiger implements Animal {
    public void eat() {
        System.out.println("Tiger can kill and eat");
    }
}
// multiple inheritance

interface Fish {
    void isAnimalCategry();
}

class HilsaFish implements Animal, Fish {
    public void isAnimalCategry() {
        System.out.println("true");
    }

    public void eat() {
        System.out.println("it eat's natural food");
    }
}