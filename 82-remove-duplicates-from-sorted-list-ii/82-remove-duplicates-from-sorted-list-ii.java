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
    public ListNode deleteDuplicates(ListNode head) {
        
        
        ListNode prev = new ListNode(-500,head);
                ListNode mhead =       prev ;
 ;

        
        
        while(head != null && head.next != null){
            
             if(head.val  == head.next.val ){
                 
                 while(head != null && head.next != null && head.val  == head.next.val){ 
                    head = head.next ;
                 }
                 head = head.next ;
                 prev.next = head ;
            }else { 
            prev = prev.next ;
            head = head.next ;
        }
        }
        
        return mhead.next ;
        
    }
}