package hw22_11_2023;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        // Напишите консольную игру «Камень, ножницы, бумага».
        // Пользователь вводит свой выбор (в виде строки или числа).
        // Программа случайным образом делает свой выбор и выводит на экран.
        // Далее программа показывает, кто победитель – пользователь или программа.

        System.out.println("Введите свой выбор:");
        System.out.println(Arrays.toString(GameVar.values()));
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        GameVar user = GameVar.valueOf(userInput.trim().toUpperCase());

        Random rnd = new Random();
        int compNum = rnd.nextInt(3);
        GameVar comp = switch (compNum) {
            case 0 -> GameVar.STONE;
            case 1 -> GameVar.PAPER;
            default -> GameVar.SCISSORS;
        };
        System.out.println("Выбрал комп: " + comp);
        if (user == comp)
            System.out.println("Ничья!");
        else
            if (user == GameVar.STONE && comp == GameVar.SCISSORS
                    || user == GameVar.PAPER && comp == GameVar.STONE
                    || user == GameVar.SCISSORS && comp == GameVar.PAPER)
                System.out.println("Пользователь победил!");
            else System.out.println("Победил компьютер!");
    }
}
