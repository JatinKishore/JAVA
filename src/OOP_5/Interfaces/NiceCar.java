package OOP_5.Interfaces;

public class NiceCar {
    private Engine engine;
    private CDplayer player;

    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void upgradeEngine(){
        this.engine  = new ElectricEngine();
    }


    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }



}
