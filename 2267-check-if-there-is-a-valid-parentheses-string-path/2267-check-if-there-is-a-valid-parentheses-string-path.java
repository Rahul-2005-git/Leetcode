class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int pl=m+n+1;
        if(pl%2==1)return false;

        boolean [][][] dp=new boolean[m][n][pl];
         if (grid[0][0] == ')') {
            return false;
        }

         dp[0][0][1] = true;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                // Skip starting cell
                if (i == 0 && j == 0) {
                    continue;
                }

                // Try every possible balance
                for (int balance = 0; balance < m + n; balance++) {

                    int newBalance;

                    if (grid[i][j] == '(') {
                        newBalance = balance - 1;
                    } else {
                        newBalance = balance + 1;
                    }

                    // If previous balance is invalid
                    if (newBalance < 0) {
                        continue;
                    }

                    // Come from top
                    if (i > 0 && dp[i - 1][j][newBalance]) {
                        dp[i][j][balance] = true;
                    }

                    // Come from left
                    if (j > 0 && dp[i][j - 1][newBalance]) {
                        dp[i][j][balance] = true;
                    }
                }
            }
        }

        // Valid path must finish with balance 0
        return dp[m - 1][n - 1][0];



        // return true;


    }
}