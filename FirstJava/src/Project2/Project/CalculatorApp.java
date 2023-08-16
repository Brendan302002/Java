package Project2.Project;

//Authors: Jaden Bigos, Brendan Goddard
//Date: 8/8/2023

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {
    private JFrame frame;
    private Calculator calculator;

    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton clearButton;
    private JButton equalsButton;
    private JRadioButton[] radixButtons;
    private ButtonGroup radixButtonGroup;

    private String currentOperator;
    private double firstOperand;
    private boolean isTypingSecondOperand;

    public CalculatorApp() {    

        calculator = new Calculator();
        frame =  new JFrame();
        frame.setTitle("Basic Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setFont(new Font(Font.SERIF, Font.PLAIN, 40));
        textField.setHorizontalAlignment(JTextField.RIGHT);

        numberButtons = new JButton[10];
        operatorButtons = new JButton[4];
        radixButtons = new JRadioButton[4];

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("SansSerif", Font.PLAIN, 18));
            numberButtons[i].setBackground(Color.ORANGE);
        }

        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        operatorButtons[0].setBackground(Color.GRAY);
        operatorButtons[1].setBackground(Color.WHITE);
        operatorButtons[2].setBackground(Color.GRAY);
        operatorButtons[3].setBackground(Color.WHITE);

        radixButtons[0] = new JRadioButton("HEX");
        radixButtons[1] = new JRadioButton("DEC");
        radixButtons[1].setSelected(true);
        radixButtons[2] = new JRadioButton("BIN");
        radixButtons[3] = new JRadioButton("OCT");

        ButtonGroup radixButtonGroup = new ButtonGroup();
        radixButtonGroup.add(radixButtons[0]);
        radixButtonGroup.add(radixButtons[1]);
        radixButtonGroup.add(radixButtons[2]);
        radixButtonGroup.add(radixButtons[3]);

        equalsButton = new JButton("=");
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 18));
        equalsButton.setBackground(Color.GRAY);

        clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.PLAIN, 18));
        clearButton.setBackground(Color.BLACK);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));
        
        buttonPanel.add(radixButtons[0]);
        buttonPanel.add(radixButtons[1]);
        buttonPanel.add(radixButtons[2]);
        buttonPanel.add(radixButtons[3]);
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(operatorButtons[0]);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(operatorButtons[1]);
        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(operatorButtons[2]);
        buttonPanel.add(clearButton);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(equalsButton);
        buttonPanel.add(operatorButtons[3]);

        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        currentOperator = "";
        firstOperand = 0;
        isTypingSecondOperand = false;

        setupOperatorButtonListeners();
        setupEqualsButtonListener();
        setupClearButtonListener();
        setupNumberButtonListeners();
        setupRadixButtonListeners();

        frame.setVisible(true);
        
    }

    private void setupOperatorButtonListeners() {
        for (int i = 0; i < operatorButtons.length; i++) {
            final String operator = operatorButtons[i].getText();
            operatorButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    handleOperatorButton(operator);
                }
            });
        }
    }

    private void setupEqualsButtonListener() {
        equalsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleEqualsButton();
            }
        });
    }

    private void setupClearButtonListener() {
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleClearButton();
            }
        });
    }

    private void setupNumberButtonListeners() {
        for (int i = 0; i < numberButtons.length; i++) {
            final int digit = i; // Capture the digit
            numberButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    handleNumberButton(digit); // Pass the digit to the handler
                }
            });
        }
    }

    private void handleNumberButton(int digit) {
        String currentText = textField.getText();
        textField.setText(currentText + digit);
    }

    private void handleOperatorButton(String operator) {
        if (isTypingSecondOperand) {
            performCalculation();
             // Clear the text field for the second operand
        }
        firstOperand = Double.parseDouble(textField.getText());
        isTypingSecondOperand = true;
        currentOperator = operator;
        textField.setText("");
    }

    private void handleEqualsButton() {
        if (isTypingSecondOperand) {
            performCalculation();
            isTypingSecondOperand = false;
            currentOperator = "";
        }
    }

    private void performCalculation() {
        double secondOperand = Double.parseDouble(textField.getText());
        double result = calculator.performOperation(firstOperand, secondOperand, currentOperator);
        textField.setText(String.valueOf(result));
    }

    private void handleClearButton() {
        textField.setText("");
        firstOperand = 0;
        isTypingSecondOperand = false;
        currentOperator = "";
    }
   
    
    private void setupRadixButtonListeners() {
   	 for (int i = 0; i < radixButtons.length; i++) {
   		 final int radixIndex = i; // Capture the index
   		 radixButtons[i].addActionListener(new ActionListener() {
   			 public void actionPerformed(ActionEvent e) {
   				 handleRadixButton(radixIndex);
   			 }
   		 });
   	 }
    }

    private void handleRadixButton(int radixIndex) {
   	 int currentValue = Integer.parseInt(textField.getText());
   	 String convertedValue = "";
   	 
   	 switch (radixIndex) {
   	 case 0: // HEX
   	 	convertedValue = calculator.convertToHex(currentValue);
   	 	 break; // DEC
   	 case 1:
   		 convertedValue = calculator.convertToDex(currentValue);
   		 break; // BIN
   	 case 2:
   		 convertedValue = calculator.convertToBin(currentValue);
   		 break;
   	 case 3: // OCT
   		 convertedValue = calculator.convertToOct(currentValue);
   		 break;
   	 
   	 }
   	 
   	 textField.setText(convertedValue);
    }

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorApp();
            }
        });
    }
}