package Funcional;

import java.lang.Math;

public class Operations {

    // ! documentation missing for this method
    public Number sum(Number num1, Number num2) {
        if (num1 == null || num2 == null) {
            System.out.println("Uno de los números no es válido");
            return null;
        }

        double sum = num1.doubleValue() + num2.doubleValue();

        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (int) sum;
        } else {
            return sum;
        }
    }

    public Number subtract(Number num1, Number num2) {
        if (num1 == null || num2 == null) {
            System.out.println("Uno de los números no es válido");
            return null;
        }

        double subtract = num1.doubleValue() + num2.doubleValue();

        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (int) subtract;
        } else {
            return subtract;
        }
    }

    public Number multiply(Number num1, Number num2) {
        if (num1 == null || num2 == null) {
            System.out.println("Uno de los números no es válido");
            return null;
        }

        double multiply = num1.doubleValue() * num2.doubleValue();

        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (int) multiply;
        } else {
            return multiply;
        }
    }

    public Number divide(Number num1, Number num2) {
        if (num1 == null || num2 == null) {
            System.out.println("Uno de los números no es válido");
            return null;
        }

        if (num2.doubleValue() == 0) {
            System.out.println("No se puede dividir por 0");
            return null;
        }

        double divide = num1.doubleValue() / num2.doubleValue();

        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (int) divide;
        } else {
            return divide;
        }
    }

    public Number mod(Number num1, Number num2) {
        if (num1 == null || num2 == null) {
            System.out.println("Uno de los números no es válido");
            return null;
        }

        if (num2.doubleValue() == 0) {
            System.out.println("No se puede dividir por 0");
            return null;
        }

        double mod = num1.doubleValue() % num2.doubleValue();

        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (int) mod;
        } else {
            return mod;
        }
    }

    public Number power(Number a, Number b) {
        if (a == null || b == null) {
            System.out.println("Uno de los números no es válido");
            return null;
        }

        double power = Math.pow(a.doubleValue(), b.doubleValue());

        if (a instanceof Integer && b instanceof Integer) {
            return (int) power;
        } else {
            return power;
        }
    }

    public int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
}