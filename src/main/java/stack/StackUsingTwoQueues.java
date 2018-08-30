package stack;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingTwoQueues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    StackUsingTwoQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    boolean isEmpty() {
        return queue1.size() == 0;
    }

    int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        return queue1.remove();
    }

    void push(int pushedElement) {
        if (isEmpty()) {
            queue1.add(pushedElement);
        } else {
            copy(queue1, queue2);
            queue1.add(pushedElement);
            copy(queue2, queue1);
        }
    }

    private void copy(Queue<Integer> from, Queue<Integer> to) {
        for (int i = 0; i < from.size(); i++) {
            to.add(from.remove());
        }
    }
}
