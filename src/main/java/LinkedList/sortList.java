package LinkedList;


//  public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
//
class sortList {
    public static ListNode sortList(ListNode left) {
        if(left == null)
      {
          return null ; 
      }
        ListNode mid = getMid(left);
        ListNode right = mid.next ; 
        mid = null;
       left = sortList(left);
       right = sortList(right);
      return  merge(left,right);
    }
    
    
    
    static ListNode getMid(ListNode head){
        ListNode fp = head ;
        ListNode sp = head ;
        while(fp != null && fp.next != null){
            fp = fp.next.next ;
            sp = sp.next ;
        }
        return sp  ;
    }
    
    
  static ListNode  merge(ListNode left, ListNode right){
      if(left == null)
      {
          return right ; 
      }
      
      if(right == null){
          return left ;
      }
      
      
      
      if(left.val < right.val){
         left.next = merge(left.next,right);
          return left ;
      }else{
         right.next = merge(left,right.next);
          return right ;
      }      
      
    }


    public static void main(String[] args) {
        ListNode n5 = new ListNode(8,null);
        ListNode n4 = new ListNode(5,n5);
        ListNode n3 = new ListNode(2,n4);
        ListNode n2 = new ListNode(6,n3);
        ListNode n1 = new ListNode(1,n2);
        System.out.println(sortList(n1));
    }
}