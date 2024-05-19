package hw08_11_2023;

public class NumberFree_AllNumber_Letter {
    public static void main(String[] args) {
        // вывести в консоль результат
        char v = 'G';
        System.out.println(v);
        int a = 89;
        System.out.println(a);
        byte d = 4;
        System.out.println(d);
        short i = 56;
        System.out.println(i);
        float m = 4.7333436f;
        System.out.println(m);
        double p = 4.355453532;
        System.out.println(p);
        long f = 12121;
        System.out.println(f);

        // вывести на экран трехназначное число и 345 -> 3,4,5
        System.out.println("Вывод всех цифр числа: 345");
        int abc = 345;
        int a1 = abc / 100;
        int b = abc / 10 % 10;
        int c = abc % 10;
        //  System.out.println((a1) + "," + (b) + "," + (c));
        System.out.println(a1);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Вывод всех цифр числа: 987");
        int zxn = 987;
        int z = zxn / 100;
        int x = zxn / 10 % 10;
        int n = zxn % 10;
        // System.out.println((z) + "," + (x) + "," + (n));
        System.out.println(z);
        System.out.println(x);
        System.out.println(n);
    }
}

