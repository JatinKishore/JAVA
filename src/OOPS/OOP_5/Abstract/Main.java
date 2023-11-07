package OOPS.OOP_5.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        Daughter daughter = new Daughter(2);
        daughter.partner();
        son.career();
        son.normal();
        System.out.println(son.age);
        System.out.println(daughter.age);
        //Parent mom = new Parent() ; Its an error..we can't make object of an abstract class..We can only override an abstract class
        Parent mom = new Daughter(2);//But we can call a child object with a parent datatype
        Parent.hello();//but parent type variable  only access to the static method

    }
}
