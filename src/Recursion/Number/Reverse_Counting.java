package Recursion.Number;

public class Reverse_Counting
{
    public static void main(String[] args) {
        count5(1);
    }
    static void count5(int i){
        if(i>5){
            return;
        }

        count5(i+1);
        System.out.println(i);

    }
}
