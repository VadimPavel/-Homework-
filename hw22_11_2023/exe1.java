package hw22_11_2023;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        System.out.println("Сколько лет вы в браке? ");
        Scanner sc = new Scanner(System.in);

        int userNum = sc.nextInt();
        Anniversary yearName = switch (userNum + 1) {
            case 1 -> Anniversary.СИТЦЕВАЯ;
            case 2 -> Anniversary.БУМАЖНАЯ;
            case 3 -> Anniversary.КОЖАНАЯ;
            case 4 -> Anniversary.ЛЬНЯНАЯ;
            case 5 -> Anniversary.ДЕРЕВЯННАЯ;
            case 6 -> Anniversary.ЧУГУННАЯ;
            case 7 -> Anniversary.МЕДНАЯ;
            case 8 -> Anniversary.ЖЕСТЯНАЯ;
            case 9 -> Anniversary.ФАЯНСОВАЯ;
            case 10 -> Anniversary.ОЛОВЯННАЯ;
            case 11 -> Anniversary.СТАЛЬНАЯ;
            case 12 -> Anniversary.НИКЕЛЕВАЯ;
            case 13 -> Anniversary.КРУЖЕВНАЯ;
            case 14 -> Anniversary.АГАТОВАЯ;
            case 15 -> Anniversary.ХРУСТАЛЬНАЯ;
            default -> throw new IllegalStateException("Такой год годовщины " + userNum + " лет " + "нет в программе! ");
          //  default -> "Такой год годовщины " + userNum + " лет " + "нет в программе! ";
        };
        System.out.println("Следующая годовщина у вас: " + yearName);
    }
}
