package OOPS.OOP_6;

public class MyException extends  Exception {
    public  MyException(String message){
        super(message);//This will call the main exception constructor.. since we are extending the Exception class
    }

}
