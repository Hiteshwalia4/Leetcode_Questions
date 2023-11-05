// https://leetcode.com/problems/odd-even-linked-list/

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
    public ListNode oddEvenList(ListNode head) {
        int i=1,len=0;
        if(head==null) return null;
        ListNode slow=head,fast=head.next,var=head.next,temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(len%2==1){
            while(fast!=null ){
                slow.next=fast.next;
                 slow=fast;
                fast=fast.next;
            }
        }
        else{
            while(fast.next!=null ){
                slow.next=fast.next;
                slow=fast;
                fast=fast.next;
            }
        }
        slow.next=var;
        return head;

    }
}
