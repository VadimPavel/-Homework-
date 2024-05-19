package hw29_11_2023;

public class Multiplication {
    // Сделайте перегруженные методы для перемножения 2-х, 3-х и 4-х чисел.
    // В методе умножения 3-х чисел используйте вызов метода для 2-х чисел.
    // В методе умножения 4-х чисел – вызов метода для 3-х чисел.
    public static void main(String[] args) {
        int sum1 = getMultiplication(3, 20);
        System.out.println("Два чила = " + sum1);

        int sum2 = getMultiplication(5, 8, 9);
        System.out.println("Три числа = " + sum2);

        int sum3 = getMultiplication(2, 4, 6, 10);
        System.out.println("Четыре числа =" + sum3);
    }

    private static int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    private static int getMultiplication(int num1, int num2, int num3) {
        return getMultiplication(num1, num2) * num3;
    }

    private static int getMultiplication(int num1, int num2, int num3, int num4) {
        return getMultiplication(num1, num2, num3) * num4;
    }
}

