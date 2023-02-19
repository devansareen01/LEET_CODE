class Solution {
        public  List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        util(new ArrayList<>(), nums, 0, ans);
        return ans;
    }

    public  void util(List<Integer> ans, int nums[], int idx, List<List<Integer>> ds) {

        ds.add(new ArrayList<>(ans));
 
        for (int i = idx; i < nums.length; i++) {
            if (i != idx && nums[i] == nums[i - 1])
                continue;
            ans.add(nums[i]);
            util(ans, nums, i + 1, ds);
            ans.remove(ans.size() - 1);
        }
        // ans.add(nums[idx]);
        // util(ans, nums, idx + 1, ds);
        // ans.remove(ans.size() - 1);
        // util(ans, nums, idx + 1, ds);

    }
}
