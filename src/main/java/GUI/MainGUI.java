package GUI;

import javax.swing.*;
import java.awt.*;

public class MainGUI {
    private JPanel general;
    private JTextField inputText;
    private JPanel buttoms;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button1;
    private JButton button2;
    private JButton a0Button;
    private JButton button3;
    private JButton button4;
    private JButton xButton;
    private JButton button5;
    private JButton DELButton;
    private JButton cButton;
    private JButton modButton;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton SQRButton;
    private JButton EXPButton;
    private JButton PIButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new MainGUI().general);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //* Gui settings
        frame.setBackground(Color.darkGray);
        frame.setResizable(false);

        //* button settings
        frame.getRootPane().setDefaultButton(new JButton("a1Button"));

    }
}
