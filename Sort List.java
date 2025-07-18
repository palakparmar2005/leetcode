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
    public static ListNode merge(ListNode a,ListNode b){
        ListNode extra = new ListNode(-1);
        ListNode tail = extra;

        ListNode trav1 = a;
          ListNode trav2 = b;

          while(trav1!=null && trav2!=null){
            if(trav1.val<=trav2.val){
                tail.next = trav1;
                trav1 = trav1.next;
                tail = tail.next;
                tail.next = null;
            }
            else{
                tail.next = trav2;
                trav2 = trav2.next;
                tail = tail.next;
                tail.next = null;
            }
          }
          if(trav1!=null){
            tail.next = trav1;
          }
          else tail.next = trav2;
          return extra.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;

        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next;

            if(fast!=null)fast = fast.next;

        }
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode a = sortList(head);
        ListNode b = sortList(head2);

        ListNode ans = merge(a,b);
        return ans;
    }
}
