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
    public List<Integer> postorderTraversal(TreeNode root) {
        
                ArrayList<Integer> list = new ArrayList<Integer>();
        Btree(list,root);
        return list; 
        
    }
    
    
   void  Btree(ArrayList<Integer> list ,TreeNode root ){
        
       
        if(root == null){
            return ; 
        }               Btree(list, root.left);

               Btree(list, root.right);
                     list.add(root.val);

        
    }
}