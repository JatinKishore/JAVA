package OOP_5.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electic Engien stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelrate");
    }
}
