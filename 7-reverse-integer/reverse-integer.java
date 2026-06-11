class Solution {
    public int reverse(int x) {
        long temp;
        if (x<0){
            temp = -(long) x;
        } else {
            temp = x;
        }   
        long rev = 0 ;
        while(temp != 0){
            long d = temp%10;
            rev = 10*rev + d;
            temp = temp/10;
        }
        if(x<0){
            rev = -rev;
        } 
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            rev = 0 ;
        }
        return (int)rev;
    }
}