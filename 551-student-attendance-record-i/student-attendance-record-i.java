class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        int cl = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                a++;
                if (a >= 2) return false;
                cl = 0;
            } 
            else if (c == 'L') {
                cl++;
                if (cl >= 3) return false;
            } 
            else {
                cl = 0;
            }
        }

        return true;
    }
}