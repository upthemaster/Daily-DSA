class Solution { // Approach : S & F Pointer using one-Traversal    Time : O(n)     Space : O(1)
        public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}