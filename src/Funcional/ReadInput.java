package Funcional;

public class ReadInput {
    Operations op = new Operations();

    public ReadInput() {
    }

    public void split(String input) {
        String[] operation = input.split("(?=[+\\-*/])|(?<=[+\\-*/])");

        for (String part : operation) {
            System.out.println(part);
        }
    }

    public static void main(String[] args) {

        ReadInput ri = new ReadInput();

        ri.split("3.3-3*2.4");
    }
}
