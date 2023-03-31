import classes.*;
import classes.Math;

public class Main {
    public static void main(String[] args) {
        new Test();

        new Circle(6);

        new User("Max");
        new User("Johny", true);

        new Rocket();

        new Person("John", "Doe").printFormattedName();

        Car car = new Car();
        Car.Door[] doors = new Car.Door[4];
        car.setDoors(doors);

        System.out.println(new Math().sum1toN(3));
    }


}
