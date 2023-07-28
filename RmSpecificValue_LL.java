// Given the head of a linked list and an integer val, 
//   remove all the nodes of the linked list that has Node.val == val, and return the new head.
// https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode temp=head,prev=dummy;
        
        while(temp!=null){
            if(temp.val==val){
                prev.next=temp.next;
            }
            else{
            prev=temp;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}
