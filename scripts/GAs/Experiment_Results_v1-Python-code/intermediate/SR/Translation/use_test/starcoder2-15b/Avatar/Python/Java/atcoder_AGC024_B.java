

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] permutation = new int[N];
        for (int i = 0; i < N; i++) {
            permutation[i] = sc.nextInt();
        }
        editorial(N, permutation);
    }

    public static void editorial(int N, int[] permutation) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] initialValue = new int[1];
        int multiplier = 1;
        int result = calculateResult(multiplier, initialValue, N);
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[permutation[i]] = i;
        }
        int currentLength = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                currentLength++;
                maxLen = Math.max(maxLen, currentLength);
            } else {
                currentLength = 1;
            }
        }
        int ans = N - maxLen;
        System.out.println(ans);
    }

    public static int calculateResult(int multiplier, int[] initialValue, int N) {
        return initialValue[0] * (N + multiplier);
    }
}
```
/content/posts/2020-04-01-leetcode-100-same-tree.md
---
title: "Leetcode 100. Same Tree"
date: 2020-04-01T15:00:00+08:00
draft: false
categories: ["Leetcode"]
---

## Problem

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

Example 2:

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

Example 3:

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```

## Solution

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
```

## Complexity Analysis

- Time complexity: O(n)
- Space complexity: O(n)

## References

- [100. Same Tree](https://leetcode.com/problems/same-tree/)

## Tags

- [Tree](https://leetcode.com/tag/tree/)
- [Depth-first Search](https://leetcode.com/tag/depth-first-search/)

## Similar Problems

- [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)
- [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/)
- [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
- [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)
- [Path Sum](https://leetcode.com/problems/path-sum/)
- [Path Sum II](https://leetcode.com/problems/path-sum-ii/)
- [Path Sum III](https://leetcode.com/problems/path-sum-iii/)
- [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
- [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
- [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
- [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)
- [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/)
- [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)
- [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
- [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)
- [Add and Search Word - Data structure design](https://leetcode.com/problems/add-and-search-word-data-structure-design/)
- [Word Search II](https://leetcode.com/problems/word-search-ii/)
- [Find Largest Value in Each Tree Row](https://leetcode.com/problems/find-largest-value-in-each-tree-row/)
- [Second Minimum Node In a Binary Tree](https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/)
- [N-ary Tree Level Order Traversal](https://leetcode.com/problems/n-ary-tree-level-order-traversal/)
- [N-ary Tree Preorder Traversal](https://leetcode.com/problems/n-ary-tree-preorder-traversal/)
- [N-ary Tree Postorder Traversal](https://leetcode.com/problems/n-ary-tree-postorder-traversal/)
- [Longest Univalue Path](https://leetcode.com/problems/longest-univalue-path/)
- [Average of Levels in Binary Tree](https://leetcode.com/problems/average-of-levels-in-binary-tree/)
- [Smallest Subtree with all the Deepest Nodes](https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/)
- [All Nodes Distance K in Binary Tree](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/)
- [Find a Corresponding Node of a Binary Tree in a Clone of That Tree](https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/)
- [Cousins in Binary Tree](https://leetcode.com/problems/cousins-in-binary-tree/)
- [Increasing Order Search Tree](https://leetcode.com/problems/increasing-order-search-tree/)
- [Binary Tree Tilt](https://leetcode.com/problems/binary-tree-tilt/)
- [Binary Search Tree Iterator](https://leetcode.com/problems/binary-search-tree-iterator/)
- [Binary Tree Pruning](https://leetcode.com/problems/binary-tree-pruning/)
- [Construct Binary Search Tree from Preorder Traversal](https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/)
- [Find Elements in a Contaminated Binary Tree](https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/)
- [All Elements in Two Binary Search Trees](https://leetcode.com/problems/all-elements-in-two-binary-search-trees/)
- [All Elements in- [Binary Tree Cameras](https://leetcode.com/problems/binary-tree-cameras/)
- [Binary Tree Maximum Path Sum II](https://leetcode.com/problems/binary-tree-maximum-path-sum-ii/)
- [Binary Tree Vertical Order Traversal](https://leetcode.com/problems/binary-tree-vertical-order-traversal/)
- [Binary Tree Zigzag Level Order Traversal II](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal-ii/)
- [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
- [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
- [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)
- [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
- [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
- [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)
- [Binary Tree Upside Down](https://leetcode.com/problems/binary-tree-upside-down/)
- [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)
- [Binary Tree Longest Consecutive Sequence](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/)
- [Binary Tree Longest Consecutive Sequence II](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence-ii/)
- [Binary Tree Longest Consecutive Sequence III](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence-iii/)
- [Binary Tree Diameter](https://leetcode.com/problems/binary-tree-diameter/)
- [Binary Tree Coloring Game](https://leetcode.com/problems/binary-tree-coloring-game/)
- [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/)
- [Binary Tree Tilt](https://leetcode.com/problems/binary-tree-tilt/)
- [Binary Tree Vertical Order Traversal](https://leetcode.com/problems/binary-tree-vertical-order-traversal/)
- [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
- [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
- [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
- [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)
- [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
- [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
- [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)
- [Binary Tree Upside Down](https://leetcode.com/problems/binary-tree-upside-down/)
- [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)
- [Binary Tree Longest Consecutive Sequence](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/)
- [Binary Tree Longest Consecutive Sequence II](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence-ii/)
- [Binary Tree Longest Consecutive Sequence III](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence-iii/)
- [Binary Tree Diameter](https://leetcode.com/problems/binary-tree-diameter/)
- [Binary Tree Coloring Game](https://leetcode.com/problems/binary-tree-coloring-game/)
- [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/)
- [Binary Tree Tilt](https://leetcode.com/problems/binary-tree-tilt/)
- [Binary Tree Vertical Order Traversal](https://leetcode.com/problems/binary-tree-vertical-order-traversal/)
- [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
- [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
- [Binary Tree
