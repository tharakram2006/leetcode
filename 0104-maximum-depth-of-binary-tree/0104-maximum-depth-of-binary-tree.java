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
    private int maxnode(TreeNode root,int count,int max){
                if(root==null)
                {
                    return max;
                }
            
            if(count>max)
            {
                max=count;
            }
        
       max= maxnode(root.left,count+1,max);
        max=maxnode(root.right,count+1,max);
        return max;
    }
    public int maxDepth(TreeNode root) {
        
        if(root!=null){
            int count=1;
            int max=0;
           return maxnode(root,count,max);
        }
        return 0;
    }
}