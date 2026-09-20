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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> row = new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode ans = q.poll();
                if (ans.left!=null){
                    q.offer(ans.left);
                }
                if (ans.right!=null){
                    q.offer(ans.right);
                }
                row.add(ans.val);
            }
            result.add(row);
        }
        return result;
    }
}