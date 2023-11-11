package Recursion.Arrays;

import java.util.*;
public class Sort_Checker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return sorted(arr, index+1);

    }
}
