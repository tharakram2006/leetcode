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
    public int findMinRight(TreeNode root) {

    if (root == null || root.right == null) {
        return -1;
    }

    TreeNode curr = root.right;

    while (curr.left != null) {
        curr = curr.left;
    }

    return curr.val;
}
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        if(key<root.val)
        {
           root.left= deleteNode(root.left,key);
        }
        if(key>root.val)
        {
           root.right= deleteNode(root.right,key);
        }
        if(root.val==key)
        {
        if(root.left==null)
        {
            return root.right;
        }
        if(root.right==null)
        {
   return root=root.left;
}
int min=findMinRight(root);
root.val=min;
root.right=deleteNode(root.right,min);
        }
        return root;
    }
}