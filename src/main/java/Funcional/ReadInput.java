package Funcional;

public class ReadInput {
    static Operations op = new Operations();

    public ReadInput() {
    }

    //* Functions to manipulate the input

    private String[] split(String input) {
        return input.split("(?=[+\\-*%^()!/])|(?<=[+\\-*%^()!/])");
    }

    //- this function will be deleted when the GUI is implemented
    private static void readInput(String[] input) {
        for (String s : input) {
            System.out.println(s);
        }
    }

    // + Function devuleve el número en el formato correcto
    private static Number getNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e1) {
            try {
                return Double.parseDouble(number);
            } catch (NumberFormatException e2) {
                return null;
            }
        }
    }

    public static String[] remove(String[] input) {
        if (input.length == 0) {
            return input;
        }

        String[] newInput = new String[input.length - 1];

        for (int i = 1; i < input.length; i++) {
            newInput[i - 1] = input[i];
        }
        return newInput;
    }

    // * Functions to solve the input

    private static Number section(String[] input) {
        String actualValue = input[0];
        String[] newInput;

        readInput(input);
        if (input[0].equals("(") || actualValue.equals(")")) {
            newInput = remove(input);
            readInput(newInput);
            return section(newInput);
        }
        if (input.length == 3 && !input[1].equals("!")) {
            return doMath(input);
        }
//        if (input[1].equals("!")) {
//            newInput = remove(input);
//            readInput(newInput);
//            return factorial(newInput);
//        }

        return 0;
    }

    // + Hace las operaciones entre 2 números
    private static Number doMath(String[] input) {
        String operator = input[1];

        Number num1 = getNumber(input[0]);
        Number num2 = getNumber(input[2]);

        return switch (operator) {
            case "+" -> op.sum(num1, num2);
            case "-" -> op.subtract(num1, num2);
            case "*" -> op.multiply(num1, num2);
            case "/" -> op.divide(num1, num2);
            case "^" -> op.power(num1, num2);
            case "%" -> op.mod(num1, num2);
            default -> 0;
        };
    }

    //* Function to read the input and call the operations (TEST)
    public static void main(String[] args) {

        ReadInput ri = new ReadInput();

        System.out.println("Test 0");
        String[] result0 = ri.split("(3+2)");
        readInput(result0);

        System.out.println("Test 1");
        String[] result = ri.split("3^2.3");
        readInput(result);
        System.out.println(doMath(result));

        System.out.println("Test 2");
        String[] result2 = ri.split("3.3*2");
        System.out.println(section(result2));

        System.out.println("Test 3");
        String[] result3 = ri.split("(3+2)+1");
        System.out.println(section(result3));
    }
}