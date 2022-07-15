package LinkedList;


public class SwapNodes {
    public static ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null ) return head; 
        
        ListNode  prevheads  = head  ;
        ListNode heads  = head.next  ;
        while(head != null &&  head.next != null ){
            
            
          ListNode  temp = head.next ;
            prevheads.next =temp ;
            head.next = temp.next ;
            temp.next = head ;
            prevheads = head ;
            head = head.next ;

        }
        
        
        return heads;
        
        
        
        
    }


    public static void main(String[] args) {
        ListNode n5 = new ListNode(5,null);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);


        System.out.println(swapPairs(n1));
    }
}