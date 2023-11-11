package Recursion.Number;

public class Count_Numbers
{
    public static void main(String[] args) {
        count5(1);

    }
    static void count5(int i){
        if(i>5){
            return;
        }
        System.out.println(i);
        count5(i+1);

    }
}
