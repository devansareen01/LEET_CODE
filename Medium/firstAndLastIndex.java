class Solution {
    public int lower_bound(int []arr , int target){
        int lo = 0;
        int hi = arr.length-1;

        while(lo <= hi){
            int mid = (lo+hi)/2;

            if(arr[mid] < target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return lo;
    }
    public int[] searchRange(int[] nums, int target) {
       int st =lower_bound(nums , target);
       int en = lower_bound(nums , target +1)-1;
       if(st >= nums.length || nums[st] != target){
           return new int[]{-1,-1};
       }
       return new int []{st , en};
    }
}
