package Project2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator  extends JFrame {

    private JTextField display;
    private double opOne;
    private String operator;
    private boolean isNew;

    

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new BorderLayout());
        
        ImageIcon img = new ImageIcon("C:\\Users\\bjgod\\OneDrive\\Desktop\\Java\\FirstJava\\src\\Project2\\Calc.png");
        setIconImage(img.getImage());

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        
        display.setBackground(Color.black);
        add(display, BorderLayout.NORTH);

        JPanel buttons = new JPanel(new GridLayout(5, 4, 5, 5));
        buttons.setBackground(Color.black);
        buttons.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        String[] buttonLabel = {
            "C", "%", "PI", "/",
            "7", "8", "9", "X",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "^", "="
        };

        for (String label : buttonLabel) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttons.add(button);
            if (label.equals("C")) {
                button.setBackground(Color.YELLOW);
            }
            button.setBackground(Color.GRAY);
            button.setForeground(Color.WHITE);
            
        }

        add(buttons, BorderLayout.CENTER);

        clearCalculator();

        setVisible(true);
    }

    private void clearCalculator() {
        opOne = 0;
        operator = "";
        isNew = false;
        display.setText("0");
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String buttonText = ((JButton) e.getSource()).getText();

            if (Character.isDigit(buttonText.charAt(0)) || buttonText.equals(".")) {
                if (isNew) {
                    display.setText(buttonText);
                    isNew = false;
                } else {
                    display.setText(display.getText() + buttonText);
                }
            } else if (buttonText.equals("C")) {
                clearCalculator();
            } else if (buttonText.equals("=")) {
                performCalculation();
            } else {
                if (!operator.isEmpty()) {
                    performCalculation();
                }
                operator = buttonText;
                opOne = Double.parseDouble(display.getText());
                isNew = true;
            }

        }

        private void performCalculation() {
            double secOp = Double.parseDouble(display.getText());
            double result = 0;

            switch(operator) {
                case "^":
                    if (secOp == 1) {
                        result = opOne;
                    } else if (secOp == 0) {
                        result = 0;
                    } else {
                        result = Math.pow(opOne, secOp);
                    }
                    break;
                case "+":
                    result = opOne + secOp;
                    break;
                case "-":
                    result = opOne - secOp;
                    break;
                case "X":
                    result = opOne * secOp;
                    break;
                case "/":
                    if (secOp != 0) {
                        result = opOne / secOp;
                    } else {
                        display.setText("Error");
                        clearCalculator();
                        return;
                }
                break;
                case "%":
                    result = opOne / 100;
                    break;
                case "PI": 
                    result = opOne * Math.PI;
                break;
            }

            display.setText(String.valueOf(result));
            isNew= true;
            operator = " ";
            opOne = result;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }

}
