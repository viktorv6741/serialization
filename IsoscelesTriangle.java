package serialization;

import java.io.Serializable;

public class IsoscelesTriangle implements Shape, Serializable {

    private static final long serialVersionUID = 6447980223465528980L;

    private double base, side;

    //Constructor
////////////////////////////////////////////////////////////////////////////

    public IsoscelesTriangle(double base, double side) {
        this.base = base;
        this.side = side;
    }

    public IsoscelesTriangle() {
    }

    //Getters and Setters
////////////////////////////////////////////////////////////////////////////

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    private double getHeight() {
        return Math.sqrt(Math.pow(side, 2) - (Math.pow(base, 2) / 4));
    }

////////////////////////////////////////////////////////////////////////////

    @Override
    public double getPerimeter() {
        return (2 * side) + base;
    }

    @Override
    public double getArea() {
        return 0.5 * base * getHeight();
    }

////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "HEIGHT = " + getHeight() + '\n' +
                "BASE = " + base + '\n' +
                "SIDE = " + side + '\n' +
                "PERIMETER = " + getPerimeter() + '\n' +
                "AREA = " + getArea() + '\n';
    }
}
