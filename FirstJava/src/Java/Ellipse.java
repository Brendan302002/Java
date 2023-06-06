package Java;
/*
 * Ellipse, the subclass of planefigure, takes the major minor axis and color, and calculates the perimeter
 * and area using the superclasses abstract methods. In addition, there is an instantiated base case of ellipse
 * where values are 1.0, 1.0, and black. The print method in the subclass calls the superclass method and concatenates more
 * text onto it explaining side lengths
 * @author Brendan Goddard
 * @date 06/04/2023
 *
 */

import java.lang.Math;

public class Ellipse extends PlaneFigure {
    
    //Declare private color, major and minor axis variables
    private double majorAxis;
    private double minorAxis;
    private String color;

    /**
    * Default constructor initializing all fields to default. 
    */
    public Ellipse() {
        super("Ellipse");
        majorAxis = 1.0;
        minorAxis = 1.0;
        color = "black";
    }
    
    
    /**
    * Constructor initializing minor major axis as well
    * as color of ellipse
    * @param majorAxis major axis of ellipse
    * @param minorAxis minor axis of ellipse
    * @param color color of ellipse
    */ 

    public Ellipse(double majorAxis, double minorAxis, String color) {
        super("Ellipse");
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
        this.color = color;
    }
    
    public double getMajorAxis() {
        return majorAxis;
    }
     
    public double getMinorAxis() {
        return minorAxis;
    }

    public String getColor() {
        return color;
   }

    public void setMajorAxis(double semiMajorAxis) {
        majorAxis = semiMajorAxis;
    }

    public void setMinorAxis(double semiMinorAxis) {
        minorAxis = semiMinorAxis;
    }

    /**
    * Finds the perimeter given major and minor axis
    * @param majorAxis major axis of ellipse
    * @param minorAxis minor axis of ellipse
   */

    @Override
    public double findPerimeter() {

        double a = majorAxis / 2;
        double b = minorAxis / 2;

        double perimeter;
        perimeter = 2 * Math.PI * Math.sqrt((a*a) + (b*b) / 2);

        return perimeter;

    }

    /**
    * Returns perimeter as a double
    * @return perimeter represents ellipse perimeter
    */

    /**
    * Finds the area of the ellipse given major and minor axis
    * @param majorAxis major axis of ellipse
    * @param minorAxis minor axis of ellipse
   */

    @Override
    public double findArea() {

        double area;
        area = Math.PI * (majorAxis /2 ) * (minorAxis / 2);

        return area;

    }

    /**
    * Returns area as a double
    * @return area as a double represents the value of ellipse area
    */

    @Override
    public String toString() {
        return super.toString() + " ,the major axis length is " + majorAxis + ", the minor axis length is " + minorAxis + " and the color of ellipse is " + color;
    }
}
