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

     public static boolean mirror(TreeNode Left,TreeNode Right){
    if(Left==null && Right==null) return true;
    if(Left==null && Right!=null ||( Left!=null && Right==null)|| Left.val!=Right.val)return false;

    return mirror(Left.left,Right.right)&& mirror(Left.right,Right.left);
 }
 
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        if(root.left==null && root.right==null)return true;
        

        return mirror(root.left,root.right);
    }
}