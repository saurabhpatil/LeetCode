/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        int temp = 0, node_idx = 0;
        
        if(node == null)
            return head;
        
        while(node.next != null)
        {
            if(node_idx%2 == 0)
            {
                temp = node.val;
                node.val = node.next.val;
                node.next.val = temp;
            }
            node = node.next;
            node_idx++;
        }
        return head;
    }
}