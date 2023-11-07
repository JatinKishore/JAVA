package OOPS.OOP_5.Interfaces;

public class NestedInterfaces {
    public interface A{//here A is an nestedInterface within a class.. this nested interface can be of any type like, public, private or whatever.. where as outside  interfaces needs to  be public or default

        boolean isOdd(int n);

        static void num(int m){//static method can't be overridden, so we need to give the body for those static methods
            System.out.print(m);
        }

    }

    public static void main(String[] args) {
        NestedInterfaces2 NI = new NestedInterfaces2();
        System.out.println(NI.isOdd(2));
    }
}

class NestedInterfaces2 implements  NestedInterfaces.A{//here the interface A nested within class NestedInterfaces is implement in another class
    @Override
    public boolean isOdd(int n) {
        return (n&1) ==1;
    }

    public static void main(String[] args) {
        NestedInterfaces.A.num(1);//whenever we use a static method in instance its need to be called with the parent instance name..here the instance is nested so we call this as className.instanceName
    }

}

