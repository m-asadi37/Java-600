public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Ford";
        car1.colour = "Red";
        car1.km = 0;
        car1.price = 10000;
        car1.move("azadi", "baharestan");

        Car car2 = new Car();
        car2.model = "Audi";
        car2.colour = "Blue";
        car2.km = 0;
        car2.price = 13000;
        car2.move("vanak", "tajrish");
        car2.increasePrice(500);

        String result1 = car1.info();
        System.out.println(result1);

        Calculator calc = new Calculator();
        System.out.println(calc.sum(10,12));
    }
}
