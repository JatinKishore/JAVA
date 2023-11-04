package OOP_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main implements  GenericInterface<Integer>{
    @Override
    public void display(Integer value) {

    }



    public static void main(String[] args) {
        Student kurnal = new Student(1,9);
        Student rahul = new Student(5,6);
        Student jatin = new Student(2,4);
        Student kishore = new Student(7,8);

        Student[] list = {kurnal,rahul,jatin,kishore};


        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks - o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));

        if(kurnal.compareTo(rahul) > 0){
            System.out.println("Kurnal has high mark");
        }
    }
}
