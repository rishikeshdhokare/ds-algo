package trees;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private TreeNode root;
    private List<Integer> traversedSoFar = new ArrayList<>();

    Tree(TreeNode root) {
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

    private List<Integer> traversePreOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        traversedSoFar.add(root.getData());
        traversePreOrder(root.getLeft());
        traversePreOrder(root.getRight());
        return traversedSoFar;
    }

    private List<Integer> traverseInOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        traverseInOrder(root.getLeft());
        traversedSoFar.add(root.getData());
        traverseInOrder(root.getRight());
        return traversedSoFar;
    }

    private List<Integer> traversePostOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        traversePostOrder(root.getLeft());
        traversePostOrder(root.getRight());
        traversedSoFar.add(root.getData());
        return traversedSoFar;
    }
}
