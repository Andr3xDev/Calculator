package Funcional;

import java.lang.Math;

public class Operations {

    // ! documentation missing for this method
    public double sum(double n1, double n2) {
        return n1 + n2;
    }
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
    public double sum(double n1, int n2) {
        return n1 + n2;
    }

    // ! documentation missing for this method
    public double subtract(double n1, double n2) {
        return n1 - n2;
    }
    public int subtract(int n1, int n2) {
        return n1 - n2;
    }
    public double subtract(double n1, int n2) {
        return n1 - n2;
    }

    // ! documentation missing for this method
    public double multiply(double n1, double n2) {
        return n1 * n2;
    }
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }
    public double multiply(double n1, int n2) {
        return n1 * n2;
    }

    // ! documentation missing for this method
    public double divide(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return n1 / n2;
    }
    public int divide(int n1, int n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return n1 / n2;
    }
    public double divide(double n1, int n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return n1 / n2;
    }

    // ! documentation missing for this method
    public double mod(String n1, String n2) {
        return Double.parseDouble(n1) % Double.parseDouble(n2);
    }

    // ! documentation missing for this method
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

        System.out.println(op.sum(2.2,1.2));
        System.out.println(op.subtract(2.563,-1.2));
        System.out.println(op.multiply(2,0));
        System.out.println(op.divide(0,2));
    }
}
