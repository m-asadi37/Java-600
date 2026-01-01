import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //immutable
        String str1 = "java php python php c++ django";
        String res = str1.toUpperCase();
        System.out.println(res);
        System.out.println(str1);
        System.out.println(res.toLowerCase());

        System.out.println(str1.length());

        char c = str1.charAt(6);
        System.out.println(c);

        System.out.println(str1.indexOf('y'));
        System.out.println(str1.indexOf('p', 10));
        System.out.println(str1.indexOf("++"));
        System.out.println(str1.indexOf('?'));
        System.out.println(str1.lastIndexOf('h'));

        System.out.println(str1.substring(10));
        System.out.println(str1.substring(10, 15));

        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = new String("aaa");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s3.intern());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase("AAa"));

        String username = "  a@1234  123 112  ";
        System.out.println(username.trim());

        System.out.println(str1.replace('h', 'H'));
        System.out.println(str1.replace("++", "--"));
        System.out.println(str1.replaceFirst("php", "c#"));

        System.out.println(str1.contains("999"));
        System.out.println(str1.startsWith("java"));
        System.out.println(str1.endsWith("111"));

        System.out.println(str1);

        String s = "";
        System.out.println(s.isEmpty());
        s = " ";
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());

        char[] arr1 = str1.toCharArray();
        System.out.println(Arrays.toString(arr1));

        byte[] arr2 = str1.getBytes();
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = str1.split(" ");
        System.out.println(Arrays.toString(arr3));
        arr3 = str1.split("h");
        System.out.println(Arrays.toString(arr3));

        String r = String.join("-", "1", "2", "3", "4", "5");
        System.out.println(r);
        System.out.println(String.join("-", arr3));
        System.out.println(String.join("h", arr3));

        String formatted = String.format("Name : %s - Age : %d", "Amir Mohammad", 15);
        System.out.println(formatted);

        System.out.println("A".compareTo("A"));
        System.out.println("1403-01-01".compareTo("1403-01-10"));

        for (int i = 1; i <= 5; i++) {
            System.out.println("*".repeat(i));
        }

        String email = "1122aaa@mail.com";
        System.out.println(email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"));
    }
}
