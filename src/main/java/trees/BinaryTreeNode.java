package trees;

public class BinaryTreeNode {

    private BinaryTreeNode left;
    private int data;
    private BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }

    BinaryTreeNode getLeft() {
        return left;
    }

    void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    int getData() {
        return data;
    }

    BinaryTreeNode getRight() {
        return right;
    }

    void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "[data=" + data + "]";
    }
}
