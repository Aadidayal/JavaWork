import java.util.*;

public class PathFinder {
    static int rows, cols;
    static int[][] board;
    static boolean[][] seen;
    static int[] dx = new int[4];
    static int[] dy = new int[4];

    static class Point {
        int row, col, depth;
        Point(int r, int c, int d) {
            row = r;
            col = c;
            depth = d;
        }
    }

    public static int findShortestPath(int startR, int startC, int endR, int endC, int moveR, int moveC) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startR, startC, 0));
        seen[startR][startC] = true;

        dx[0] = moveR; dy[0] = moveC;
        dx[1] = moveC; dy[1] = -moveR;
        dx[2] = -moveC; dy[2] = moveR;
        dx[3] = -moveR; dy[3] = -moveC;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.row == endR && current.col == endC) return current.depth;

            for (int i = 0; i < 4; i++) {
                int newRow = current.row + dx[i];
                int newCol = current.col + dy[i];

                if (isSafe(newRow, newCol)) {
                    seen[newRow][newCol] = true;
                    queue.add(new Point(newRow, newCol, current.depth + 1));
                }
            }
        }

        return -1; 
    }

    public static boolean isSafe(int r, int c) {
        return r >= 0 && c >= 0 && r < rows && c < cols && board[r][c] == 0 && !seen[r][c];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        rows = input.nextInt();
        cols = input.nextInt();
        board = new int[rows][cols];
        seen = new boolean[rows][cols];

        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                board[r][c] = input.nextInt();

        int startX = input.nextInt();
        int startY = input.nextInt();
        int destX = input.nextInt();
        int destY = input.nextInt();
        int stepR = input.nextInt();
        int stepC = input.nextInt();

        int result = findShortestPath(startX, startY, destX, destY, stepR, stepC);
        System.out.println(result);
    }
}
