package Recursion;
import java.lang.reflect.Array;
import java.util.*;
public class Permutation {
    public static void main(String[] args) {

        System.out.println(permutations("","abc"));
    }
    static ArrayList<String> permutations(String p, String un){
        if(un.isEmpty()){
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return  al;
        }
        char c = un.charAt(0);
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String end = p.substring(i,p.length());

            ArrayList<String>  temp =  permutations(first + c +end,un.substring(1));
            al.addAll(temp);
        }
        return al;
    }

    static void Voidpermutations(String p, String un){
        if(un.isEmpty()){
            System.out.println(p);
            return ;
        }
        char c = un.charAt(0);
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String end = p.substring(i,p.length());
            permutations(first + c +end,un.substring(1));

        }

    }
}
