/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();

        int level = 1;
        q.add(root);
        while (!q.isEmpty()) {
            
            List<Integer> l = new ArrayList<>();
            int c = q.size();
           for(int i =0; i<c;i++){
             TreeNode curr = q.poll();
            l.add(curr.val);
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
           }
        
            if (level % 2 == 0) {
                List<Integer> rl = new ArrayList<>();
                for (int i = l.size() - 1; i >= 0; i--) {
                    rl.add(l.get(i));
                }
                ans.add(rl);
            } else {
                ans.add(l);
            }
            level++;
        }
        
        return ans;
    }
}
