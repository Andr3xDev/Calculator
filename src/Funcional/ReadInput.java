package Funcional;

public class ReadInput {
    static Operations op = new Operations();

    public ReadInput() {
    }

    private String[] split(String input) {
        return input.split("(?=[+\\-*%^/])|(?<=[+\\-*%^/])");
    }

    // + this function will be deleted when the GUI is implemented
    private static void readInput(String[] input) {
        for (String s : input) {
            System.out.println(s);
        }
    }

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

        String[] result = ri.split("3^2.3");
        readInput(result);
        System.out.println(doMath(result));
    }
}
