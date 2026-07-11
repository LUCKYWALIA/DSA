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

public ListNode findk(ListNode head,int num){
if(head==null) return null;

int c=1;
while(head.next!=null){
if(c==num) return head;
c++;
head=head.next;
}
return head;
}


    public ListNode rotateRight(ListNode head, int k) {
        
if(head==null || head.next==null || k==0){
    return head;
}

        int len=1;
        ListNode temp=head;

        while(temp.next!=null){
temp=temp.next;
len++;
        }

if(k%len==0) return head;
k=k%len;

temp.next=head;
ListNode NewTail=findk(head,len-k);
head=NewTail.next;
NewTail.next=null;



return head;
    }
}