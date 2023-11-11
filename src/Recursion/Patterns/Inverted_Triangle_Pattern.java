package Recursion.Patterns;

import java.util.*;
public class Inverted_Triangle_Pattern
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        triangle(N,1);
    }

    static void triangle(int i,int j){
        if(i==0){
            return;
        }
        if(j<=i){
            System.out.print("* ");
            triangle(i,j+1);

        }
        else{
            System.out.println();
            triangle(i-1,1);

        }

    }
}

/*

printing:
*
**
***
****


*/
