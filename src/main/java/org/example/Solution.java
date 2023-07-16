package org.example;

import java.util.*;

public class Solution {
    /**
     * Performs a zigzag level order traversal of a binary tree.
     *
     * @param root the root of the binary tree
     * @return a list of lists containing the node values in zigzag level order
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        boolean isLeftToRight = true;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            Deque<Integer> levelValues = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (isLeftToRight) {
                    levelValues.offerLast(node.val);
                } else {
                    levelValues.offerFirst(node.val);
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(new ArrayList<>(levelValues));
            isLeftToRight = !isLeftToRight;
        }

        return result;
    }
}