package Recursion.Maze;

public class PathRestrictions {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                            {true,false,true},
                            {true,true,true}};
        pathRestrictions("",maze,0,0);
    }
    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c ==maze.length-1 ){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1){
            pathRestrictions(p+"D",maze,r+1,c);
        }
        if(c<maze.length-1){
            pathRestrictions(p+"R",maze,r,c+1);
        }
    }
}
