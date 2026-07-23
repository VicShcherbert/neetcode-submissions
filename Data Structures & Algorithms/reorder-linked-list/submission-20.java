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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        // System.out.println(slow.val);
        // System.out.println(fast.val);

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        

        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        ListNode toSave = null;

        while(curr != null){
            toSave = curr.next;
            curr.next = prev;
            prev = curr;
            curr = toSave;    
        }

        // slow.next = prev;
        ListNode first = head;
        ListNode second = prev;
        ListNode fTS = null;
        ListNode sTS = null;
        while(second != null){
            fTS = first.next;
            sTS = second.next;
            first.next = second;
            second.next = fTS;
            first = fTS;
            second = sTS;
        }
    }
}
