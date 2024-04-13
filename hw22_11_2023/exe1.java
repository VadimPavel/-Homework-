package hw22_11_2023;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        System.out.println("Сколько лет вы в браке? ");
        Scanner sc = new Scanner(System.in);

        int userNum = sc.nextInt();
        String anniversaryName = switch (userNum + 1) {
            case 1 -> "Ситцевая";
            case 2 -> "Бумажная";
            case 3 -> "Кожаная";
            case 4 -> "Льняная";
            case 5 -> "Деревянная";
            case 6 -> "Чугунная";
            case 7 -> "Медная";
            case 8 -> "Жестяная";
            case 9 -> "Фаянсовая";
            case 10 -> "Оловянная";
            case 11 -> "Стальная";
            case 12 -> "Никелевая";
            case 13 -> "Кружевная";
            case 14 -> "Агатовая";
            case 15 -> "Хрустальная";
            default -> throw new IllegalStateException("Такой год годовщины " + userNum + " лет " + "нет в программе! ");
          //  default -> "Такой год годовщины " + userNum + " лет " + "нет в программе! ";
        };
        System.out.println("Следующая годовщина у вас: " + anniversaryName);
    }
}
