/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        
        if(head == null || head.next ==null) return true ;
        ListNode fp = head.next.next ;  ListNode sp = head.next ; 
        
        
        
        while(fp  != null && fp.next  != null  ){
 
        fp = fp.next.next ;
            sp = sp.next ;
        }
        
        ListNode prev = null ;
    
         while(sp != null){
 
             ListNode temp = sp.next ; 
             sp.next = prev ;
             prev = sp ;
             sp = temp; 
         }
          
        
        while(head != null && prev != null){
            
            if(head.val == prev.val){
                
                head = head.next ;
                prev = prev.next;
            }else{
                return false ; 
            }
            
            
            
        }    
        
        
        return true ;
        
        
    }
}