class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m<1) return true;
        int i=0;
        int j=0;
        while(j<n){
            if(s.charAt(i)==t.charAt(j)) {
                i++;
            }
            if(i==m){
                return true;
            }
            j++;
        }
        return false;
    }
}
