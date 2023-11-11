package Recursion.Sorting_Algorithms;

import java.util.*;
public class QuickSort
{
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        Quicksort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    static void Quicksort(int[] arr,int low,int high){
        if(low>=high){
            return;  //breaking condition
        }
        int s = low;
        int e = high;
        int m =(s+e)/2;
        int p =arr[m];

        while(s<=e){
            while(arr[s]<p){
                s++;
            }
            while(arr[e]>p){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s]  = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        Quicksort(arr,low,e);
        Quicksort(arr,s,high);
    }
}
