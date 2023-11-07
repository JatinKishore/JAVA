package Recursion.MAANG_Questions;

public class PhonePad {
    //GOOGLE Question
    public static void main(String[] args) {
        pad("","12");
    }
    static void pad(String p, String un) {
        if (un.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = un.charAt(0) - '0';//this will convert char to numbers

        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            pad(p+ch,un.substring(1));
        }
    }
}
