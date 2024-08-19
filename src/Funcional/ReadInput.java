package Funcional;

public class ReadInput {

    public static String Read (String text) {
        String[] parts = text.split("[\\+\\-\\*\\/\\%\\!]");
        String[] operators = text.split("[0-9]+");
        String result = parts[0];
        return result;
    }
}
