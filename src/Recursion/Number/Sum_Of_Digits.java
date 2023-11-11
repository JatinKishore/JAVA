package Recursion.Number;

public class Sum_Of_Digits
{
    public static void main(String[] args) {
        System.out.print(func(12345));
    }
    static int func(int N){
        if(N == 0){
            return 0;
        }
        return N%10 + func(N/10);

    }
}
