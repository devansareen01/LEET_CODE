class Solution {
   public  boolean binarySearch(int key, int data[]) {
        int low = 0;
        int high = data.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (data[middle] == key) {
                return true;
            }
            if (data[middle] < key) {
                low = middle + 1;
            }
            if (data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }

    public  boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i != matrix.length - 1) {
                    if (matrix[i][j] <= target && matrix[i + 1][j] > target) {
                        int arr[] = new int[matrix[0].length];
                        for (int k = 0; k < matrix[0].length; k++) {
                            arr[k] = matrix[i][k];
                        }

                        ans = binarySearch(target, arr);
                    }
                    if (ans) {
                        return ans;
                    }
                } else {
                    int arr[] = new int[matrix[0].length];
                    for (int k = 0; k < matrix[0].length; k++) {
                        arr[k] = matrix[i][k];
                    }
                    ans = binarySearch(target, arr);
                    if (ans) {
                        return ans;
                    }
                }
            }
        }
        return false;
    }
}
