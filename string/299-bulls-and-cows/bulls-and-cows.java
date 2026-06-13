class Solution {
    public String getHint(String secret, String guess) {
        int b = 0 ;
        int c = 0 ;
        int[] count = new int[10];
        for (int i=0 ; i<secret.length() ;i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s == g){
                b++;
            } else {
                if(count[s] < 0){
                    c++;
                }
                if(count[g] > 0){
                    c++;
                }
            }
            count[s]++;
            count[g]--;
        }
        
        return b + "A" + c + "B";
        
    }
}