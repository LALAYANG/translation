

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String v = sc.next();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] a = new String[2 * m + v.length()];
        for (int i = 0; i < m; i++) {
            a[i] = d[f ? 0 : 1];
        }
        for (int i = 0; i < v.length(); i++) {
            a[m + i] = "PRINT " + v.charAt(i);
            if (i < v.length() - 1) {
                a[m + i + 1] = d[f ? 1 : 0];
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/medium/Q102BinaryTreeLevelOrderTraversal.java
package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import javat.add(root.val);
        }
        if (root.left != null) {
            queue.add(root.left);
        }
        if (root.right != null) {
            queue.add(root.right);
        }
        if (queue.isEmpty()) {
            return result;
        }
        return levelOrder(queue, result);
    }
}
.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 
 * @date 2020/10/12 10:42
 */
public class Q102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return levelOrder(queue, result);
    }

    private List<List<Integer>> levelOrder(Queue<TreeNode> queue, List<List<Integer>> result) {
        List<Integer> list = new ArrayList<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        result.add(list);
        if (queue.isEmpty()) {
            return result;
        }
        return levelOrder(queue, result);
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return levelOrder2(queue, result);
    }

    private List<List<Integer>> levelOrder2(Queue<TreeNode> queue, List<List<Integer>> result) {
        List<Integer> list = new ArrayList<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        result.add(list);
        if (queue.isEmpty()) {
            return result;
        }
        return levelOrder2(queue, result);
    }

    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return levelOrder3(queue, result);
    }

    private List<List<Integer>> levelOrder3(Queue<TreeNode> queue, List<List<Integer>> result) {
        List<Integer> list = new ArrayList<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        result.add(list);
        if (queue.isEmpty()) {
            return result;
        }
        return levelOrder3(queue, result);
    }

    public List<List<Integer>> levelOrder4(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return levelOrder4(queue, result);
    }

    private List<List<Integer>> levelOrder4(Queue<TreeNode> queue, List<List<Integer>> result) {
        List<Integer> list = new ArrayList<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            lis/src/main/java/com/leetcode/algorithm/medium/Q104MaximumDepthOfBinaryTree.java
package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.TreeNode;

/**
 * @author 
 * @date 2020/10/12 10:42
 */
public class Q104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
/src/main/java/com/leetcode/algorithm/medium/Q101SymmetricTree.java
package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.TreeNode;

/**
 * @author 
 * @date 2020/10/12 10:42
 */
public class Q101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
/src/main/java/com/leetcode/algorithm/medium/Q103BinaryTreeZigzagLevelOrderTraversal.java
package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 
 * @date 2020/10/12 10:42
 */
public class Q103BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return zigzagLevelOrder(queue, result, true);
    }

    private List<List<Integer>> zigzagLevelOrder(Queue<TreeNode> queue, List<List<Integer>> result, boolean isLeft) {
        List<Integer> list = new ArrayList<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        if (isLeft) {
            result.add(list);
        } else {
            List<Integer> reverse = new ArrayList<>();
            for (int i = list.size() - 1; i >= 0; i--) {
                reverse.add(list.get(i));
            }
            result.add(reverse);
        }
        if (queue.isEmpty()) {
            return result;
        }
        return zigzagLevelOrder(queue, result, !isLeft);
    }
}
/src/main/java/com/leetcode/algorithm/medium/Q105ConstructBinaryTreeFromPreorderAndInorderTraversal.java
package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 
 * @date 2020/10/12 10:42
 */
public class Q105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
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
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);
        int leftSize = index - inStart;
        root.left = buildTree(preorder, preStart + 1, preStart + leftSize, inorder, inStart, index - 1, map);
        root.right = buildTree(preorder, preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd, map);
        return root;
    }

    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree2(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode buildTree2(int[] preorder, int preStart, int preEnd, int[] int, preStart + leftSize, inorder, inStart, index - 1, map);
        root.right = buildTree2(preorder, preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd, map);
        return root;
    }
}
order, int inStart, int inEnd, Map<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);
        int leftSize = index - inStart;
        root.left = buildTree2(preorder, preStart + 1, preStart + leftSize, inorder, inStart, index - 1, map);
        root.right = buildTree2(preorder, preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd, map);
        return root;
    }

    public TreeNode buildTree3(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree3(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode buildTree3(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);
        int leftSize = index - inStart;
        root.left = buildTree3(preorder, preStart + 1, preStart + leftSize, inorder, inStart, index - 1, map);
        root.right = buildTree3(preorder, preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd, map);
        return root;
    }

    public TreeNode buildTree4(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree4(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode buildTree4(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);
        int leftSize = index - inStart;
        root.left = buildTree4(preorder, preStar/src/main/java/com/leetcode/algorithm/medium/Q106ConstructBinaryTreeFromInorderAndPostorderTraversal.java
package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 
 * @date 2020/10/12 10:42
 */
public class Q106ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
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
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);
        int leftSize = index - inStart;
        root.left = buildTree(inorder, inStart, index - 1, postorder, postStart, postStart + leftSize - 1, map);
        root.right = buildTree(inorder, index + 1, inEnd, postorder, postStart + leftSize, postEnd - 1, map);
        return root;
    }

    public TreeNode buildTree2(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree2(inorder, 0, inorder.length - 1, postorder,
