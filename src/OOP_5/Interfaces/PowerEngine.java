package OOP_5.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("start the powerfuk engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop the powerful egine");
    }

    @Override
    public void acc() {
        System.out.println("Habibi");
    }
}
