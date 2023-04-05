class Solution {
    public int solution(int n,int nums[],int dp[]){
        if(n==0) return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];

        int first=nums[n]+solution(n-2,nums,dp);
        int second=0+solution(n-1,nums,dp);
        return dp[n]=Math.max(first,second);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solution(n-1,nums,dp);
    }
}
