package hw15_11_2023;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        // Пользователь-продавец вводит суммарную стоимость покупок
        // и сумму денег, которую дал покупатель.
        // Вывести сумму сдачи в виде "Х рублей и Y копеек"

        System.out.println("Продавец вводит суммарную стоимость: ");
        Scanner scr = new Scanner(System.in);
        double vendor = scr.nextDouble();
        System.out.println("Покупатель дал сумму: ");
        double client = scr.nextDouble();
        double change = client - vendor;
        int euro = (int) change;
        double cent = (change - euro) * 100;
        System.out.printf("Сдача: " +  euro + "euro " + "%.0fcent", cent);
    }
}
