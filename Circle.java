package serialization;

import java.io.Serializable;

public class Circle implements Shape, Serializable {

    private static final long serialVersionUID = 2447801253285493498L;

    private double radius;

    //Constructor
////////////////////////////////////////////////////////////////////////////

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    //Getters and Setters
////////////////////////////////////////////////////////////////////////////

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

////////////////////////////////////////////////////////////////////////////

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "RADIUS = " + radius + '\n' +
                "PERIMETER = " + getPerimeter() + '\n' +
                "AREA = " + getArea() + '\n';
    }
}