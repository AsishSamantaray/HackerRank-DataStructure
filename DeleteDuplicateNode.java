static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        if(head == null) {
            return head;
        }

        SinglyLinkedListNode curr = head;

        while(curr.next != null) {
            if(curr.data != curr.next.data) {
                curr = curr.next;
            }
            else {
                curr.next = curr.next.next;
            }
        }
        return head;
    }
