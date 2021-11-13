package ru.mirea.practiceOne;
import java.lang.*;
import ru.mirea.practiceOneClasses.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Dog" + System.lineSeparator());
        Dog doge1 = new Dog("Mike", 2);
        Dog doge2 = new Dog("Helen", 7);
        Dog doge3 = new Dog("Good Boi");
        doge3.setAge(1);
        System.out.println(doge1);
        doge1.intoHumanAge();
        doge2.intoHumanAge();
        doge3.intoHumanAge();

        System.out.println(System.lineSeparator() + "Test Ball" + System.lineSeparator());
        Ball ball1 = new Ball("green", 435);
        Ball ball2 = new Ball("yellow", 178.9);
        Ball ball3 = new Ball();
        ball3.setWeight(800);
        System.out.println(ball1);
        ball1.checkWeight();
        ball2.checkWeight();
        ball3.checkWeight();

        System.out.println(System.lineSeparator() + "Test Book" + System.lineSeparator());
        Book book1 = new Book("A Storm of Swords", 973, 487.4);
        Book book2 = new Book("The Horus Heresy", 412, 9000);
        Book book3 = new Book("The Fifth Elephant", 336);
        book3.setPagesRead(335);
        System.out.println(book1);
        book1.finalCheck();
        book2.finalCheck();
        book3.finalCheck();
    }
}
