class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Make sure list1 starts with the smaller node
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode head = list1;

        while (list1 != null && list2 != null) {

            ListNode prev = null;

            // Move through list1 until we find
            // where list2 should be inserted
            while (list1 != null && list1.val <= list2.val) {
                prev = list1;
                list1 = list1.next;
            }

            // Insert list2 between prev and list1
            prev.next = list2;

            // Swap list1 and list2
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        return head;
    }
}