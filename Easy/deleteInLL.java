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
    public ListNode removeElements(ListNode head, int val) {
     ListNode temp = head;
     ListNode prev = temp;

      while(temp!=null && temp.val==val){
          head = temp.next;
          temp = head;
      }
      while(temp!=null){
          if(temp.val==val){
              prev.next = temp.next;
              temp = prev.next;
          }else{
              prev = temp;
              temp = temp.next;
          }
      }
        return head;
    }
}
