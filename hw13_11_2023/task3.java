package hw13_11_2023;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        // Задание №3
        Scanner scr = new Scanner(System.in);
//     System.out.println("Напишите два целых чиcла: ");
        System.out.println("Напишите 1ое целое число: ");
        int i = scr.nextInt();
        System.out.println("Напишите 2ое целое число: ");
        int in = scr.nextInt();
        System.out.println("Сложение: " + (i + in));
        System.out.println("Вычитание: " + (i - in));
        System.out.println("Умножение: " + (i * in));
        System.out.println("Деление: " + (i / in));
    }
}
