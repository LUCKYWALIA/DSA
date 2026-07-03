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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
if (headA == null || headB == null) return null;

ListNode moverA=headA;
ListNode moverB=headB;

while(moverA!=moverB){
if(moverA==null) moverA=headB;
else moverA=moverA.next;
if(moverB==null) moverB=headA;
else moverB=moverB.next;
}


return moverA;
    }
}