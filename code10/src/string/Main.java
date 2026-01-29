package string;

public class Main {


    public static void main(String[] args) {

        //1. operator +
        long start = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 = s1 + "*";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println("********");

        //2. concat
        s1 = "";
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s1 = s1.concat("*");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println("********");

        //3. StringBuffer
        StringBuffer sb = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("*");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("********");

        //4. StringBuilder
        StringBuilder sb2 = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb2.append("*");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
