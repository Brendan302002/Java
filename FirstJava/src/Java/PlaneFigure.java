package Java;
/*
 * This abstract superclass planefigure takes the shape from either the default case or the set case, 
 * and returns the string name, as well as sets abstract class perimeter and area
 * @author Brendan Goddard
 * @date 06/04/2023
 *
 */

abstract class PlaneFigure {

    // Declare private string
    private String shape;

    public PlaneFigure(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public abstract double findPerimeter();

    public abstract double findArea();

    public String toString() {
        return "the objects type is a " + shape;
    }

}
