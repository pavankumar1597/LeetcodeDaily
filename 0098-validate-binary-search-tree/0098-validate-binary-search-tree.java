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
    public boolean isValidBST(TreeNode root) {
 
        return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    
    boolean isBST(TreeNode root,long s ,long e){
        
        if(root == null){
            return true ;
        }
            
                if(root.val >= e || root.val <= s ){
                                return false ;

                }
        
            boolean lbt =  isBST(root.left,s,root.val);
            boolean rbt =  isBST(root.right,root.val,e);
            return lbt && rbt ;
             
        
        
//             public boolean isValidBST(TreeNode root,long max,long min ){
//         if(root == null) return true ; 
//         if(root.val <= min || root.val >= max) return false ; 
//         boolean left  = isValidBST(root.left,root.val,min);
//         boolean right = isValidBST(root.right,max,root.val);
//         return left && right ;        
    // }

    }
}