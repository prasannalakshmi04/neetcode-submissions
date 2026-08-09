class Solution {
    public boolean isSubsequence(String s, String t) {
        int ind = 0;
        for(int i = 0;i<t.length() && ind<s.length();i++){
            if(s.charAt(ind) == t.charAt(i))ind++;
        }
        if(ind == s.length())return true;
        else return false;
        
    }
}