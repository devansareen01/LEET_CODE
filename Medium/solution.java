class Solution {
    public long[] findPrefixScore(int[] nums) {
        long ans[] = new long[nums.length];
        long sum =0;
        long max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
           max = Math.max(nums[i],max);
            sum +=nums[i]+max;
            
            ans[i] = sum;
        }
        return ans;
    }
}
