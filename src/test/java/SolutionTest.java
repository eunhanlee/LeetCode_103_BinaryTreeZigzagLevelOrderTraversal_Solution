import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.example.Solution;
import org.example.TreeNode;
import org.junit.jupiter.api.Test;
import java.util.*;


public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        // Test case 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(20, 9),
                Arrays.asList(15, 7)
        );
        List<List<Integer>> actual1 = solution.zigzagLevelOrder(root1);
        assertArrayEquals(expected1.toArray(), actual1.toArray());

        // Test case 2
        TreeNode root2 = null;
        List<List<Integer>> expected2 = new ArrayList<>();
        List<List<Integer>> actual2 = solution.zigzagLevelOrder(root2);
        assertArrayEquals(expected2.toArray(), actual2.toArray());

        // Test case 3
        TreeNode root3 = new TreeNode(1);
        List<List<Integer>> expected3 = Arrays.asList(
                Arrays.asList(1)
        );
        List<List<Integer>> actual3 = solution.zigzagLevelOrder(root3);
        assertArrayEquals(expected3.toArray(), actual3.toArray());

        // Test case 4
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        List<List<Integer>> expected4 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(3, 2)
        );
        List<List<Integer>> actual4 = solution.zigzagLevelOrder(root4);
        assertArrayEquals(expected4.toArray(), actual4.toArray());

        // Test case 5
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.left.left = new TreeNode(4);
        root5.right = new TreeNode(3);
        List<List<Integer>> expected5 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(3, 2),
                Arrays.asList(4)
        );
        List<List<Integer>> actual5 = solution.zigzagLevelOrder(root5);
        assertArrayEquals(expected5.toArray(), actual5.toArray());

        // Test case 6
        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(2);
        root6.right = new TreeNode(3);
        root6.left.left = new TreeNode(4);
        root6.right.right = new TreeNode(5);
        List<List<Integer>> expected6 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(3, 2),
                Arrays.asList(4, 5)
        );
        List<List<Integer>> actual6 = solution.zigzagLevelOrder(root6);
        assertArrayEquals(expected6.toArray(), actual6.toArray());

        // Test case 7
        TreeNode root7 = new TreeNode(1);
        root7.left = new TreeNode(2);
        root7.left.left = new TreeNode(4);
        root7.left.right = new TreeNode(5);
        root7.right = new TreeNode(3);
        root7.right.left = new TreeNode(6);
        root7.right.right = new TreeNode(7);
        List<List<Integer>> expected7 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(3, 2),
                Arrays.asList(4, 5, 6, 7)
        );
        List<List<Integer>> actual7 = solution.zigzagLevelOrder(root7);
        assertArrayEquals(expected7.toArray(), actual7.toArray());

        // Test case 8
        TreeNode root8 = new TreeNode(1);
        root8.left = new TreeNode(2);
        root8.right = new TreeNode(3);
        root8.left.left = new TreeNode(4);
        root8.left.right = new TreeNode(5);
        root8.right.left = new TreeNode(6);
        root8.right.right = new TreeNode(7);
        root8.left.left.left = new TreeNode(8);
        List<List<Integer>> expected8 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(3, 2),
                Arrays.asList(4, 5, 6, 7),
                Arrays.asList(8)
        );
        List<List<Integer>> actual8 = solution.zigzagLevelOrder(root8);
        assertArrayEquals(expected8.toArray(), actual8.toArray());

        // Test case 9
        TreeNode root9 = new TreeNode(1);
        root9.left = new TreeNode(2);
        root9.right = new TreeNode(3);
        root9.left.left = new TreeNode(4);
        root9.left.right = new TreeNode(5);
        root9.right.left = new TreeNode(6);
        root9.right.right = new TreeNode(7);
        root9.left.left.left = new TreeNode(8);
        root9.left.left.right = new TreeNode(9);
        root9.right.right.left = new TreeNode(10);
        List<List<Integer>> expected9 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(3, 2),
                Arrays.asList(4, 5, 6, 7),
                Arrays.asList(10, 9, 8)
        );
        List<List<Integer>> actual9 = solution.zigzagLevelOrder(root9);
        assertArrayEquals(expected9.toArray(), actual9.toArray());

        // Test case 10
        TreeNode root10 = new TreeNode(1);
        root10.left = new TreeNode(2);
        root10.left.left = new TreeNode(3);
        root10.left.left.left = new TreeNode(4);
        root10.left.left.left.left = new TreeNode(5);
        List<List<Integer>> expected10 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList(4),
                Arrays.asList(5)
        );
        List<List<Integer>> actual10 = solution.zigzagLevelOrder(root10);
        assertArrayEquals(expected10.toArray(), actual10.toArray());

        System.out.println("All test cases passed.");
    }
}
