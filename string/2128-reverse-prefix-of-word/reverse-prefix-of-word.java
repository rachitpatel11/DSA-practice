class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder s = new StringBuilder();
        int b = -1;
        for(int i=0 ; i<word.length() ; i++){
            if(word.charAt(i) == ch){
                b = i;
                break;
            }
        }
        if(b == -1){
            return word;
        }
        for(int i = b;i>=0 ; i--){
            s.append(word.charAt(i));
        }
        for(int i = b+1;i<word.length() ; i++){
            s.append(word.charAt(i));
        }
        return s.toString(); 
    }
}