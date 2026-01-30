package pack1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        double r = 10;
        double area = 2 * r * Math.PI;
        System.out.println(area);

        System.out.println(Math.min(1, 2));
        System.out.println(Math.abs(-10.0));

        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(64));
        System.out.println(Math.pow(32, 1.0 / 5.0));

        System.out.println(Math.round(10.8));
        System.out.println(Math.round(10.2));
        System.out.println(Math.floor(10.8));
        System.out.println(Math.ceil(10.8));

        double angle = Math.toRadians(90);
        System.out.println(Math.sin(angle));

        System.out.println(Math.toDegrees(Math.PI / 6.0));

        System.out.println(Math.asin(1));

        System.out.println(Math.log10(1000));

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }

        System.out.println("*****");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(10, 20);
            System.out.println(n);
        }
    }
}
