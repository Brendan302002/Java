// Date: 8/6/2023 
// Author: Brendan Goddard
// Program Name: BG Used Car App
// Purpose: To create a car search app (minus the proper functionality) that allows
// user to see an example of a car search app, with buttons and text boxes for searching

package BG_UsedCarApp;


import javax.swing.*;
import java.awt.*;


public class BG_UsedCarApp extends JFrame {
    
    public BG_UsedCarApp() {
        //Set titles, size, and close operation
        setTitle("Brendan's Used Car Search App");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Setup the panels for the app
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel criteriaPanel = new JPanel(new GridLayout(0, 1, 10, 10));
        JPanel enginePanel = new JPanel(new GridLayout(0,1,10,10));
        JPanel  optionsPanel = new JPanel(new GridLayout(0,1,10,10));
        
        //Setup the first label aboce the search boxes
        JLabel criteriaLabel = new JLabel("Car Search Criteria");

        //Search field for make of car
        JTextField makeField = new JTextField("Make");
        makeField.setPreferredSize(new Dimension(200, 35));
        makeField.setBorder(BorderFactory.createEmptyBorder());
        makeField.setForeground(Color.BLACK);

        //Search field for model of car
        JTextField modelField = new JTextField("Model");
        modelField.setPreferredSize(new Dimension(200, 30));
        modelField.setBorder(BorderFactory.createEmptyBorder());
        modelField.setForeground(Color.BLACK);

        //Search field for year of car
        JTextField yearField = new JTextField("Year");
        yearField.setPreferredSize(new Dimension(200, 30));
        yearField.setBorder(BorderFactory.createEmptyBorder());
        yearField.setForeground(Color.BLACK);

        //add all the above fields and label to the panel for car criteria
        criteriaPanel.add(criteriaLabel);
        criteriaPanel.add(makeField);
        criteriaPanel.add(modelField);
        criteriaPanel.add(yearField);

        //New label for engine type and set all the buttons, for gas diesel hybrid and electric
        JLabel engineLabel = new JLabel("Engine Type");
        JRadioButton gasolineButton = new JRadioButton("Gasoline");
        JRadioButton dieselButton = new JRadioButton("Diesel");
        JRadioButton hybridButton = new JRadioButton("Hybrid");
        JRadioButton electricButton = new JRadioButton("Electric");

        //Set a button group, so that the user can only select one (mutually exclusive)
        ButtonGroup engineGroup = new ButtonGroup();
        engineGroup.add(gasolineButton);
        engineGroup.add(dieselButton);
        engineGroup.add(hybridButton);
        engineGroup.add(electricButton);

        //Set the options label, with the options for the car
        JLabel optionsLabel = new JLabel("Options");
        JCheckBox airCondition = new JCheckBox("Air Conditioning");
        JCheckBox powerWindow = new JCheckBox("Power Windows");
        JCheckBox standardTrans = new JCheckBox("Standard Transmission");


        //Basic search button at the bottom
        JButton search = new JButton("Submit");

        //Add engine elements to the engine panel
        enginePanel.add(engineLabel);
        enginePanel.add(gasolineButton);
        enginePanel.add(dieselButton);
        enginePanel.add(hybridButton);
        enginePanel.add(electricButton);

        //Add option elements to the options panel
        optionsPanel.add(optionsLabel);
        optionsPanel.add(airCondition);
        optionsPanel.add(powerWindow);
        optionsPanel.add(standardTrans);
        optionsPanel.add(search);
        
        //Add all the panels, criteria options and engine to the main panel, and place them relative to example
        mainPanel.add(criteriaPanel, BorderLayout.WEST);
        mainPanel.add(enginePanel, BorderLayout.CENTER);
        mainPanel.add(optionsPanel, BorderLayout.EAST);
        add(mainPanel);
    }

    public static void main(String[] args) {

        //Run the App
        SwingUtilities.invokeLater(() -> {
            BG_UsedCarApp app = new BG_UsedCarApp();
            app.setVisible(true);
        });
    }
    
}
