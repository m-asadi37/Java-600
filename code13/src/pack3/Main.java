package pack3;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Aaa");
        p1.setAge(20);
        p1.print();

        System.out.println("name: " + p1.getName());
        System.out.println("age: " + p1.getAge());
    }
}
