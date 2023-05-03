class Solution {
    public boolean isSol(int nums[] , int threshold , int mid){
        int sum =0;

        for(int i=0; i<nums.length;i++){
            sum +=(int)Math.ceil((double)nums[i]/(double)mid);
        }

        if(sum<= threshold) return true;

        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        
         int maxi = Integer.MIN_VALUE;

         for(int i =0; i<nums.length;i++){
            
             maxi = Math.max(maxi , nums[i]);
         }
         
         int low = 1;
         int high = maxi;
         
        int ans = 0;
         while(low <= high){
             int mid = (low + high)/2;

             if(isSol(nums , threshold , mid)){
                ans = mid;
                high = mid-1;
             }else{
                 low = mid +1;
             }
         }
         return ans;
    }
}
