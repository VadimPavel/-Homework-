package hw13_11_2023;

import java.util.Random;
import java.util.UUID;

public class task1 {
    public static void main(String[] args) {
        // Задание №1(ПЕРВЫЙ ПУНКТ)
        Random rnd = new Random();
        byte b = (byte) rnd.nextInt(128);
        short sh = (short) rnd.nextInt(100);
        char ch = (char) rnd.nextInt('A', 'W');
        int i = rnd.nextInt(-50, 60);
        float fl = rnd.nextFloat(0, 5);
        long l = rnd.nextLong(-100, 900);
        double db = rnd.nextDouble(10, 23);
        System.out.println("<< 1 ЗАДАНИЕ >>");
        // вариант в строку \\
        System.out.println(("byte: " + b)
                + (" short: " + sh)
                + (" char: " + ch)
                + (" int: " + i)
                + (" float: " + fl)
                + (" long: " + l)
                + (" double: " + db));
        // вариант в столбик \\
        System.out.println("byte: " + b);
        System.out.println("short: " + sh);
        System.out.println("char: " + ch);
        System.out.println("int: " + i);
        System.out.println("float: " + fl);
        System.out.println("long: " + l);
        System.out.println("double: " + db);

        // (ВТОРОЙ ПУНКТ)
        // способ 1
        System.out.println("<< 2 ЗАДАНИЕ >>");
        String str = String.valueOf(rnd.nextInt(100, 500));
        System.out.println(str);

        // способ 2
        String charStr = "" + (char) rnd.nextInt('A', 'S' + 1) + (char) rnd.nextInt('A', 'S' + 1) + (char) rnd.nextInt('A', 'S' + 1) + (char) rnd.nextInt('A', 'S' + 1) + (char) rnd.nextInt('A', 'S' + 1) + (char) rnd.nextInt('A', 'S' + 1);
        System.out.println(charStr);

        // 3 способ
        UUID id = UUID.randomUUID();
        String str2 = id.toString();
        System.out.println(str2);
    }
}
