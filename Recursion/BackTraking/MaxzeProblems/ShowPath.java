package Recursion.BackTraking.MaxzeProblems;

import java.util.ArrayList;

public class ShowPath {
    public static void main(String[] args) {
        // path("", 3,3 );
        // pathList("", 3, 3);
        // pathDiagonalList("", 3, 3);
        boolean [][]board = {
{true,true,true},{true,false,true},{true,true,true}
        };
        pathObsticles("", board, 0, 0);
    }
    static void  path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r > 1){
             path(p+'D', r-1, c);
        }
            if(c > 1){
             path(p+'R', r, c-1);
        }
    }


    // #################ArrayList#########################

     static  ArrayList<String>  pathList(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
                    ArrayList<String> list = new ArrayList<>();

        if(r > 1){
             list.addAll(pathList(p+'D', r-1, c));
        }
            if(c > 1){
            list.addAll(pathList(p+'R', r, c-1)) ;
        }
        return list;
    }



    // ##################### Diagonal PAths ###################

      static  ArrayList<String>  pathDiagonalList(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
                    ArrayList<String> list = new ArrayList<>();
    if(r > 1 && c>1){
             list.addAll(pathDiagonalList(p+'T', r-1, c-1));
        }
        if(r > 1){
             list.addAll(pathDiagonalList(p+'D', r-1, c));
        }
            if(c > 1){
            list.addAll(pathDiagonalList(p+'R', r, c-1)) ;
        }
        return list;
    }



    // ########################## Path with Obsticles ##################################

      static void  pathObsticles(String p, boolean [][]maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(!maze[r][c]) return ;
        if(r+1 <maze.length){
             pathObsticles(p+'D', maze, r+1, c);
        }
            if(c +1< maze[0].length){
             pathObsticles(p+'R', maze,r, c+1);
        }
    }

}
