package ru.mirea.practiceThreeClasses;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.ySpeed = ySpeed;
        this.topLeft.xSpeed = xSpeed;
        this.bottomRight.xSpeed = xSpeed;
    }
    public String toString() {
        return "Movable rectangle with width "+(this.topLeft.y - this.bottomRight.y)+" and length"+
                (this.bottomRight.x - this.topLeft.x)+"and with xSpeed = "+this.topLeft.xSpeed+
                " and ySpeed = "+this.topLeft.ySpeed;
    }

    @Override
    public void moveUp() {
        this.topLeft.y += topLeft.ySpeed;
        this.bottomRight.y += bottomRight.ySpeed;
    }
    @Override
    public void moveDown() {
        this.topLeft.y -= topLeft.ySpeed;
        this.bottomRight.y -= bottomRight.ySpeed;
    }
    @Override
    public void moveLeft() {
        this.topLeft.x -= topLeft.xSpeed;
        this.bottomRight.x -= bottomRight.xSpeed;
    }
    @Override
    public void moveRight() {
        this.topLeft.x += topLeft.xSpeed;
        this.bottomRight.x += bottomRight.xSpeed;
    }
}
