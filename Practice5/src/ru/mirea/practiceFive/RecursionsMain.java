package ru.mirea.practiceFive;

public class RecursionsMain {

    public static void naturalNumbers(int n) {
        if (n == 1)
            System.out.print(1+" ");
        else {
            naturalNumbers(n - 1);
            System.out.print(n+" ");
        }
    }

    public static void fromAtoB(int A, int B) {
        if (A == B)
            System.out.print(A+" ");
        else if (A < B) {
            fromAtoB(A, B - 1);
            System.out.print(B+" ");
        }
        else {
            fromAtoB(A, B + 1);
            System.out.print(B+" ");
        }
    }

    public static int specifiedSumCounter(int len, int sum, int k, int s) {
        if (len == k)
            return (sum == s ? 1 : 0);
        int startNum = (len == 0 ? 1 : 0);
        int counter = 0;
        for (int i = startNum; i < 10; i++) {
            counter += specifiedSumCounter(len + 1, sum + i, k, s);
        }
        return counter;
    }

    public static int sumDigits(int N) {
        if (N < 10)
            return N;
        else
            return N % 10 + sumDigits(N / 10);
    }

    public static boolean primeCheck(int n, int i) {
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % i == 0)
            return false;
        else if (i < n/2)
            return primeCheck(n, i + 1);
        else
            return true;
    }

    public static void main(String[] args) {
        System.out.print("Вывод последовательности от 1 до 5: ");
        naturalNumbers(5);
        System.out.print(System.lineSeparator());
        System.out.print("Числа от 78 до 69: ");
        fromAtoB(78, 69);
        System.out.print(System.lineSeparator());
        System.out.print("Кол-во 3-значных чисел сумма цифр которых = 13: ");
        System.out.println(specifiedSumCounter(0,0, 3, 13));
        System.out.print("Сумма цифр числа 9386 = ");
        System.out.println(sumDigits(9386));
        System.out.print("Является ли число 67 простым? ");
        System.out.println((primeCheck(67, 2) ? "Да" : "Нет"));
    }
}
