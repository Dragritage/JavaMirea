package ru.mirea.practiceThreeClasses;

public class Square extends Rectangle {
    protected double width;
    protected double length;

    public Square() {}
    public Square(double side) {
        this.filled = false;
        this.colour = "red";
        this.width = side;
        this.length = side;
    }
    public Square(double side, String colour, boolean filled) {
        this.width = side;
        this.length = side;
        this.colour = colour;
        this.filled = filled;
    }
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }
    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
    public String toString() {
        return "Shape: square, side: "+this.width+", colour: "+this.colour;
    }
}
