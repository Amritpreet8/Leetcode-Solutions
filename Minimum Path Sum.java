class Solution {
     public static int sol(int m,int n,int grid[][],int dp[][]){
        if((m==0) && (n==0)) return grid[m][n];
        if(m<0 || n<0) return 100000000;
        if(dp[m][n]!=-1) return dp[m][n];
        int right=grid[m][n]+sol(m,n-1,grid,dp);
        int down=grid[m][n]+sol(m-1,n,grid,dp);
        return dp[m][n]=Math.min(right,down);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return sol(m-1,n-1,grid,dp);
    }
}
