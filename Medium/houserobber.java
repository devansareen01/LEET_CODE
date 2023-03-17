class Solution {
    public int f(int nums[] , int n ,int dp[] ){
        if(n < 0 ){
            return 0;
        }
        if(dp[n]!=-1) return dp[n];
        int pick =  nums[n] + f(nums , n-2, dp);
        int notpick = f(nums , n-1 ,dp);
        return dp[n]= Math.max(pick , notpick);
    }
     public int rob(int[] nums) {
         
        int n = nums.length;
        if(n== 1) return nums[0];
        int dp[] = new int[n];
        int prev = nums[0];
        int prev2 = 0;

        for(int i =1 ;i<n;i++){
            int pick = nums[i] ;
            if(i >1)
                  pick +=  prev2;

             int notpick = prev;
             
          int curr = Math.max(pick , notpick); 

            prev2 = prev;
            prev = curr;

        }
        return Math.max(prev, prev2);
    }
}
