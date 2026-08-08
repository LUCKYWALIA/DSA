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
    public int maxPathSum(TreeNode root) {
        int maxval[]=new int[1];
        maxval[0]=Integer.MIN_VALUE;
        maxpathDown(root,maxval);
        return maxval[0];
    }
    int maxpathDown(TreeNode root,int maxval[]){
        if(root==null) return 0;
int leftsum=Math.max(0,maxpathDown(root.left,maxval));
int rightsum=Math.max(0,maxpathDown(root.right,maxval));
maxval[0]=Math.max(maxval[0],leftsum+rightsum+root.val);
return Math.max(leftsum,rightsum)+root.val;
    }
}