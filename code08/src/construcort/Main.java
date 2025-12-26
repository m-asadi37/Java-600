package construcort;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.plate = "1234";
        car1.colour = "red";
        car1.km = 10;
        car1.move();

        Car car2 = new Car("4567");
        car2.colour = "blue";
        car2.km = 5;
        car2.move();

        Car car3 = new Car("7680", "red");
        car3.move();

        Person p1 = new Person();
    }
}
