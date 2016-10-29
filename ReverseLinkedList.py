# Reverse a singly linked list.

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None:
            return None
        node = head
        prevNode = node
        node = node.next
        prevNode.next = None
        while node:
            nextNode = node.next
            node.next = prevNode
            prevNode = node
            node = nextNode
        return prevNode