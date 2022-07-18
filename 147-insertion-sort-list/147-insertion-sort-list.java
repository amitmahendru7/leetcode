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
    ListNode preHead;
    public ListNode insertionSortList(ListNode head) {
        preHead= new ListNode();
        ListNode curr = head;
        while(curr !=null){
            ListNode prev= preHead;
            while(prev.next !=null && prev.next.val <curr.val)
                prev = prev.next;
            ListNode temp = curr.next;
            curr.next= prev.next;
            prev.next= curr;
            
            curr = temp;
        }
        return preHead.next;
        
    }
}