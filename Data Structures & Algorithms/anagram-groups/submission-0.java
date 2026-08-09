class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            int[] count = new int[26];
            for(int i = 0;i<str.length();i++){
                char c = str.charAt(i);
                count[c - 'a']++;
            }
            String s = Arrays.toString(count);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
