class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int max = 1;
        for(int i = 0;i<nums.length;i++){
            if(!s.contains(nums[i]-1)){
                int count = 1;
                int num = nums[i]+1;
                while(s.contains(num)){
                    count++;
                    num++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
