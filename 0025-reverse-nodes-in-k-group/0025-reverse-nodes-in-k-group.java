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

 public ListNode getkth(ListNode head, int k) {
            
ListNode curr=head;

while(curr!=null && k>0){
curr=curr.next;
k--;
}

return curr;
 }



    public ListNode reverseKGroup(ListNode head, int k) {
        
ListNode dum=new ListNode(0);
dum.next=head;

ListNode prevgp=dum;

while(true){

ListNode kth=getkth(prevgp,k);
if(kth==null)break;

ListNode nextgp=kth.next;

ListNode prev=nextgp; // tail
ListNode curr=prevgp.next; // head

for(int i=0;i<k;i++){
ListNode temp=curr.next;
curr.next=prev;
prev=curr;
curr=temp;
}
ListNode connecter=prevgp.next;
prevgp.next=kth;
prevgp=connecter;
}

return dum.next;
    }
}