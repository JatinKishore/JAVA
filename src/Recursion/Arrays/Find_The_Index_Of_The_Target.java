package Recursion.Arrays;

import java.util.*;
public class Find_The_Index_Of_The_Target
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(indexFinder(arr,0,target));
    }
    static int indexFinder(int[] arr, int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] ==target){
            return index;
        }
        return indexFinder(arr, index+1,target);

    }
}
