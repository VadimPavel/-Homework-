package hw27_11_2023;

import java.util.Scanner;

public class RepeatProgram {
    // Используйте for для вычисления суммы.
    // Используйте do-while для организации повторения программы.
    // Необходимо суммировать все нечётные целые числа в диапазоне,
    // введённом пользователем. Программу повторять, пока пользователь не введёт «quit».
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum;
        int sum;
        String user;
        do {
            System.out.println("Введите число: ");
            userNum = Integer.parseInt(sc.nextLine());
            sum = 0;
            System.out.print("Нечетные числа:");
            for (int num = 0; num <= userNum; num++) {
                num = num + 1;
                sum += num;
                System.out.print(" " + num);
            }
            System.out.printf("%nСумма нечётных = " + sum);

            user = "";
            System.out.printf("%nQuit завершить - нажать Enter для продолжения: " + user);
            user = sc.nextLine();
        } while (!user.equalsIgnoreCase("quit"));
            System.out.println("Программа завершена!");
    }
}
