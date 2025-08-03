package Recursion.BackTraking.MaxzeProblems;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true }, { true, true, true }, { true, true, true }
        };
        int[][] path = new int[board.length][board[0].length];
        pathAllBackPrint("", board, 0, 0, path, 1);
    }
    // ################### Infinit Loooopppp ################

    static void pathAll(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c])
            return;
        if (r + 1 < maze.length) {
            pathAll(p + 'D', maze, r + 1, c);
        }
        if (c + 1 < maze[0].length) {
            pathAll(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            pathAll(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            pathAll(p + 'U', maze, r, c - 1);
        }
    }

    // ######################### BackTracking Code #######################

    static void pathAllBack(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c])
            return;
        // i am considering this block in my path
        maze[r][c] = false;
        if (r + 1 < maze.length) {
            pathAllBack(p + 'D', maze, r + 1, c);
        }
        if (c + 1 < maze[0].length) {
            pathAllBack(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            pathAllBack(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            pathAllBack(p + 'L', maze, r, c - 1);
        }
        // this line is where the function will be over
        // so before the function gets removed also remove the changes that were made by
        // that function
        maze[r][c] = true;

    }

    //          ##################      Printing  the Matrix and the Paths it takes ####################

    static void pathAllBackPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;

            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c])
            return;
        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r + 1 < maze.length) {
            pathAllBackPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c + 1 < maze[0].length) {
            pathAllBackPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            pathAllBackPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            pathAllBackPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }
        // this line is where the function will be over
        // so before the function gets removed also remove the changes that were made by
        // that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}