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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();
        inOrderHelper(root1, t1);
        inOrderHelper(root2, t2);
        if (t1.equals(t2)){
            return true;
        }
        return false;
    }

    void inOrderHelper(TreeNode root, List<Integer> t){
        if (root==null){
            return ;
        }
        inOrderHelper(root.left,t);
        if (root.left==null && root.right==null){
            t.add(root.val);
        }
        inOrderHelper(root.right,t);
    }
}