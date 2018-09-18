package trees;

import java.util.*;

class BinaryTree {

    private BinaryTreeNode root;
    private List<Integer> traversedSoFar = new ArrayList<>();

    BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    List<Integer> traversePreOrder() {
        return traversePreOrder(root);
    }

    List<Integer> traverseInOrder() {
        return traverseInOrder(root);
    }

    List<Integer> traversePostOrder() {
        return traversePostOrder(root);
    }

    List<Integer> traverseLevelOrder() {
        if (root == null) {
            return null;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            traversedSoFar.add(node.getData());
            addToQueue(queue, node.getLeft());
            addToQueue(queue, node.getRight());
        }
        return traversedSoFar;
    }

    List<Integer> traverseZigZagOrder() {
        if (root == null) {
            return null;
        }
        Stack<BinaryTreeNode> currentLevel = new Stack<>();
        Stack<BinaryTreeNode> nextLevel = new Stack<>();

        currentLevel.push(root);
        boolean leftToRight = true;

        while (!currentLevel.isEmpty()) {
            BinaryTreeNode node = currentLevel.pop();
            traversedSoFar.add(node.getData());
            if (leftToRight) {
                addToStack(nextLevel, node.getLeft());
                addToStack(nextLevel, node.getRight());
            } else {
                addToStack(nextLevel, node.getRight());
                addToStack(nextLevel, node.getLeft());
            }
            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<BinaryTreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
        return traversedSoFar;
    }

    private void addToStack(Stack<BinaryTreeNode> stack, BinaryTreeNode node) {
        if (node != null) {
            stack.push(node);
        }
    }

    private void addToQueue(Queue<BinaryTreeNode> queue, BinaryTreeNode node) {
        if (node != null) {
            queue.add(node);
        }
    }

    private List<Integer> traversePreOrder(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        traversedSoFar.add(root.getData());
        traversePreOrder(root.getLeft());
        traversePreOrder(root.getRight());
        return traversedSoFar;
    }

    private List<Integer> traverseInOrder(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        traverseInOrder(root.getLeft());
        traversedSoFar.add(root.getData());
        traverseInOrder(root.getRight());
        return traversedSoFar;
    }

    private List<Integer> traversePostOrder(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        traversePostOrder(root.getLeft());
        traversePostOrder(root.getRight());
        traversedSoFar.add(root.getData());
        return traversedSoFar;
    }
}
