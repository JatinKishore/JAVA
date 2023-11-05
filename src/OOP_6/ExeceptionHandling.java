package OOP_6;
import java.util.*;
public class ExeceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b =0;

        try{
            divide(a,b );
            String name = "Kurnal";
            if(name.equals("Kurnal")){
                throw  new MyException("name is kurnal");
            }
        }
//        catch(Exception e){
//            System.out.println(e.getMessage()); this will return an error because more strict expections like arithematic , or any other subclass should come first .. then common Execption
//        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {//we cannpt create multiple finally class
            System.out.println("This will always executed");
        }
    }
    static  int divide(int a, int b) throws ArithmeticException{//mention in a function if there is any execption called in the function using throws keyword
        if(b==0){
            throw new ArithmeticException("Please dont divide by Zero");// Since any Expection is a class use new keyword while calling them using throw..and pass your msg in the constructor

        }
        return a/b;
    }
}

