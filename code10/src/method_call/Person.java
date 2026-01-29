package method_call;

public class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    String print() {
        return String.format("age: %d name: %s", age, name);
    }
}
