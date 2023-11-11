package Recursion.Number;

import java.util.*;
public class Reverse_A_Number
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(reverse(num));
    }
    static int reverse(int N){
        if(N/10 ==0){
            return N%10;
        }
        int digit = (int) Math.log10(N);
        int tens =(int) Math.pow(10,digit);
        return N%10*tens + reverse(N/10);
    }
}
