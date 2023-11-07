package OOPS.properties.polymorphism.types_of_polymorphism.Run_Time_PolyMorphism;

public class Circle extends Shapes  {
    @Override//annoation - just to mention it is overriden the parent class
    public void area(){// area() parent class is overriden
        System.out.println("pie* radius");
    }
}
