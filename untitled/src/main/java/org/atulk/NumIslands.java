package org.atulk;

public class NumIslands {
    //https://www.youtube.com/watch?v=U6-X_QOwPcs&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=1
    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) return;
        grid[i][j] = 0;
        callBFS(grid, i + 1, j);//down
        callBFS(grid, i - 1, j);//up
        callBFS(grid, i, j - 1);//left
        callBFS(grid, i, j + 1);//right
    }

    public static void main(String[] args) {
        char[][] grid = {{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};
        char[][] grid1 = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
        System.out.printf("grid1 = " + numIslands(grid));
        System.out.printf("\ngrid2 = " + numIslands(grid1));
    }
}
