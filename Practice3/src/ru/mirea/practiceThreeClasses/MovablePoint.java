package ru.mirea.practiceThreeClasses;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "Movable point ("+this.x+", "+this.y+"), with xSpeed = "+this.xSpeed+" and ySpeed = "+this.ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += ySpeed;
    }
    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }
    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }
    @Override
    public void moveRight() {
        this.x += xSpeed;
    }
}
