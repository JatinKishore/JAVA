package OOPS.properties.polymorphism.types_of_polymorphism.Run_Time_PolyMorphism;

// RunTime PolyMorphism comes under method Overriding
//Overridding can be prevented using static(static methods can be inherited but cannot be overriden),final( just the actual function can be used) and private(the function of parent can be called) acces modifiers
//Overridding is also known as late binding ...since it takes place after compilation furing run time
// whereas final is early binding since it takes place during compilation time

public class Main {

    @Override  // toString is an inbuild method.. we are going to override it
    public String toString() {
        return "vaa";
    }

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Sqaure sqaure = new Sqaure();
        Shapes mix = new Circle();
        Main main = new Main();

        shapes.area();
        circle.area();
        sqaure.area();
        mix.area();/* here the area of circle is taken..even the reference type is parent class.
                     the method and properties depends on reference object this is known as UPCASTING.
                     This is done by DYNAMIC METHOD DISPATCH OF JAVA*/
        System.out.println(main);// the toString is overriden in the Main class .. so whenever you call an instance of Main class it return "vaa"
        System.out.println(mix);// the toString of Circle class is not overridden so it will return className@hexacode values

    }


}
