class Solution {
    public  List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        util(s, 0, ans, new ArrayList<>());
        return ans;
    }

    public  void util(String s, int idx, List<List<String>> ans, List<String> ds) {
        if (idx == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                ds.add(s.substring(idx, i + 1));
                util(s, i + 1, ans, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public  boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
