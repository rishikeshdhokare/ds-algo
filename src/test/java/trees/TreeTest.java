package trees;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static trees.TreeTestHelper.createBinaryTree;

public class TreeTest {

    final Tree binaryTree = createBinaryTree();

    @Test
    public void shouldTraverseTreeInOrder() {
        assertArrayEquals(new int[]{4, 2, 5, 1, 6, 3, 7}, binaryTree.traverseInOrder().stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void shouldTraverseTreePreOrder() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 3, 6, 7}, binaryTree.traversePreOrder().stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void shouldTraverseTreePostOrder() {
        assertArrayEquals(new int[]{4, 5, 2, 6, 7, 3, 1}, binaryTree.traversePostOrder().stream().mapToInt(i -> i).toArray());
    }
}