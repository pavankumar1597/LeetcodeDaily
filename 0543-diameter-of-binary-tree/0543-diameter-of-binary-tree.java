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

class TreeInfo{
    int dia ;
    int len ; 
    TreeInfo(int diaa , int lenn){
        this.dia = diaa ; 
        this.len = lenn ;
    }
    
}

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
    TreeInfo rooingo =  getinfo(root);
        return rooingo.dia ;
        
    }
    
    
   TreeInfo getinfo(TreeNode root){
        
        if(root == null){
            return new TreeInfo(-1,-1);
        }
        
     TreeInfo li  =   getinfo(root.left);
     TreeInfo ri = getinfo(root.right);
     
       
       return new TreeInfo(Math.max(li.len+ri.len+2,Math.max(li.dia,ri.dia)),Math.max(li.len,ri.len)+1);
       
       
       
       
        
    }
}