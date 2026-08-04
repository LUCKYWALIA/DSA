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
    
    int Find(TreeNode root){
        if(root==null) return 0;
        int left=Find(root.left);
        int right=Find(root.right);
        
return 1+Math.max(left,right);

    }
    
       public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int l=Find(root.left);
        int r=Find(root.right);

        if(Math.abs(r-l)>1)return false;

        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);

if(!left || !right) return false;

        return true;
    }
}