package HW20_11_2023;

import java.util.Random;
import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        //  Необходимо написать программу,
        //  которая проверяет пользователя на знание таблицы умножения.
        //  Программа генерирует два целых однозначных числа.
        //  Программа задаёт вопрос: результат умножения первого числа на второе?
        //  Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет.
        //  Если пользователь ответил неправильно, то программа должна показать правильный ответ.

        Random rnd = new Random();
        System.out.println("Какой результат умножения? ");
        int num1 = rnd.nextInt(10);
        System.out.println("Первое число: " + num1);
        int num2 = rnd.nextInt(10);
        System.out.println("Второе число: " + num2);
        int result = num1 * num2;
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите ответ: ");
        int answer = scr.nextInt();
        if (answer == result)
            System.out.println("Это правильный ответ! ");
        if (answer != result)
            System.out.println("Это не правильный ответ! " + "Правильный ответ: " + result);
    }
}
