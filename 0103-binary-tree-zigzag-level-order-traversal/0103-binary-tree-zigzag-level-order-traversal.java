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

Queue <TreeNode> q=new LinkedList<>();
List <List<Integer>> l=new ArrayList<>();

if(root==null) return new ArrayList<>();

q.offer(root);
boolean f=false;

while(!q.isEmpty()){
List<Integer> ans= new ArrayList<>();

int s=q.size();
for(int i=0;i<s;i++){
TreeNode curr=q.poll();
ans.add(curr.val);
if(curr.left!=null) q.offer(curr.left);
if(curr.right!=null) q.offer(curr.right);
}
if(f) Collections.reverse(ans);
f=!f;
l.add(ans);
}
return l;
    }
}