class Solution {
    public boolean isPalindrome(String s) {
        String w = s.toLowerCase().replaceAll("[^a-z0-9]","");
        String rev = new StringBuilder(w).reverse().toString();
        int i=0 ;
        while(i < w.length()){
            if(w.charAt(i) != rev.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }
}