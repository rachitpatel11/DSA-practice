class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] ans = new int[n+1];
        ans[0] = 0;
        int max = 0 ;
        for(int i=0 ;i<n;i++){
            ans[i+1] = gain[i] + ans[i];
            max = Math.max(max,ans[i+1]);
        }
        return max;
    }
}