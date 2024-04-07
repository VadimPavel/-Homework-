package HW20_11_2023;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        // Элвис Пресли жил с 1935 по 1977 год.
        // Используя тернарные операторы,
        // напишите программу, в которой пользователь вводит год.
        // Если указанный год меньше 1935, то вывести «Элвис ещё не родился».
        // Если указанный пользователем год с 1935 по 1977 включительно, то вывести «Элвис жив!».
        // Если введённый пользователем год больше 1977, то вывести «Элвис навсегда в наших сердцах!»

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите год: ");
        int num = scr.nextInt();
        int year2 = 1935;
        int year3 = 1977;
        System.out.println((num < year2 ? "Элвис ещё не родился." : "") + (num >= year2 && num <= year3 ? "Элвис жив!" : "") + (num > year3 ? "Элвис в наших сердцах!" : ""));

        //  /* if (num < year2)
        //            System.out.println("Элвис ещё не родился.");
        //        if (num >= year2 && num <= year3)
        //            System.out.println("Элвис жив!" );
        //        if (num > year3)
        //            System.out.println("Элвис в наших сердцах!");*/   Я сначала сделал через if, чтоб понять как и потом составил выражение в print
    }
}
