class Solution {
    public static int sol(int i,int j,List<List<Integer>> triangle, int dp[][]){
        int n = triangle.size();
        if(i==n-1) return triangle.get(i).get(j);
        if(dp[i][j]!=-1) return dp[i][j];
        int d = triangle.get(i).get(j) + sol(i+1,j,triangle,dp);
        int dg = triangle.get(i).get(j) + sol(i+1,j+1,triangle,dp);
        return dp[i][j] = Math.min(d,dg);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
       int dp[][]=new int[n][n];
       for(int i=0;i<n;i++){
           Arrays.fill(dp[i],-1);
       }
       return sol(0,0,triangle,dp);
    }
}
