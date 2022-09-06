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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode nd  = head; 
        ListNode ans = head; 
        ListNode prev = head ;
        int i = 0 ; 
        int j = 0 ;
            
        if(head.next == null){
            
            return null;
            
        }
        
        while(head != null ){
            head = head.next ;
            j++ ;
            if( j - i > n  ){
                i++;
                prev = nd ;
                nd = nd.next;
            }
        }
        
    
        prev.next = nd.next;
        
                if(j==n)return ans.next; //in this case we have to delete original head node

        
        return ans ;
    }
}