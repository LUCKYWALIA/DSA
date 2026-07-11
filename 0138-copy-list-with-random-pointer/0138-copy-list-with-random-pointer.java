/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
Node temp=head;

while(temp!=null){
    Node nextele=temp.next;
    Node cpy=new Node(temp.val);

cpy.next=nextele;
    temp.next=cpy;
    temp=nextele;
}


 temp=head;

while(temp!=null){
Node res=temp.next;
if(temp.random!=null){
res.random=temp.random.next;
}
else{
    res.random=null;
}
temp=temp.next.next;
}

 temp=head;
Node dum=new Node(-1);
Node ans=dum;


while(temp!=null){
ans.next=temp.next;
ans=ans.next;

temp.next=temp.next.next;
temp=temp.next;
}

return dum.next;
    }
}