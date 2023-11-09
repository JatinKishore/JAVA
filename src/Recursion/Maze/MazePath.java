package Recursion.Maze;

public class MazePath {
    public static void main(String[] args) {
        mazePath("",3,3);
    }
    static void mazePath(String str, int r, int c){
        if(r==1 && c==1){
            System.out.println(str);
            return;
        }
        if(r>1){
            mazePath(str+"D",r-1,c);
        }
        if(c>1){
            mazePath(str+"R",r,c-1);
        }

    }

}
