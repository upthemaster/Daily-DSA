class Solution { // Recursively
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) { // base case
            return head;
        }

        ListNode newHead = reverseList(head.next); // calls recursively to reverse ll

        head.next.next = head; // forms a reverse link
        head.next = null; // last node become the head

        return newHead; // returns a reversed list
    }
}