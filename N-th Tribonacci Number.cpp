class Solution {
public:
    int tribonacci(int n) {
    int f[n + 3];
    int i;
    f[0] = 0;
    f[1] = 1;
    f[2]=1;
 
    for(i = 3; i <= n; i++)
    {
         
       //Add the previous 2 numbers
       // in the series and store it
       f[i] = f[i - 1] + f[i - 2]+f[i-3];
    }
    return f[n];
    }
};
