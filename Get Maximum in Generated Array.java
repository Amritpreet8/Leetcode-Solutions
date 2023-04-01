class Solution {
    public int getMaximumGenerated(int n) {
        int arr[]=new int[n+1];
        if(n<2) return n;
        arr[0]=0;
        arr[1]=1;
       int max1=arr[0];
        for(int i=2;i<=n;i++){
            if(i%2==0){
                arr[i]=arr[i/2];
            }
            else{
                arr[i]=arr[(i-1)/2]+arr[(i+1)/2];
            }
            max1=Math.max(max1,arr[i]);
        }
        return max1;
    }
}
