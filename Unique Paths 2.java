class Solution {
    public int sol(int i,int j,int m,int n,int obstacleGrid[][],int dp[][]){
        
        if(i>=m || j>=n || obstacleGrid[i][j]==1) return 0;
        if(i==(m-1) &&  j==(n-1)) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=sol(i+1,j,m,n,obstacleGrid,dp)+sol(i,j+1,m,n,obstacleGrid,dp);    
        }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
       return sol(0,0,m,n,obstacleGrid,dp);
    }
}
