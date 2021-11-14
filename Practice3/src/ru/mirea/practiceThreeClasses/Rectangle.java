package ru.mirea.practiceThreeClasses;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.colour = "red";
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length) {
        this.filled = false;
        this.colour = "red";
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String colour, boolean filled) {
        this.width = width;
        this.length = length;
        this.colour = colour;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return this.width*this.length;
    }
    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }
    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length+", colour: "+this.colour;
    }
}
