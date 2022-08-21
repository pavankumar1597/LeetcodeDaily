/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        
        
        if(head==null || head.next==null){return null;}

        ListNode fp = head ; 
        ListNode sp = head ;
        
        
        ListNode slow =  null ;
        
        while(fp != null && fp.next != null ){
            
  
            
            sp = sp.next;
            fp = fp.next.next;
                      if(fp == sp){
                
break ;
                      }
            
            
        }
        
        
        //if slow!=fast return null as there is no loop
        if(sp!=fp)return null;
		//now initalise slow to head again
        sp=head;
		//now both slow and fast will do a single jump until slow==fast then break
        while(sp!=fp){
            sp=sp.next;
            fp=fp.next;
        }
		//now you can return slow or fast as booth are same
        return sp;
        
        
        
    }
}