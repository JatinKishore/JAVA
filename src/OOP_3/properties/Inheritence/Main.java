package OOP_3.properties.Inheritence;
//Inhertience can be removed using final and private access modifier
public class Main {

     public static void main(String[] args) {
        Box b = new Box(5,6,7);
        child_box c = new child_box(9,8,7,5);
        //Box box5 = new child_box(2,4,6,8); parent reference type can refer a object of child but it can't acces the properties of the child
        //System.out.println(box5.s);
        //child_box box6 = new Box(); child refernce type can't refer a object of parent

        System.out.println(b.l);
        System.out.println(c.l);
    }
}
