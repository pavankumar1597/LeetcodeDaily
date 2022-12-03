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
    public ListNode removeNodes(ListNode head) {
        
        Stack<Integer> stack = new Stack<>();
       return recursion(head,stack);
        
    }
    
    
    
   ListNode recursion(ListNode head , Stack<Integer> stack ){
        
        
       if(head.next == null){
           stack.push(head.val);
           return head ;
       }
       
       
       
       
       
      ListNode  resLink =  recursion(head.next,stack);
       
       
       
       
       while(stack.size() != 0 && stack.peek() <= head.val ){
           stack.pop();
           
       }
       
       if(stack.size() ==0 ){            
            head.next = resLink; 
            stack.push(head.val);
            return head ;
       }else{
            return resLink ;
       
       }
       
       
        
        
        
    }
    
    
    
}