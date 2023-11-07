package OOPS.OOP_5.Abstract;

public class Daughter extends  Parent{


    public Daughter(int a) {
        super(a);
    }



    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("He is the patient");
    }
}
