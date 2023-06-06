package Java;
/*
 * This program takes the ellipse base case and outputs minor, major and color, as well
 * as perimeter and area of the ellipse. It also outputs one non-standardized case, and it tests 
 * every getter and setter method in ellipse.java and planefigure.java
 * @author Brendan Goddard
 * @date 06/04/2023
 * 
 */

public class BG_EllipseTest1 {

    public static void main(String[] args) {

        
        //Output for user, showing the functionality of the program 
        System.out.println("--This program tests all functionality first--\n");
        //Default constructor initialized
        Ellipse ellipse1 = new Ellipse();
        //Print out info related to default constructor
        System.out.println("For ellipse 1 length of major axis is " + ellipse1.getMajorAxis());
        System.out.println("For ellipse 1 length of minor axis is " + ellipse1.getMinorAxis());
        System.out.println("For ellipse 1 color is " + ellipse1.getColor());

        System.out.println("Ellipse 1 testing complete\n");
        //ellipse 2 constructor initialized
        Ellipse ellipse2 = new Ellipse(5.0, 3.0, "green");
        //Print out info related to ellipse2 constructor
        System.out.println("For ellipse 2 length of major axis is " + ellipse2.getMajorAxis());
        System.out.println("For ellipse 2 length of minor axis is " + ellipse2.getMinorAxis());
        System.out.println("For ellipse 2 color is " + ellipse2.getColor());

        System.out.println("Ellipse 2 testing complete \n");
        //Change values on ellipse 1 constructor
        ellipse1.setMajorAxis(12.5);
        ellipse1.setMinorAxis(8.5);
        //Print out info related to new ellipse 1 constructor
        System.out.println("Testing Ellipse 1 again with new values");
        System.out.println("For ellipse 1 length of major axis is " + ellipse1.getMajorAxis());
        System.out.println("For ellipse 1 length of minor axis is " + ellipse1.getMinorAxis());
        System.out.println("For ellipse 1 color is " + ellipse1.getColor());

        System.out.println("Ellipse 1 new value testing complete\n");
        //Print out info related to new ellipse 1 constructor from planefigure class
        System.out.println("Test toString, findArea, findPerimeter for ellipse1");
        System.out.println(ellipse1.toString());
        System.out.println(ellipse1.findArea());
        System.out.println(ellipse1.findPerimeter());
        System.out.println("Ellipse 1 toString, findArea, findPerimeter complete\n");
        //Print out info related to new ellipse 2 constructor from planefigure class
        System.out.println("Test toString, findArea, findPerimeter for ellipse2");
        System.out.println(ellipse2.toString());
        System.out.println(ellipse2.findArea());
        System.out.println(ellipse2.findPerimeter());
        System.out.println("Ellipse 1 toString, findArea, findPerimeter complete\n");


    }
    
}
