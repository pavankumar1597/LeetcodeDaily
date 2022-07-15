package LinkedList;

import java.util.LinkedList;

public class ReverseaLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev =null ;
        
        
        while(head != null ){
            ListNode temp = head.next;
            head.next = prev ;
            prev = head  ;
            head = temp ; 
            
        }
        
        return prev ; 

        
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5,null);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);


        System.out.println(reverseList(n1));
    }
}