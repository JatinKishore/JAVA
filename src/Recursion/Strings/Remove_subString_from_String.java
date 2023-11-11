package Recursion.Strings; /******************************************************************************

 Input : apple is a fruit
 Output : is a fruit

 *******************************************************************************/
import java.util.*;
public class Remove_subString_from_String
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        skipApple(str,"");
    }
    static void skipApple(String in , String out){
        if(in.isEmpty()){
            System.out.print(out);
            return;
        }
        if(in.startsWith("apple")){
            skipApple(in.substring(5),out);
        }
        else{
            skipApple(in.substring(1),out+ in.charAt(0));
        }

    }
}
