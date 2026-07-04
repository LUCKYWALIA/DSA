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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
if(head.next==null) return null;

ListNode a=head;
ListNode b=head;

int i=1;
while(i<=n){
b=b.next;
i++;
}

if(b==null) return head.next;

while(b.next!=null){
    b=b.next;
    a=a.next;
}

if(a.next!=null){
a.next=a.next.next;
}

return head;
    }
}