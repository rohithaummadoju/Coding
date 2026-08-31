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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0){
            return head;
        }
        ListNode cur=head;
        int c=1;
        while(cur.next!=null) {
            cur=cur.next;
            c++;
        }
        k=k%c;
        if(k==0) return head;
        cur.next=head;
        ListNode newT=head;
        for(int i=1;i<c-k;i++) {
            newT=newT.next;
        }
        ListNode newH=newT.next;
        newT.next=null;
        return newH;
    }
}