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
      if(head == null) return head;

      Node trav = head;

      while(trav!=null){
        Node temp = new Node(trav.val);
        temp.next = trav.next;
        trav.next = temp;
        trav = trav.next.next;
      }  
      Node trav1 = head;

      while(trav1!=null){
        if(trav1.random == null) trav1.next.random = null;
        else trav1.next.random = trav1.random.next;
        trav1 = trav1.next.next;
      }
Node extra = new Node(-1);
Node tail = extra;

Node trav2 = head;

while(trav2!=null){
    tail.next = trav2.next;
            tail = tail.next;
            trav2.next = tail.next;
            trav2 = trav2.next;
            tail.next = null;
}
return extra.next;
    }
}
