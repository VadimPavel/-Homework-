package HW20_11_2023;

import java.util.Random;

public class exe1 {
    public static void main(String[] args) {
        // Создать программу,
        // выводящую на экран ближайшее к 10 из двух чисел,
        // записанных в переменные m и n.
        // Числа могут быть, как целочисленные, так и дробные.
        // Например:
        // ввод: m=7, n=11
        // вывод: Число 11 ближе к 10.

        Random rnd = new Random();
        int n = rnd.nextInt(8);
        System.out.println(n);
        int m = rnd.nextInt(15);
        System.out.println(m);
        int xn = Math.abs(10 - n);
        int xm = Math.abs(10 - m);
        if (xn < xm)
            System.out.println("Ближайшее число к 10 m = " + xm);
        if (xn > xm)
            System.out.println("Ближайшее число к 10 n = " + xn);
        if (xn == xm)
            System.out.println("Оба одинаковы!");
    }
}
