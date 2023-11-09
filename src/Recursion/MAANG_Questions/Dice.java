package Recursion.MAANG_Questions;


import java.util.*;
//AMAZON DICE QUESTION
public class Dice {
    public static void main(String[] args) {
        dice("",4 );
    }
    static  void dice(String p, int un){
        if(un == 0){
            System.out.println(p);
        }

        for(int i=1;i<=6 && i<=un;i++){
            dice(p+i, un-i);
        }
    }
}

