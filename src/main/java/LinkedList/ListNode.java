package LinkedList;

public class ListNode {
      int val;
      ListNode next;

      @Override
      public String toString() {
            return  val +
                    " ----> " + next;
      }

      public int getVal() {
            return val;
      }

      public void setVal(int val) {
            this.val = val;
      }

      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
