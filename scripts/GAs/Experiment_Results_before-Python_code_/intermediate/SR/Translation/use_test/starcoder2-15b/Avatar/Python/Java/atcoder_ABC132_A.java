

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (c.containsKey(ch)) {
                c.put(ch, c.get(ch) + 1);
            } else {
                c.put(ch, 1);
            }
        }
        Set<Character> sa = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            sa.add(S.charAt(i));
        }
        if (sa.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        for (char i : sa) {
            if (c.get(i) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
```
/src/main/java/com/leetcode/problems/medium/Q102BinaryTreeLevelOrderTraversal.java
package com.leetcode.problems.medium;

import com.leetcode.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. Binary Tree Level Order Traversal
 *
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
 *
 * @author 
 * @date 2020-03-01
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
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
/src/main/java/com/leetcode/problems/medium/Q103BinaryTreeZigzagLevelOrderTraversal.java
package com.leetcode.problems.medium;

import com.leetcode.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 103. Binary Tree Zigzag Level Order Traversal
 *
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
 *
 * @author 
 * @date 2020-03-01
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
            result.add(level);
            reverse = !reverse;
        }
        return result;
    }
}
/src/main/java/com/leetcode/problems/medium/Q104MaximumDepthOfBinaryTree.java
package com.leetcode.problems.medium;

import com.leetcode.problems.common.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 *
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
axDepth(root.right));
    }
}
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 *
 * @author 
 * @date 2020-03-01
 */
public class Q104MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + (left > right ? left : right);
        // return 1 + Math.max(m/src/main/java/com/leetcode/problems/medium/Q105ConstructBinaryTreeFromPreorderAndInorderTraversal.java
package com.leetcode.problems.medium;

import com.leetcode.problems.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 *
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 * For example, given
 *
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 * Return the following binary tree:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * @author 
 * @date 2020-03-01
 */
public class Q105ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = map.get(preorder[preStart]);
        root.left = buildTree(preorder, preStart + 1, preStart + index - inStart, inorder, inStart, index - 1, map);
        root.right = buildTree(preorder, preStart + index - inStart + 1, preEnd, inorder, index + 1, inEnd, map);
        return root;
    }
}
/src/main/java/com/leetcode/problems/medium/Q106ConstructBinaryTreeFromInorderAndPostorderTraversal.java
package com.leetcode.problems.medium;

import com.leetcode.problems.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 *
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 * For example, given
 *
 * inorder = [9,3,15,20,7]
 * postorder = [9,15,7,20,3]
 * Return the following binary tree:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * @author 
 * @date 2020-03-01
 */
public class Q106ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd, Map<Integer, Integer> map) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = map.get(postorder[postEnd]);
        root.left = buildTree(inorder, inStart, index - 1, postorder, postStart, postStart + index - inStart - 1, map);
        root.right = buildTree(inorder, index + 1, inEnd, postorder, postStart + index - inStart, postEnd - 1, map);
        return root;
    }
}
/src/main/java/com/leetcode/problems/medium/Q107BinaryTreeLevelOrderTraversalII.java
package com.leetcode.problems.medium;

import com.leetcode.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 107. Binary Tree Level Order Traversal II
 *
 * Given a
 *
 * @author 
 * @date 2020-03-01
 */
public class Q107BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(0, level);
        }
        return result;
    }
}
 binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * @see Q102BinaryTreeLevelOrderTraversal
 * @author 
 *
 * @author 
 * @date 2020-03-01
 */
public class Q108ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
}
/src/main/java/com/leetcode/problems/medium/Q108ConvertSortedArrayToBinarySearchTree.java
package com.leetcode.problems.medium;

import com.leetcode.problems.common.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *  }
        return result;
    }
}
/src/main/java/com/leetcode/problems/medium/Q109ConvertSortedListToBinarySearchTree.java
package com.leetcode.problems.medium;

import com.leetcode.problems.common.ListNode;
import com.leetcode.problems.common.TreeNode;

/**
 * 109. Convert Sorted List to Binary Search Tree
 *
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted linked list: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 * @author 
 * @date 2020-03-01
 */
public class Q109ConvertSortedListToBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
