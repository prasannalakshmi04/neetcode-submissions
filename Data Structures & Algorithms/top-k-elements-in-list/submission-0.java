class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        int index = 0;
        int[] result = new int[k];
        for(int i : map.keySet()){
            int val = map.get(i);
            if(buckets[val] == null){
                buckets[val] = new ArrayList<>();
                buckets[val].add(i);
            }
            else{
                buckets[val].add(i);
            }
        }
        for(int i = nums.length;i>=1 && index<k;i--){
            if(buckets[i]!=null){
                for(int j:buckets[i]){
                    result[index] = j;
                    index++;
                }
            }
        }
        return result;
    }
}
