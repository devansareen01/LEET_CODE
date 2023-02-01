/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode hare = head;
        ListNode turtle = head;
        while(hare!=null && turtle!=null && turtle.next!=null ){
            hare = hare.next;
            turtle = turtle.next.next;
            if(hare==turtle){
                return true;
            }
        }
        return false;
    }
}
