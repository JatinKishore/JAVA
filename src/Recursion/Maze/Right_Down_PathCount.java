package Recursion.Maze;

public class Right_Down_PathCount {
    public static void main(String[] args) {
        System.out.println(mazePaths(3,3));
    }
    static int mazePaths(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = mazePaths(r-1,c);
        int right = mazePaths(r,c-1);
        return left+right;
    }
}

