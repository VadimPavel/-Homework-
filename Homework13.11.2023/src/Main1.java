import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Задание №2
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String str = scr.nextLine();
        System.out.println("Сколько вам полных лет?: ");
        int i = scr.nextInt();
        System.out.println("Какой у вас вес?: ");
        double db = scr.nextDouble();
        System.out.println("Уважаемый, " + str + "!");
        System.out.println("В свои " + i + "лет Вы для нас дороги," + "как " + db + "килограмма золота.");
        //  System.out.println("Уважаемый," + str + "!" + "В свои " + i + "лет Вы для нас дороги," + "как " + db + "килограмма золота.>>");
    }
}
