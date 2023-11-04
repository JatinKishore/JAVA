package OOP_6;

import java.util.Random;

public class Main implements  GenericInterface<Integer>{
    @Override
    public void display(Integer value) {

    }

    public static void main(String[] args) {
        Student kurnal = new Student(1,9);
        Student rahul = new Student(5,6);

        if(kurnal.compareTo(rahul) > 0){
            System.out.println("Kurnal has high mark");
        }
    }
}
