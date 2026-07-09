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
    public ListNode reverseList(ListNode head) {
        ListNode newNode=head;
        ListNode pre=null;

        while(newNode!=null){
            ListNode Node=newNode.next;
            newNode.next=pre;
            pre=newNode;
            newNode=Node;
        }
        return pre;
        
    }
}