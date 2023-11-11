package Recursion.Combination_and_Permutation;

/******************************************************************************

 INPUT : abc
 OUTPUT :  abc , ab, ac, a, bc, b, b, c
 *******************************************************************************/
public class Combination
{
    public static void main(String[] args) {
        String str = "abc";
        combination("",str);
    }
    static void combination(String process, String unprocess){
        if(unprocess.isEmpty() ){
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        combination(process+ch , unprocess.substring(1));
        combination(process , unprocess.substring(1));
    }
}

