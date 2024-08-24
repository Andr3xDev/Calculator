package Funcional;

import java.util.Scanner;

public class ReadInput {

    public static String Read () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter expression: ");
        String expression = scanner.nextLine();

        scanner.close();
        return expression;
    }
}
