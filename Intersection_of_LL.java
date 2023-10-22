// https://leetcode.com/problems/intersection-of-two-linked-lists/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int getDifference(ListNode h1,ListNode h2){
        int len1=0,len2=0;
        while(h1!=null){
            len1++;
            h1=h1.next;
        }
        while(h2!=null){
            len2++;
            h2=h2.next;
        }
        return len1-len2;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff=getDifference(headA,headB);
        if(diff<0)
            while(diff++ != 0)
                headB=headB.next;
        else        
            while(diff-- != 0)
                headA=headA.next;

        while(headA!=null){
            if(headA==headB) return headA;
            headA=headA.next;        
            headB=headB.next;
        }
        return headA;        
    }
}
