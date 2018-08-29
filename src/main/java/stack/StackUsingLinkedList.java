package stack;

class StackUsingLinkedList {

    private Node head;

    boolean isEmpty() {
        return head == null;
    }

    int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        int valueToBeReturned = head.value;
        head = head.next;
        return valueToBeReturned;
    }

    void push(int pushedElement) {
        Node oldHead = head;
        head = new Node();
        head.value = pushedElement;
        head.next = oldHead;
    }

    private class Node {
        int value;
        Node next;
    }
}