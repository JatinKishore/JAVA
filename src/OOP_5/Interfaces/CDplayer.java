package OOP_5.Interfaces;

public class CDplayer implements Media{

    @Override
    public void start() {
        System.out.println("Play the music");
    }

    @Override
    public void stop() {
        System.out.println("Stop the music");
    }
}
