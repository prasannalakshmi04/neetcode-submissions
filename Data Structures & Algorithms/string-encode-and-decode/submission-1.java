class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder("");
        for(String str : strs){
            res.append(str.length()).append("#").append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1;
            String word = str.substring(i, i + length);
            result.add(word);
            i = i + length;
        }
        return result;
    }
}
