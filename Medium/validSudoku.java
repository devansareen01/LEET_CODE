class Solution {
     public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String row = "row" + String.valueOf(i) + board[i][j];// we will maintain a String for every col ,row and box and add into into Set if it already contains that String then return false otherwise return true if all The iterations Are done
                    String col = "col" + String.valueOf(j) + board[i][j];
                    String box = "box" + String.valueOf((i / 3) * 3 + (j / 3)) + board[i][j];

                    if (!set.contains(row) && !set.contains(col) && !set.contains(box)) {
                        set.add(row);
                        set.add(col);
                        set.add(box);
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
