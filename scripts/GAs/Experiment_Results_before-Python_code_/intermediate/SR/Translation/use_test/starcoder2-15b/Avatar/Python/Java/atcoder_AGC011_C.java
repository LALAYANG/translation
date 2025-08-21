

```
import java.util.*;
public class Main {
    static int n, m, ci, cb, cc;
    static int[] vis;
    static ArrayList<Integer>[] g;
    static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        boolean flag = true;
        stk.push(new int[]{x, 1});
        while (!stk.isEmpty()) {
            int[] p = stk.pop();
            int u = p[0], col = p[1];
            if (vis[u] != 0) {
                flag &= (vis[u] == col);
                continue;
            }
            vis[u] = col;
            for (int i : g[u]) {
                stk.push(new int[]{i, 3 - col});
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        vis = new int[n + 1];
        g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else {
                    if (dfs(i)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}
```
/source/_posts/2018-03-10-leetcode-100-same-tree.md
---
title: LeetCode 100. Same Tree
date: 2018-03-10 10:00:00
tags: [LeetCode, Tree, DFS]
---

# 100. Same Tree

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
/source/_posts/2018-03-10-leetcode-101-symmetric-tree.md
---
title: LeetCode 101. Symmetric Tree
date: 2018-03-10 10:00:00
tags: [LeetCode, Tree, DFS]
---

# 101. Symmetric Tree

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For eeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }
    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
}
```
xample, this binary tree [1,2,2,3,4,4,3] is symmetric:

```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```

But the following [1,2,2,null,3,null,3] is not:

```
    1
   / \
  2   2
   \   \
   3    3
```

Note:
Bonus points if you could solve it both recursively and iteratively.

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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }
    private boolean isSymmetric(TreeNode p, TreeNode q) {
        return check(p, q) && check(q, p);
    }
}
```

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     Tre  }
        return ans;
    }
}
```
/source/_posts/2018-03-10-leetcode-102-binary-tree-level-order-traversal.md
---
title: LeetCode 102. Binary Tree Level Order Traversal
date: 2018-03-10 10:00:00
tags: [LeetCode, Tree, BFS]
---

# 102. Binary Tree Level Order Traversal

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],

```
    3
   / \
  9  20
    /  \
   15   7
```

return its level order traversal as:

```
[
  [3],
  [9,20],
  [15,7]
]
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            ans.add(level);
      /source/_posts/2018-03-10-leetcode-103-binary-tree-zigzag-level-order-traversal.md
---
title: LeetCode 103. Binary Tree Zigzag Level Order Traversal
date: 2018-03-10 10:00:00
tags: [LeetCode, Tree, BFS]
---

# 103. Binary Tree Zigzag Level Order Traversal

Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],

```
    3
   / \
  9  20
    /  \
   15   7
```

return its zigzag level order traversal as:

```
[
  [3],
  [20,9],
  [15,7]
]
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean reverse = false;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (reverse) {
                    level.add(0, node.val);
                } else {
                    level.add(node.val);
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            ans.add(level);
            reverse = !reverse;
        }
        return ans;
    }
}
```
 1000000007;
    }
}
```
/source/_posts/2018-03-10-leetcode-104-maximum-depth-of-binary-tree.md
---
title: LeetCode 104. Maximum Depth of Binary Tree
date: 2018-03-10 10:00:00
tags: [LeetCode, Tree, DFS]
---

# 104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

```
    3
   / \
  9  20
    /  \
   15   7
```

return its depth = 3.

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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
```

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
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }
    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        return Math.max(dfs(node.left, depth + 1), dfs(node.right, depth + 1));
    }
}
```

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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        Stack<TreeNode> stk = new Stack<>();
        Stack<Integer> depth = new Stack<>();
        stk.push(root);
        depth.push(1);
        while (!stk.isEmpty()) {
            TreeNode node = stk.pop();
            int d = depth.pop();
            ans = Math.max(ans, d);
            if (node.left != null) {
                stk.push(node.left);
                depth.push(d + 1);
            }
            if (node.right != null) {
                stk.push(node.right);
                depth.push(d + 1);
            }
        }
        return ans;
    }
}
```

```java
/**
