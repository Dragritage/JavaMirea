package ru.mirea.practiceTwo;
import ru.mirea.practiceTwoClasses.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Author" + System.lineSeparator());
        Author a1 = new Author("Arthur C. Clarke", "theFountainsOfParadise@gmail.com", 'M' );
        Author a2 = new Author("Charles Dickens", "A-ChristmasCarol1843@yandex.ru",'M');
        a1.setEmail("SpaceOdyssey2001@gmail.com");
        System.out.println(a1);
        System.out.println(a2);

        System.out.println(System.lineSeparator() + "Test Ball" + System.lineSeparator());
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.setY(138);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
