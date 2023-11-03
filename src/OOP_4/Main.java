package OOP_4;

import java.rmi.AccessException;

public class Main {

    public static void main(String[] args) {
        AccessControl as = new AccessControl();
        System.out.println(as.getNum());//accessing a private num
        as.setNum(25);// modifing the privaet num
        System.out.println(as.getNum());
        Subclass s = new Subclass();
        System.out.println(s.getNum());
        System.out.println(s.num);
        System.out.println(s.hashCode());// hashCode is a random number generated for a object by java

        AccessControl one = new AccessControl(1);
        AccessControl two = one;
        AccessControl three = new AccessControl(1);
        if(one == two){//this checks whether both points to same object
            System.out.println("both point to same object ");
        }

        if(one.equals(three)){//this checks whether both reference variables have same value
            System.out.println("Both values are equal");
        }

        System.out.println(one instanceof AccessControl); // instanceof method helps to check whether the given object is an instanec of the gievn class
        System.out.println(one.getClass().getName());// getClass() method helps to get informations about class
    }
}
