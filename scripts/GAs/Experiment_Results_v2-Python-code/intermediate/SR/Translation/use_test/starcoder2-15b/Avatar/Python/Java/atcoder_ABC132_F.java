

```java

```
/src/main/java/com/leetcode/algorithm/medium/Q102BinaryTreeLevelOrderTraversal.java
package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class Q102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queu  }
            result.add(level);
        }
        return result;
    }
}
e.offer(node.left);
                }
                if (node.right != null) queue.offer(node.right);
          /src/main/java/com/leetcode/algorithm/medium/Q103BinaryTreeZigzagLevelOrderTraversal.java
package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its zigzag level order traversal as:
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 */
public class Q103BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (reverse) {
                    level.add(0, node.val);
                } else {
                    level.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            reverse = !reverse;
            result.add(level);
        }
        return result;
    }
}
/src/main/java/com/leetcode/algorithm/medium/Q104MaximumDepthOfBinaryTree.java
package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 */
t.right);
        }
        return max;
    }
}
public class Q104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        int left = maxDepth2(root.left);
        int right = maxDepth2(root.right);
        max = Math.max(left, right) + 1;
        return max;
    }

    public int maxDepth3(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = Math.max(maxDepth3(root.left), max);
        }
        if (root.right != null) {
            max = Math.max(maxDepth3(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth4(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth4(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth4(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth5(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth5(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth5(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth6(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth6(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth6(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth7(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth7(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth7(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth8(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth8(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth8(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth9(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth9(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth9(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth10(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth10(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth10(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth11(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth11(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth11(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth12(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth12(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth12(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth13(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth13(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth13(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth14(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth14(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth14(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth15(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth15(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth15(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth16(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth16(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth16(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth17(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth17(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth17(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth18(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth18(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth18(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth19(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth19(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth19(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth20(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth20(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth20(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth21(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth21(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth21(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth22(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth22(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth22(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth23(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth23(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth23(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth24(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth24(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth24(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth25(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth25(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth25(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth26(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth26(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth26(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth27(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth27(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth27(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth28(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.left != null) {
            max = maxDepth28(root.left);
        }
        if (root.right != null) {
            max = Math.max(maxDepth28(root.right), max);
        }
        return max + 1;
    }

    public int maxDepth29(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
       
