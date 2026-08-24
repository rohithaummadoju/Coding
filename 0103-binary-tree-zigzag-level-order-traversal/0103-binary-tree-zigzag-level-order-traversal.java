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
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean LeftToRight=true;
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer> level=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode ele=q.poll();
                if(LeftToRight){
                    level.addLast(ele.val);
                }
                else{
                    level.addFirst(ele.val);
                }
                if(ele.left!=null){
                    q.offer(ele.left);
                }
                if(ele.right!=null){
                    q.offer(ele.right);
                }
            }
            ans.add(level);
            LeftToRight=!LeftToRight;
        }
        return ans;
    }
}
