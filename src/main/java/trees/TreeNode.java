package trees;

public class TreeNode {

    private TreeNode left;
    private int data;
    private TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode getLeft() {
        return left;
    }

    void setLeft(TreeNode left) {
        this.left = left;
    }

    int getData() {
        return data;
    }

    TreeNode getRight() {
        return right;
    }

    void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "[data=" + data + "]";
    }
}
