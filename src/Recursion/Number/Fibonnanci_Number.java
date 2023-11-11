package Recursion.Number;

public class Fibonnanci_Number
{
    public static void main(String[] args) {
        System.out.print(fibo(6));
    }
    static int fibo(int N){
        if(N<2){
            return 1;
        }
        return fibo(N-1) + fibo(N-2);
    }
}
