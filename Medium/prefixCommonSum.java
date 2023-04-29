class Solution {
   public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[] = new int[A.length];

        HashSet<Integer> set = new HashSet<>();
    
        for (int i = 0; i < A.length; i++) {
            set.add(B[i]);
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (set.contains(A[j])) {
                    count++;
                }
            }
            ans[i] = count;
    
        }
        return ans;
    }
}
