class Solution {
    public int maxScore(int[] nums) {
       Arrays.sort(nums);
    long sum =0;
    int count =0;
       for(int i =nums.length-1 ;i>=0;i--){
           sum+=(long)nums[i];
           if(sum>0) count++;
           else break; 
       } 
       return count;

    }
}
