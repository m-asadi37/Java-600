public class Car {

    //properties
    String colour;
    String model;
    int km;
    double price;

    //method
    //void : no return result
    void move(String source, String destination) {
        System.out.println("car is moving from " + source + " to " + destination);
        km++;
        System.out.println("km : " + km);
    }

    void increasePrice(double value) {
        price += value;
        System.out.println("price : " + price);
    }

    String info() {
        String str = model + " " + colour + " " + km + " " + price;
        return str;
    }

    String[] test() {
        String[] arr = {model, colour};
        return arr;
    }
}