package Funcional;

import java.lang.Math;

public class Operations {

    public double sum(String n1, String n2) {
        return Double.parseDouble(n1) + Double.parseDouble(n2);
    }

    public double subtract(String n1, String n2) {
        return Double.parseDouble(n1) - Double.parseDouble(n2);
    }

    public double multiply(String n1, String n2) {
        return Double.parseDouble(n1) * Double.parseDouble((n2));
    }

    public double divide(String n1, String n2) {
        return (Double.parseDouble(n1) / Double.parseDouble(n2));
    }

    public double mod(String n1, String n2) {
        return Double.parseDouble(n1) % Double.parseDouble(n2);
    }

    public double power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    // Function main to test the operations

    public static void main(String[] args) {
        Operations op = new Operations();
        System.out.println(op.sum("-2", "1"));
    }
}
