package OOPS.OOP_5.Abstract;

public class Son extends Parent {

    Son(int a){
        super(a);
    }



    @Override
    void career() {
        System.out.println("I am going to be a Joker");
    }

    @Override
    void partner() {
        System.out.println("Sorry Say no to love");
        System.out.println("Age is just a number");
    }
}
