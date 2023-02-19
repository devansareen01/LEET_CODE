class Solution {
    public  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        util(ans, nums, 0);
        return ans;
    }

    private  void util(List<List<Integer>> ans, int[] nums, int idx) {
        if (idx == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(nums, i, idx);
            util(ans, nums, idx + 1);
            swap(nums, i, idx);
        }
    }

    private  void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
