class Solution {
    public int sol(int nums[]){
        int n=nums.length;
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int take=nums[i];
            if(n>1) take+=prev2;
            int notTake=0+prev;

            int curr=Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }

    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int temp1[]=new int[n-1];
        int temp2[]=new int[n-1];
        int j=1;
        for(int i=0;i<n-1;i++){
           temp1[i]=nums[j];
           j++;
        }
        int k=0;;
        for(int i=0;i<n-1;i++){
           temp2[i]=nums[k];
           k++;
        }
       return Math.max(sol(temp1),sol(temp2));
    }
}
