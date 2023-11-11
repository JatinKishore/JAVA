package Recursion.Number;

public class Product_Of_N_Numbers
{
    public static void main(String[] args) {
        System.out.println(productN(3));
    }
    static int productN(int N){
        if(N<1){
            return 1;
        }
        return N*productN(N-1);
    }
}
