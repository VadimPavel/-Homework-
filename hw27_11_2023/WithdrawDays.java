package hw27_11_2023;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;

public class WithdrawDays {
    // Используйте foreach.
    // Дан Enum дней недели. 
    // Пользователь вводит имя текущего дня в консоль.
    // Программа должна вывести все дни недели, кроме данного.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DayOfWeek.values()));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String userStr = sc.nextLine().trim().toUpperCase();
        System.out.printf("%nДни недели: %n");

        for (String str : args) {
            System.out.println(str);
        }
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day != DayOfWeek.valueOf(userStr))
                System.out.print(day);
            System.out.println(" ");
        }
    }
}
