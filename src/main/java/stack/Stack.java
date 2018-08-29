package stack;

class Stack {

    private int size;
    private int[] array;
    private int top;

    Stack(int size) {
        this.size = size;
        this.array = new int[size];
        this.top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == size - 1;
    }

    void push(int pushedElement) {
        if (isFull()) {
            throw new IllegalStateException("stack is full");
        }
        ++top;
        array[top] = pushedElement;
    }

    int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        int indexToBeReturned = top;
        --top;
        return array[indexToBeReturned];
    }
}
