class Solution {
    public int singleNonDuplicate(int[] nums) {
     int n = nums.length;
        int lo = 0;
        int hi = n-1;

        if(n == 1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }

        while( lo <= hi){
            int mid = (lo+hi)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid]; // if both the adjancent elements are not same then that element will be our answer
            }
            else if(nums[mid] == nums[mid+1]){// right partition
                int rc = (hi - mid)+1;
                if(rc %2 ==0){
                    hi = mid-1;
                }else{
                    lo = mid+2;
                }
            }else if(nums[mid]== nums[mid-1]){
               // left partition
                 
                int lc = (mid - lo)+1;
                if(lc %2 ==0){
                    lo = mid+1;
                }else{
                    hi = mid-2;
                }
            }
        }
        return -1;
    }
}
