package serialization;

import java.io.Serializable;

public class Rectangle implements Shape, Serializable {

    private static final long serialVersionUID = 2635006707105234649L;

    private double width, height;

    //Constructor
////////////////////////////////////////////////////////////////////////////

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    //Getters and Setters
////////////////////////////////////////////////////////////////////////////

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

////////////////////////////////////////////////////////////////////////////

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return height + width;
    }

////////////////////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "WIDTH = " + width + '\n' +
                "HEIGHT = " + height + '\n' +
                "PERIMETER = " + getPerimeter() + '\n' +
                "AREA = " + getArea() + '\n';
    }
}
