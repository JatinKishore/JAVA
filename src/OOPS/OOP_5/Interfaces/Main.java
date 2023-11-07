package OOPS.OOP_5.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Car();
        car.acc();
        car.brake();
        System.out.println(car.current_speed(2));

        Engine electric = new ElectricEngine();
        NiceCar niceCar = new NiceCar(electric);
        niceCar.start();

      }
}
