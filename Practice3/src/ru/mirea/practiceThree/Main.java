package ru.mirea.practiceThree;
import ru.mirea.practiceThreeClasses.*;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle(5.5, "red", false);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColour());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius()); // Только класс Circle имеет метод, getRadius(), в Shape его нет

        // Shape s2 = new Shape(); //Не будет работать т.к. Shape - абстрактный класс

        Rectangle r1 = new Rectangle(1.0, 2.0, "green", false);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColour());
        System.out.println(r1.getLength()); // В классе Shape нет метода get.Length() => работать с ним он не будет

        Square sq1 = new Square(6.6);
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColour());
        System.out.println(sq1.getSide());  // Метод get.Side есть только в классе Square => не может быть вызван
        System.out.println(sq1.getLength());// для объекта классов Shape или Rectangle
    }
}
