class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i : map.keySet()){
            int val = map.get(i);
            if(buckets[val] == null){
                buckets[val] = new ArrayList<>();
            }
            buckets[val].add(i);
        }
        int index = 0;
        for (int freq = nums.length; freq >= 1 && index < k; freq--) {

            if (buckets[freq] != null) {

                for (int num : buckets[freq]) {
                    result[index] = num;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
