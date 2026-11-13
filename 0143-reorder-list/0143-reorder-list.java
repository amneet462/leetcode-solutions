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
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode secondhalf=s.next;
        s.next=null;
        ListNode prev = null;
        while(secondhalf!=null){
            ListNode fut=secondhalf.next;
            secondhalf.next=prev;
            prev=secondhalf;
            secondhalf=fut;
        }
            secondhalf = prev;


        ListNode first = head;

        while(secondhalf != null){

            ListNode temp1 = first.next;
            ListNode temp2 = secondhalf.next;

            first.next = secondhalf;
            secondhalf.next = temp1;

            first = temp1;
            secondhalf = temp2;
        }
    }
}