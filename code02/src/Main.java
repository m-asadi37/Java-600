import java.util.OptionalInt;

public class Main {

    static int int1;
    static String str1;

    public static void main1(String[] args) {

        System.out.println(int1);
        System.out.println(str1);

        //primitive
        //1.value only
        //2.not null - default value (0 0.0 \u0000)

        //numeric
        //byte - 1
        //short - 2
        //int* - 4
        //long - 8 (l/L)

        int i1;
        i1 = 10;
        i1 = 14;

        long l1 = 14;
        long l2, L2 = 10L;

        long aA12_$;

        var i2 = 12;

        //decimal
        //float - 4 (f/F)
        //double* - 8
        double d1 = 10.20f;
        d1 = 100;

        char c1 = '\u0041';
        System.out.println(c1);

        //boolean - 1 bit - 0/1 true/false
        boolean b1 = true;
        b1 = 2 > 3;

        //non-primitive
        //value + method and detail
        //null

        //String
        String s1 = "java php python";
        s1 = "java\nphp\tpython";
        System.out.println(s1);

        s1 = "ali says : \"hello\"";
        System.out.println(s1);

        String s2 = """
                hello
                java    python
                char is : ' "" " " .
                """;

        System.out.println(s2);
    }

    public static void main(String[] args) {
        System.out.println("salam chetori?");
        System.out.println(123);
        boolean b1 = true;
        System.out.println(b1);

        System.out.print("java");
        System.out.print(123);
        System.out.println("python");

        System.out.printf("hello %s%n", "amir mohammad");
        System.out.printf("String : %s - Number : %d", "STR", 12);
    }
}
