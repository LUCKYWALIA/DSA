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
    int postidx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postidx=postorder.length-1;
        return helper(inorder,postorder,0,inorder.length-1);
    }


    TreeNode helper(int [] inorder,int [] postorder,int left,int right){
if(left>right) return null;

int rootval=postorder[postidx--];
TreeNode root=new TreeNode(rootval);

int idx=left;
for(int i=idx;i<=right;i++){
if(inorder[i]==rootval){
    idx=i;
    break;
}
}

root.right=helper(inorder,postorder,idx+1,right);
root.left=helper(inorder,postorder,left,idx-1);

return root;
    }
}