package ru.mirea.practiceThreeClasses;

public abstract class Shape {
    protected String colour;
    protected boolean filled;

    Shape() {}
    Shape(String c, boolean f) {
        colour = c;
        filled = f;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
