class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i =0;
        int j = n;
        int ans [] = new int[nums.length];
        
         int k =0;
         while(i<n && j<nums.length){
             ans[k++] = nums[i++];
             ans[k++]  = nums[j++];
         }
        return ans;
    }
}
