class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int s = 0;
        int b = 0;
        for(int i=0 ;i<moves.length() ; i++){
            if(moves.charAt(i) == 'L'){
                s++;
            } else if (moves.charAt(i) == 'R') {
                s--;
            } else {
                b++;
            }
        }
        return Math.abs(s) + b;
    }
}