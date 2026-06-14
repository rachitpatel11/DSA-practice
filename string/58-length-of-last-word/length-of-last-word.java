class Solution {
    public int lengthOfLastWord(String s) {
        String[] w = s.trim().split(" ");
        int d = w.length - 1;
        return w[d].length();
    }
}