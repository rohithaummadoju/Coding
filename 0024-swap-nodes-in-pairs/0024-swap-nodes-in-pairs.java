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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
                return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=head;
        ListNode prev=dummy;
        ListNode second=first.next;
        ListNode third;
        while(first!=null && second!=null){
            third=second.next;
            second.next=first;
            first.next=third;
            prev.next=second;
            prev=first;
            first=third;
            if(first!=null){
                second=first.next;
            }
            else{
                second=null;
            }
        }
        return dummy.next;
    }
}