package OOP_5.Interfaces;

public class Car implements Engine,brakes,Media{// implements is used to include interfaces.. interfaces support multiple level inheritance.. we can use extend between interfaces to inherit their properties
    @Override
    public void start() {
        System.out.println("The Car is been Started");
    }



    @Override
    public void stop() {

        System.out.println("Hey someone apply the brake");
    }

    @Override
    public void acc() {
        System.out.println("What a speed");
    }

    @Override
    public void brake() {
        System.out.println("Step teh brake");
    }

    @Override
    public int current_speed(int a) {
        return a;
    }


}
