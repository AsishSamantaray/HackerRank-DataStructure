static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    Stack<SinglyLinkedListNode> stack = new Stack<>();        

    while(head.next != null) {
        stack.push(head);
        head = head.next;
    }

    SinglyLinkedListNode curr = head;
    while(!stack.empty()) {
        head.next = stack.pop();
        head = head.next;            
    }
    head.next = null;
    return curr;
}
