// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
// Method 1
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int c=1;
        while(c<k){
            c++;
            temp=temp.next;
        }
        ListNode i=head,j=temp;
        while(j.next!=null){
            i=i.next;
            j=j.next;
        }
        int t=i.val;
        i.val=temp.val;
        temp.val=t;

        return head;       
    }
}

// Method 2
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int i=0,j=al.size()-1;
        int val=al.get(i+k-1);
        al.set(i+k-1,al.get(j-k+1));
        al.set(j-k+1,val);

        ListNode dummy= new ListNode();
        temp=dummy;
        for(int el:al){
            temp.next= new ListNode(el);
            temp=temp.next;
        }
        return dummy.next;
    }
}
