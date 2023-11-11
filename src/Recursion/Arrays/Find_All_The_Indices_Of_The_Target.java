package Recursion.Arrays;
import java.util.*;
public class Find_All_The_Indices_Of_The_Target
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[N];
        int[] Iarr = new int[N];
        int[] Rarr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Rarr = indicesFinder(arr,0,target,Iarr,0);


        for(int i=0;i<Rarr.length;i++){
            System.out.print(Rarr[i]+" ");
        }
    }
    static int[] indicesFinder(int[] arr, int index,int target,int[] Iarr, int I){
        if(index==arr.length){
            return Iarr;
        }
        if(arr[index] ==target){
            Iarr[I] = index;
            ++I;
        }
        return indicesFinder(arr, index+1,target,Iarr,I);

    }
}
