class Solution {
    public void dfs(int[][] board, int r, int c) {
        int n = board.length;
        int m = board[0].length;

        if (r < 0 || c < 0 || r >= n || c >= m ||
            board[r][c] != 1) {
            return;
        }

        board[r][c] = 2;

        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
    public int numEnclaves(int[][] grid) {
        int count=0;
           int n = grid.length;       
        int m = grid[0].length;    


        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1) {
                dfs(grid, i, 0);
            }
        }

        for (int i = 0; i < n; i++) {
            if (grid[i][m - 1] == 1) {
                dfs(grid, i, m - 1);
            }
        }

        for (int j = 0; j < m; j++) {
            if (grid[0][j] == 1) {
                dfs(grid, 0, j);
            }
        }

        for (int j = 0; j < m; j++) {
            if (grid[n - 1][j] == 1) {
                dfs(grid, n - 1, j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    count++;
                } else if (grid[i][j] == 2) {
                    grid[i][j] = 1;
                }
            }
        }
        return count;
    }
}