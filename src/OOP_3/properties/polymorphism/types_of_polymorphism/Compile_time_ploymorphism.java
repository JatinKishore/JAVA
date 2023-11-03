package OOP_3.properties.polymorphism.types_of_polymorphism;
//its is also known as Static time polymorphism
//it is achived by method overloading
// we we need use the same name of the method or constructor but we can change the number of parameters and the return type
public class Compile_time_ploymorphism

{
    static double add(double a, int b){
        return a+b ;
    }
    static  int add(int a, int b){
        return a+b;
    }
    static  int add(){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(add(1.3,2));
        System.out.println(add(1,2));
        System.out.println(add());
    }
}
