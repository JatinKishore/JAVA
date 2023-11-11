package Recursion.Sorting_Algorithms;

import java.util.*;
public class SelectionSort
{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr,arr.length,0,0);
        System.out.print(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr,int i,int j,int max){
        if(i ==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[max]){
                max =j;
                selectionSort(arr,i,j+1,max);
            }else{
                selectionSort(arr,i,j+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[i-1];
            arr[i-1] = temp;
            selectionSort(arr,i-1,0,0);
        }
    }
}
