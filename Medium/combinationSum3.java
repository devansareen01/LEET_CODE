 public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        util(k, n, new ArrayList<>(), ans, 1, 0);
        return ans;
    }

    public static void util(int k, int n, List<Integer> ds, List<List<Integer>> ans, int idx, int sum) {
        if (sum == n && k == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (sum > n) {
            return;
        }
        for (int i = idx; i <= 9; i++) {
            if (i > n) {
                break;
            }
            ds.add(i);
            util(k - 1, n, ds, ans, i + 1, sum + i);
            ds.remove(ds.size() - 1);

        }

    }
