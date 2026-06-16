class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words = (s1 + " " + s2).split(" ");

        String[] temp = new String[words.length];
        int k = 0;

        for (int i = 0; i < words.length; i++) {
            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count == 1) {
                temp[k++] = words[i];
            }
        }

        String[] ans = new String[k];
        for (int i = 0; i < k; i++) {
            ans[i] = temp[i];
        }

        return ans;
    }
}