# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    # def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        


    def swapPairs(self,head: ListNode) -> ListNode:
        if not head or not head.next:
            return head

        # swap the current node with its next node
        node1 = head
        node2 = head.next
        node1.next = self.swapPairs(node2.next)
        node2.next = node1

        # return the new head
        return node2
