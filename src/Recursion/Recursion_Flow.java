package Recursion;

public class Recursion_Flow
{
    public static void main(String[] args) {

        Mom();
    }
    static void Mom(){
        System.out.println("Buy Bru");
        boy1();

    }
    static void boy1(){
        System.out.println("Buy Bru");
        boy2();
        System.out.println("Got Bru");
    }
    static void boy2(){
        System.out.println("Buy Bru");
        boy3();
        System.out.println("Got Bru");
    }
    static void boy3(){
        System.out.println("Got Bru");

    }
}
