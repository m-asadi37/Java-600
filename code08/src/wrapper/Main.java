package wrapper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //primitive : not null (default value) - value only (not detail or method)
        int i1 = 10;
        double d1 = 10.0;
        boolean b1 = true;
        char c1 = 'a';

        //Wrapper Class : non primitive
        Integer i2 = 10;
        int ii = i2.intValue();
        System.out.println(i2.doubleValue());
        int min = Integer.min(10, 12);
        int strInt = Integer.parseInt("1234");
        System.out.println(strInt + 10);

        Double d2 = 10.0;

        Boolean b2 = true;

        Character c2 = 'a';

        //boxing
        int int1 = 10;
        Integer int2 = int1;

        //unboxing
        Character char1 = 'c';
        char char2 = char1;

        //cast
        double do1 = 10.7;
        int int3 = (int) do1;
        System.out.println(int3);

        String[] str = new String[3];

        //collection
        List<Integer> list = new ArrayList<>();
        list.add(10);
    }
}
