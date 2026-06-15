class Solution {
    public boolean isPalindrome(String s) {
        String w = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i = 0 ;
        int j = w.length() - 1 ;
        while(i<j){
            if(w.charAt(i) != w.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}