package Recursion.BackTracking;
import java.util.*;
public class AllPathsPrint {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                {true,true,true},
                {true,true,true}};
        int[][] path = new int[maze.length][maze.length];
        allPathsPrint("",maze,0,0,path,1);
    }
    static void allPathsPrint(String p , boolean[][] maze, int r, int c, int[][] path,int step){
        if(r==maze.length-1 && c== maze.length-1){
            path[r][c] = step;
            for(int[] i: path){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r<maze.length-1){
            allPathsPrint(p+"D",maze,r+1,c,path,step+1);
        }
        if(c<maze.length-1){
            allPathsPrint(p+"R",maze,r,c+1,path,step+1);
        }
        if(r>0){
            allPathsPrint(p+"U",maze,r-1,c,path,step+1);
        }
        if(c>0){
            allPathsPrint(p+"L",maze,r,c-1,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
