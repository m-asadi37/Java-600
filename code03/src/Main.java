import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {

        System.out.printf("name is : %-15s%n", "amir ali");
        System.out.printf("PI number is : %+010.3f%n", Math.PI);
        System.out.printf("number 2 is : %,d", 1234560000);
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);

        int int1 = scan.nextInt();

        System.out.println(int1 + 10);

        String str1 = scan.next();
        System.out.println(str1);

        System.out.println("has any token? " + scan.hasNextInt());

        String str2 = scan.next();
        System.out.print(str2);

        scan.nextLine();

        String name = scan.nextLine();
        System.out.println(name);

        System.out.println("*****");

        scan.useDelimiter("\n");

        String str3 = scan.next();
        System.out.println(str3);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        double c = 10.0 / 3.0;
        //int result = a + b
        //System.out.print(result)
        System.out.println(a / b);

        System.out.println(c);

        System.out.println(10 % 3);


        int i1 = 10;
        int i2 = i1++;
        //i2 = i1
        //i1 = i1 + 1
        System.out.println("i1 : " + i1);
        System.out.println("i2 : " + i2);

        i1 = 10;
        i2 = ++i1;
        //i1 = i1 + 1
        //i2 = i1
        System.out.println("i1 : " + i1);
        System.out.println("i2 : " + i2);

        i1 = 10;
        i2 = --i1;
        System.out.println("i1 : " + i1);
        System.out.println("i2 : " + i2);

        i1 += 5;
        //i1 = i1 + 5
        System.out.println("i1 : " + i1);
        System.out.println("i1 - 5: " + (i1-=5));

        i1 = 10;
        i1 %= 3;
        //i1 = i1 % 3
        System.out.println(i1);

        System.out.println(10 == 12);
        System.out.println(10 != 12);
        System.out.println(10 <= 12);
    }
}
