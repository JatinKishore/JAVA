package OOPS.OOP_5.Abstract;
/*All the abstract methods needs to be overriden the child class*/
public abstract class Parent  {// a class with atleast one abstract method needs to be written as abstract class
    static int age;
    public  Parent(int a){
        age = a;
    }
    //abstract Parent(); its an error abstract constructors are not allowes

    //abstract static method cannot be built.. because abstract methods needs to be overriden whereas static methods cannot be overriden

    static void hello() {//but we can create ordinary static methods
    }

    void normal(){
        System.out.println("Dont be ordinary be extra- ordinary");
    }


    abstract void career();
    abstract void partner();


}
