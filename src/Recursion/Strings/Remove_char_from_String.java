package Recursion.Strings; /******************************************************************************

 isEmpty()
 substring()

 *******************************************************************************/
import java.util.*;
public class Remove_char_from_String
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char skip = sc.next().charAt(0);
        skipA(str,"",skip);

    }
    static void skipA(String in, String out,char skip){
        if(in.isEmpty()){
            System.out.print(out);
            return;
        }
        if(in.charAt(0) == skip){
            skipA(in.substring(1),out,skip);
        }
        else{
            skipA(in.substring(1),out+in.charAt(0),skip);
        }
    }
}
