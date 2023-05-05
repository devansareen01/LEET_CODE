class Solution {
    public boolean check (int arr[]  , int k , int mid){
        int spilt =1;
        int ssum = 0;//subarraysum
          for(int i =0; i<arr.length; i++){
            if(arr[i] > mid) return false;
              
              if(ssum + arr[i] > mid){
                spilt++;
                ssum = arr[i];
              }else{
                  ssum += arr[i];
              }
        }
        if(spilt > k){
            return false;
        }else{
            return true;
        }
    }
    public int splitArray(int[] nums, int k) {
        int mini = Integer.MAX_VALUE;
        int sum = 0;
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            mini = Math.min(mini , nums[i]);
        }

        int low = mini;
        int high = sum;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;

            if(check (nums , k , mid)){

                ans = mid;
                high =  mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
}
