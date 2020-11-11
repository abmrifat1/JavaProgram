package class_practice;

public class MathOperation {
    static int operation(int x, int y) {
        return x+y;
    }

    static double operation(double x, double y) {
        return x*y;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(MathOperation.operation(4, 5));
        System.out.println(MathOperation.operation(3.0, 2.0));
    }
}
