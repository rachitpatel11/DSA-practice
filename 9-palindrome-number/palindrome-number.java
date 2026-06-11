class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int s = 0;
        while(temp != 0){
            int d = temp%10;
            s = 10*s + d;
            temp = temp / 10;
        }
        if(x<0){
            return false;
        }
        if(x == s){
            return true ;
        } else {
            return false ;
        }
    }
}