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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists==null || lists.length==0 )return null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode res=new ListNode(0);
        ListNode curr=res;
        int n=lists.length;
        for(int i=0;i<n;i++){
            if(lists[i]!=null){

            pq.offer(lists[i]);
            lists[i]=lists[i].next;
            }
        }
        
        while(!pq.isEmpty()){
            ListNode minNode=pq.poll();
            curr.next=minNode;
            curr=curr.next;
            if(curr.next!=null){
                pq.offer(curr.next);
            }
        }
        return res.next;



    }
}