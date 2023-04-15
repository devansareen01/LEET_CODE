class Solution {
 public  int nod(int n) {
     if(n==0) return 1;
        int dig = n;
        int count = 0;
        while (dig != 0) {
            count++;
            dig = dig / 10;

        }
        if (n < 0)
            return count+1;
        return count ;
    }

    public  int[] findColumnWidth(int[][] grid) {
        
        int ans[] = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < grid.length; j++) {
               
                  max = Math.max(nod(grid[j][i]), max);
            }
            ans[i] = max;
        }
        return ans;
    }
}
