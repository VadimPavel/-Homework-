package hw29_11_2023;

import java.util.Scanner;

public class RecursiveFactorial {
    // Используя рекурсию,
    // написать метод вычисления факториала числа n (n!),
    // вводимого с клавиатуры.
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int user = new Scanner(System.in).nextInt();
        System.out.println("Факториал " + user + "!" + " = " + getFactorial(user));

    }

    private static int getFactorial(int n) {
        if (n == 1) return 1;
        return n * getFactorial(n - 1);
    }
}



