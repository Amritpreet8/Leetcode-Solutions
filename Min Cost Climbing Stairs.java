class Solution {
    public int sol(int n,int[] cost,int[] dp){
        if(n<=1) return dp[n]=cost[n];
        if(dp[n]!=-1) return dp[n];
        int first=cost[n]+sol(n-1,cost,dp);
        int second=cost[n]+sol(n-2,cost,dp);

        return dp[n]=Math.min(first,second);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[] =new int[n];
        Arrays.fill(dp,-1);
        return Math.min(sol(n-1,cost,dp),sol(n-2,cost,dp));
    }
}
