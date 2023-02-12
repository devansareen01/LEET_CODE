class Solution {
     public  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        util(nums, 0, ans, new ArrayList<>());
        return ans;
    }

    public  void util(int[] nums, int idx, List<List<Integer>> fin, List<Integer> ans) {
        if (idx == nums.length) {
            fin.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[idx]);
        // when we are decide to choose it
        util(nums, idx + 1, fin, ans);
        ans.remove(ans.size()-1);
        // when we decide to not chossing it
        util(nums, idx + 1, fin, ans);

    }
}
