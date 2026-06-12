class Solution {
    public int maximumWealth(int[][] accounts) {
        int mw = 0 ;
        for(int i=0 ; i<accounts.length ; i++){
            int w = 0 ;
            for(int j=0 ; j<accounts[i].length ; j++){
                w = w + accounts[i][j];
            }
            mw = Math.max(mw,w);
        }
        return mw;
    }
}