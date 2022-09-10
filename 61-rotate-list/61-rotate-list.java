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
    public ListNode rotateRight(ListNode head, int k) {
        
        
        
        if(head == null || head.next == null || k ==0 ){
            return head ; 
        }
        
        ListNode main =  head ; 
        ListNode fp = head ; 
        ListNode sp = head ; 
        int j = 0 ; 
        int i = 0 ;
        int length = 0 ; 
        
        while(fp != null){
            fp = fp.next;
            length++;
        }
        
        fp = head ;
        k = k%length ;
        
        
        if(k == 0 ){
            return head ; 
        }
        
        while(fp != null){
            fp  = fp.next ;
            j++;
            
            if((j-i) > k+1){
                
                sp = sp.next ; 
                i++ ;
            }
        }
        
        
        ListNode temp = sp.next ; 
        ListNode newhead = temp ;
        sp.next = null ;
        
        
        while( temp!= null && temp.next != null){
            
            temp= temp.next ; 
            
        }
        
        
        temp.next =head ;
        
        
        
        
        
        
        
      return  newhead ; 
        
        
        
    }
}