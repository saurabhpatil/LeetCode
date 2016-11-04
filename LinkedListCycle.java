/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
*/

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
    public boolean hasCycle(ListNode head) {
        if(head == null) 
            return false;
        
        ListNode node1 = head;
        ListNode node2 = head;
        int cntr = 0;
        while(node1.next != null)
        {
            node1 = node1.next;
            cntr++;
            
            if(node1 == node2)
                return true;
            if(cntr%3==0)
                node2 = node2.next;
        }
        return false;
    }
}