class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        int n = arr.length;
        int[] res = new int[n];
        for(int i = n-2;i>=0;i--){
            res[i] = max;
            max = Math.max(max,arr[i]);
        }
        res[n-1] = -1;
        return res;
    }
}