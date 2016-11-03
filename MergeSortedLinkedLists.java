//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode m1 = head;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                m1.next = l1;
                l1 = l1.next;
                m1 = m1.next;
            }
            else
            {
                m1.next = l2;
                l2 = l2.next;
                m1 = m1.next;
            }
        }
        
        if(l1 != null)
        {
            m1.next = l1;
        }
        
        if(l2 != null)
        {
            m1.next = l2;
        }
        
        return head.next;
    }
}