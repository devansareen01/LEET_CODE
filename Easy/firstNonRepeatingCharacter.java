class Solution {
   
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            int index = s.indexOf(i);
            int lastIndex = s.lastIndexOf(i);
            if (index != -1 && index == lastIndex) {
                ans = Math.min(ans, index);
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }
}
