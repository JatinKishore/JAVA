package Recursion.Sorting_Algorithms;

import java.util.*;
public class BubbleSort
{
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        bubbleSort(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int length,int index){
        if(length==0){
            return;
        }
        if(index  <length ){
            if(arr[index ] > arr[index+1   ]){
                int temp = arr[index];
                arr[index]  = arr[index+1]; //swap
                arr[index+1] = temp;
            }
            bubbleSort(arr,length,index+1);
        }
        else{
            bubbleSort(arr,length-1,0);  // for next loop index starts from 0 once again
        }

    }
}
