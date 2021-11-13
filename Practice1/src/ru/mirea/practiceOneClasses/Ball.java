package ru.mirea.practiceOneClasses;

public class Ball {
    private String colour;
    private double weight;

    public Ball(String c, double w) {
        colour = c;
        weight = w;
    }

    public Ball(String c) {
        colour = c;
        weight = 50;
    }

    public Ball(double w) {
        colour = "red";
        weight = w;
    }

    public Ball() {
        colour = "red";
        weight = 430;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "This is a "+this.colour+" ball with a weight of "+this.weight;
    }

    public void checkWeight() {
        if (weight > 450) System.out.println(weight+" grams is a lot, the ball is too heavy");
        else if (weight < 250) System.out.println(weight+" grams is not enough, the ball is too light");
        else System.out.println(weight+" grams is ok, this ball is suitable");
    }
}
