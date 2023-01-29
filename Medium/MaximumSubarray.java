class Solution {
    public int maxSubArray(int[] nums) {
    //     int csum = nums[0];// current sum 
    //     int osum = nums[0];// overall sum
    //     for(int i =1; i<nums.length;i++){
    //     if(csum>=0){// if the previous  subarray sum is positive then current ith elment will add to the previous one 
    //         csum+= nums[i];
    //     }else{
    //         csum=nums[i];// other wise it will start a new subarray
    //     }
    // }
    //     if(csum>osum){
    //         osum= csum;
    //     }
    //     return osum;
        int sum = 0;
        int maxSum =Integer.MIN_VALUE;
        for(int i =-0 ;i<nums.length;i++){
            sum+= nums[i];
            maxSum = Math.max(maxSum,sum);
              if(sum<0){
            sum= 0;
        }
        }
        return maxSum;
    }
}
