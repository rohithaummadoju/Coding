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
    public ListNode sortList(ListNode head) {
        /*ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(arr);
        curr=head;
        int i=0;
        while(curr!=null){
            curr.val=arr.get(i);
            curr=curr.next;
            i++;
        }
        return head;*/


     /* Bubble sort
        ListNode i=head;
        while(i!=null){
            ListNode curr=head;;
            while(curr!=null && curr.next!=null){
                if(curr.val>curr.next.val){
                    int t=curr.val;
                    curr.val=curr.next.val;
                    curr.next.val=t;
                }
                curr=curr.next;
            }
            i=i.next;
        }
        return head;*/
        
        if(head==null||head.next==null){
            return head;
        }
        ListNode left = null;
        ListNode right=null;
        if(head.next.next==null){
            right=sortList(head.next);
            head.next=null;
            left=sortList(head);
        }
        else{
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

            }
            ListNode mid = slow.next;
            slow.next = null;   
            left = sortList(head);
            right = sortList(mid);
        }
        return merge(left,right);
    }
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}