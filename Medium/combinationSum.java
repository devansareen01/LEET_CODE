class Solution {

    private  void util(int[] candidates, int target, int idx, List<List<Integer>> ans, List<Integer> ds) {
        if (idx == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (candidates[idx] <= target) {// picking condition
            ds.add(candidates[idx]);
            util(candidates, target - candidates[idx], idx, ans, ds);// picking the elment any numbers of time
            ds.remove(ds.size() - 1);
        }
        util(candidates, target, idx + 1, ans, ds);
    }

    public  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        util(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }
}
