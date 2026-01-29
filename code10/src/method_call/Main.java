package method_call;

public class Main {

    public static void main(String[] args) {

        //call by value
        int i1 = 10;
        System.out.println("i1 before call: " + i1);
        changeNumber(i1);
        System.out.println("i1 after call: " + i1);

        System.out.println("*****");

        //call by value
        String str1 = "java";
        System.out.println("str before call: " + str1);
        changeString(str1);
        System.out.println("str after call: " + str1);

        System.out.println("*****");

        //call by reference
        Person person = new Person(15, "ali");
        System.out.println("person before call: " + person.print());
        changePerson(person);
        System.out.println("person after call: " + person.print());
    }

    private static void changePerson(Person person) {
        person.name = person.name.toUpperCase();
        person.age = person.age + 1;
        System.out.println("person in method call: " + person.print());
    }

    private static void changeString(String str1) {
        str1 = str1.toUpperCase();
        System.out.println("str in method call: " + str1);
    }

    private static void changeNumber(int i1) {
        i1 *= 2;
        System.out.println("i1 in method call: " + i1);
    }
}
