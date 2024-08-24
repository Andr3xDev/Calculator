package GUI;

import Funcional.ReadInput;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainInterface {
    // All components of the GUI

    private JPanel panelMain;
    private JPanel Board;
    private JButton button7;
    private JButton button4;
    private JButton button1;
    private JButton button2;
    private JButton button5;
    private JButton button3;
    private JButton buttonMul;
    private JButton button6;
    private JButton button8;
    private JButton button9;
    private JButton buttonSus;
    private JButton buttonAdd;
    private JButton button0;
    private JButton buttonDiv;
    private JButton buttonDot;
    private JButton buttonEq;
    private JButton buttonC;
    private JButton buttonDEL;
    private JButton buttonMod;
    private JButton buttonFac;
    private JTextField ActualNum;
    private JTextField History;


    public MainInterface() {

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            ActualNum.setText(ActualNum.getText() + "1");
            }
        });

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "2");
            }
        });

        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "3");
            }
        });

        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "4");
            }
        });

        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "5");
            }
        });

        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "6");
            }
        });

        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "7");
            }
        });

        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "8");
            }
        });

        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "9");
            }
        });

        button0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "0");
            }
        });

        buttonDot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + ",");
            }
        });

        buttonAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "+");
            }
        });

        buttonSus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "-");
            }
        });

        buttonMul.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "*");
            }
        });

        buttonDiv.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "/");
            }
        });

        buttonMod.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "%");
            }
        });

        buttonFac.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText() + "!");
            }
        });

        buttonDEL.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ActualNum.getText().substring(0, ActualNum.getText().length() - 1));
            }
        });

        buttonC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText("");
            }
        });

        buttonEq.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ActualNum.setText(ReadInput.Read(ActualNum.getText()));
            }
        });

        buttonEq.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                History.setText(ActualNum.getText());
                ActualNum.setText("");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new MainInterface().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}