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
    static Tree createBinaryTree() {
        final List<TreeNode> nodes = createTreeNodes();
        nodes.get(0).setLeft(nodes.get(1));
        nodes.get(0).setRight(nodes.get(2));
        nodes.get(1).setLeft(nodes.get(3));
        nodes.get(1).setRight(nodes.get(4));
        nodes.get(2).setLeft(nodes.get(5));
        nodes.get(2).setRight(nodes.get(6));
        return new Tree(nodes.get(0));
    }

    private static List<TreeNode> createTreeNodes() {
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(new TreeNode(1));
        nodes.add(new TreeNode(2));
        nodes.add(new TreeNode(3));
        nodes.add(new TreeNode(4));
        nodes.add(new TreeNode(5));
        nodes.add(new TreeNode(6));
        nodes.add(new TreeNode(7));
        return nodes;
    }
}