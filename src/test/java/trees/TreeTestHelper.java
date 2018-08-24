package trees;

import java.util.ArrayList;
import java.util.List;

class TreeTestHelper {
    /*
    Generates tree with following shape
                      1
                   2     3
                 4   5 6   7
     */
    static BinaryTree createBinaryTree() {
        final List<BinaryTreeNode> nodes = createTreeNodes();
        nodes.get(0).setLeft(nodes.get(1));
        nodes.get(0).setRight(nodes.get(2));
        nodes.get(1).setLeft(nodes.get(3));
        nodes.get(1).setRight(nodes.get(4));
        nodes.get(2).setLeft(nodes.get(5));
        nodes.get(2).setRight(nodes.get(6));
        return new BinaryTree(nodes.get(0));
    }

    private static List<BinaryTreeNode> createTreeNodes() {
        List<BinaryTreeNode> nodes = new ArrayList<>();
        nodes.add(new BinaryTreeNode(1));
        nodes.add(new BinaryTreeNode(2));
        nodes.add(new BinaryTreeNode(3));
        nodes.add(new BinaryTreeNode(4));
        nodes.add(new BinaryTreeNode(5));
        nodes.add(new BinaryTreeNode(6));
        nodes.add(new BinaryTreeNode(7));
        return nodes;
    }
}