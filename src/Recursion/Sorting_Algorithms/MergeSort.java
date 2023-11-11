package Recursion.Sorting_Algorithms;/*Time Complexity is :  O(Nlog(N))*/
import java.util.*;
public class MergeSort
{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        //mergeSortInPlace(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){//mergeSort
        if(arr.length==1){// breaking condition
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length ];
        int i=0; // left pointer
        int j=0; // right pointer
        int k =0; //index of mix[] Array

        while(i<left.length && j<right.length){ //performing merge operation using 2 pointer technique
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){//if left array has elements left
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){//if right array has elements left
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    // Inplace mergeSort

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }

        int m = (s+e)/2;

        mergeSortInPlace(arr,s,m);
        mergeSortInPlace(arr,m,e);
        mergeInPlace(arr,s,m,e);
    }

    static void mergeInPlace(int[] arr,int s,int m, int e){
        int[] mix = new int[e-s];
        int i=s; // i moves from start poition to mid
        int j=m; // j moves from mid position to end
        int k =0; //k moves index of mix[] Array

        while(i<m && j<e){ //performing merge operation using 2 pointer technique
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<m){//if left array has elements left
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){//if right array has elements left
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
