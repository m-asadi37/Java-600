package pack1;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        test.pub = 10;
        test.prot = 20;
//        test.prv = 30;
        test.def = 40;

        test.print();
    }
}
