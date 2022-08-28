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
// class Solution {
// //     public boolean isValidBST(TreeNode root) { 
// //       return   isValidBST(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
// //     }

// //     public boolean isValidBST(TreeNode root,int max,int min ){
// //         if(root == null) return true ; 
// //         if(root.val <= min || root.val > max) return false ; 
// //         boolean left  = isValidBST(root.left,root.val,min);
// //         boolean right = isValidBST(root.right,max,root.val);
// //         return left && right ;        
// //     }



// }
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}