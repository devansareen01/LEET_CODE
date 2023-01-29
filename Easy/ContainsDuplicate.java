class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length , n = mat[0].length;
        int ans[][] = new int[r][c];
        if(m*n==r*c){
             Queue<Integer> q = new LinkedList<>();
             for(int i =0;i<m;i++){
                 for(int j =0;j<n;j++){
                     q.add(mat[i][j]);
                 }
             }
             for(int i =0;i<r;i++){
                 for(int j =0; j<c;j++){
                     ans[i][j]= q.peek();
                     q.remove();
                 }
             }
            return ans;
        }
        return mat;
    }
}
