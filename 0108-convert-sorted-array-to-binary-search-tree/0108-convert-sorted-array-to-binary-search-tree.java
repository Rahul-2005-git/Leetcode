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
    public TreeNode sortedArrayToBST(int[] nums) {

       int l=0,r=nums.length-1;
       int mid=l+(r-l)/2;
       TreeNode root=new TreeNode();
       root.val=nums[mid];
       root.left=addNode(nums,l,mid-1);
       root.right=addNode(nums,mid+1,r);


        return root;
    }

    TreeNode addNode(int [] nums,int l,int r){

        if(l>r)return null;

        int mid=l+(r-l)/2;
         TreeNode node=new TreeNode();
         node.val=nums[mid];
       node.left=addNode(nums,l,mid-1);
       node.right=addNode(nums,mid+1,r);
       return node;

    }
}