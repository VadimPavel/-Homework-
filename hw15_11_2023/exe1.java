package hw15_11_2023;

public class exe1 {
    public static void main(String[] args) {
        // Данна длина в метрах.
        // Напишите программу, которая переводит указанное значение в км, мили, футы и аршины.
        // Введите начальное и конвертированные значения на экран.

        double meter = 150;
        System.out.println("Данна длинна: " + meter + "метров");

        System.out.println(">>Конвертированные значения<<");
        double km = 1000;
        System.out.println("Км: " + (meter / km));

        double ft = 0.3048;
        System.out.printf("Футы: %.2f%n", (meter / ft));

        double mile = 1609.344;
        System.out.printf("Мили: %.3f%n", (meter / mile));

        double ars = 0.7112;
        System.out.printf("Аршины: %.2f%n", (meter / ars));
        // Здесь использовал один оператор это / деление, через форматированный вывод printf.
        // Хотя можно и оператор умножение * и % деление с остатком использовать, но так проще думаю.
        // И конечно же остаток после запятой сократил, чтоб выглядел по-человечески.
    }
}
