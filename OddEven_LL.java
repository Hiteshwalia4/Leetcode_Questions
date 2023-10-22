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

      // Method 2
        // int k=1;
        // ListNode even= new ListNode();  
        // ListNode odd= new ListNode();
        // ListNode i=odd,j=even; 
        // while(head!=null){
        //     if(k%2==0){
        //         j.next=head;
        //         j=j.next;
        //     }
        //     else{
        //         i.next=head;
        //         i=i.next;
        //     }
        //     head=head.next;
        //     k++;
        // } 
        // j.next=null;
        // i.next=even.next;
        // return odd.next;
    }
}
