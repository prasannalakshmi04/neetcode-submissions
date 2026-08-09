class Solution {
    public int appendCharacters(String s, String t) {
        int count = 0;
        for(int i = 0;i<s.length() && count<t.length();i++){
            if(t.charAt(count) == s.charAt(i))count++;
        }
        return t.length()-count;
        
    }
}