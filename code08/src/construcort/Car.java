package construcort;

public class Car {

    //constructor

    //default
    Car() {
        System.out.println("construcort.Car Constructor 1....");
    }

    Car(String carPlate){
        System.out.println("construcort.Car Constructor 2....");
        plate = carPlate;
    }

    Car(String plate, String colour) {
        System.out.println("construcort.Car Constructor 3....");
        //2 == 2
        //this : object is creation...
        this.colour = colour;   //input value
        this.plate = plate;
        this.km = 0;            //default value
    }

    String plate;
    String colour;
    int km;

    //method
    void move() {
        System.out.printf("construcort.Car move : %s - km : %d%n", plate, ++km);
    }
}
