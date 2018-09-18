package trees;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static trees.TreeTestHelper.createBinaryTree;

public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @Before
    public void setUp() {
        binaryTree = createBinaryTree();
    }

    @Test
    public void shouldTraverseTreePreOrder() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 3, 6, 7}, binaryTree.traversePreOrder().stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void shouldTraverseTreeInOrder() {
        assertArrayEquals(new int[]{4, 2, 5, 1, 6, 3, 7}, binaryTree.traverseInOrder().stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void shouldTraverseTreePostOrder() {
        assertArrayEquals(new int[]{4, 5, 2, 6, 7, 3, 1}, binaryTree.traversePostOrder().stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void shouldTraverseTreeLevelOrder() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, binaryTree.traverseLevelOrder().stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void shouldTraverseTreeInZigZagOrder() {
        assertArrayEquals(new int[]{1, 3, 2, 4, 5, 6, 7}, binaryTree.traverseZigZagOrder().stream().mapToInt(i -> i).toArray());
    }
}