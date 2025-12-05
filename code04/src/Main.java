import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {
        boolean a = true, b = true;
        boolean aANDb = a && b;
        System.out.println(aANDb);
        System.out.println(a || b);
        System.out.println(!a || b);

        //save
        String user = "aa";
        String pass = "bb";

        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = scan.nextLine();
        if (username.equals(user) && password.equals(pass))
            System.out.println("Yes");

        System.out.println(2 & 13);
    }

    public static void main2(String[] args) {
        int n = 5, m = 10;
        if (n < 0 && n < m)
            System.out.println("n is negative");
        else if (n < 10) {
            System.out.print("n is less ");
            System.out.println("than 10");
        } else {
            System.out.println("n is equal to 10");
        }

        switch (n) {
            case 1:
                System.out.println("SAT");
            case 2: {
                System.out.println("SUN");
            }
            case 3: {
                System.out.println("MON");
                break;
            }
            case 4:
                System.out.println("TUS");
//            case null:
//                System.out.println("null...");
            default:
                System.out.println("default value....");
        }
    }

    public static void main3(String[] args) {

        for (int i = 1; i < 10; i *= 2) {
            System.out.print("turn : ");
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((i * 10 + j) + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("do you want to exit ? (first time)");
        boolean isExit = scanner.nextBoolean();
        while (!isExit) {
            System.out.println("do you want to exit ? (while loop)");
            isExit = scanner.nextBoolean();
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i++);
        }

        do {
            System.out.println("do you want to exit ? (do-while loop)");
            isExit = scanner.nextBoolean();
        } while (!isExit);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if(i % 3 == 0)
                continue;
            if(i % 16 == 0)
                break;
            System.out.println("i : " + i);
        }

        System.out.println("end of program!");
    }
}
