package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println(kthindex(5,4,2,new int[]{1,8,4,5,1}));
    }
    static int kthindex(int N, int X,int K,int[] A){
        int result = -404;
        result=-1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            if(A[i]%X!=0){
                al.add(A[i]);
            }
        }
        Collections.sort(al);
        if(al.size() >= K){
            result = al.get(K);
        }

        return result;
    }
}
