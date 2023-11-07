package OOPS.OOP_6.Cloning;
import java.util.*;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kurnal = new Human(34,"Kurnal");

        //Human twin = new Human(kurnal);//this method seems to be slow so we go for cloneable

        Human twin = (Human)kurnal.clone();

        System.out.println(twin.name);
        twin.name = "Changed";
        System.out.println(twin.name);
        System.out.println(kurnal.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kurnal.arr));// The change in twin object allows affects the kurnal object this is knownas shallow copying
        //shallow copy can be avoided using deep copy ..by creating new object instead of pointing to the same object

    }
}
