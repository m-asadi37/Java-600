package pack3;


public class Person {

    //Encapsulation

    //1- private access modifiers for properties in the class
    //2- define public GETTER and SETTER for each property

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}
