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



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode moverl1=l1;
        ListNode moverl2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode add=dummy;

        int carry=0;

        while(moverl1!=null || moverl2!=null){
int val=0;
 if(moverl1!=null) val+=moverl1.val;
 if(moverl2!=null) val+=moverl2.val;

val+=carry;
carry=val/10;
val=val%10;

add.next=new ListNode(val);

 if(moverl1!=null) moverl1=moverl1.next;
 if(moverl2!=null) moverl2=moverl2.next;

add=add.next;

        }


if(carry!=0) add.next=new ListNode(carry);



return dummy.next;

    }
}