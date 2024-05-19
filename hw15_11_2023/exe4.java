package hw15_11_2023;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {

        // Пользователь вводит целое число.
        // Напишите программу, которая делит это число на 2 и выводит результат.
        // Остаток деления можно отбросить.
        // Операторы деления / и остаток от деления % применять нельзя.
        System.out.println("Введите число: ");
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println("Результат деления: " + (num >> 1));
    }
}
