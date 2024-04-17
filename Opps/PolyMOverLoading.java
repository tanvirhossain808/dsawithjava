package Opps;

public class PolyMOverLoading {

    public static void main(String[] args) {
        FunctionOverRiding overRiding = new FunctionOverRiding();
        overRiding.sum(1, 2);
        overRiding.sum((float) 2.5, (float) 2.5);
        overRiding.sum(3, 4, 5);
    }

}

class FunctionOverRiding {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}