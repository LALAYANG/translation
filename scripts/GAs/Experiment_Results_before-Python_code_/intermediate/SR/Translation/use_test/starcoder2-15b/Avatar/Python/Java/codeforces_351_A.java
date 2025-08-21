

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        int o = 2 * n - arr.length;
        double arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arr_sum));
            }
        }
        System.out.printf("%.3f", res);
    }
}
```
/src/main/java/com/leetcode/problems/medium/Q102BinaryTreeLevelOrderTraversal.java
package com.leetcode.problems.medium;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
t.add(root.val);
        }
        if (root.left != null) {
            helper(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper(root.right, level + 1, res);
        }
    }
}

/**
 * @author 
 * @date 2020-03-09 10:20
 */
public class Q102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper(root, 0, res);
        return res;
    }

    private void helper(TreeNode root, int level, List<List<Integer>> res) {
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        if (root != null) {
            res.get(level).add(root.val);
        }
        if (root.left != null) {
            helper(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper2(root, 0, res);
        return res;
    }

    private void helper2(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        if (root.left != null) {
            helper2(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper2(root.right, level + 1, res);
        }
        res.get(level).add(root.val);
    }

    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper3(root, 0, res);
        return res;
    }

    private void helper3(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper3(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper3(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder4(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper4(root, 0, res);
        return res;
    }

    private void helper4(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper4(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper4(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder5(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper5(root, 0, res);
        return res;
    }

    private void helper5(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper5(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper5(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder6(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper6(root, 0, res);
        return res;
    }

    private void helper6(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper6(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper6(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder7(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper7(root, 0, res);
        return res;
    }

    private void helper7(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper7(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper7(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder8(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper8(root, 0, res);
        return res;
    }

    private void helper8(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper8(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper8(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder9(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper9(root, 0, res);
        return res;
    }

    private void helper9(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper9(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper9(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder10(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper10(root, 0, res);
        return res;
    }

    private void helper10(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper10(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper10(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder11(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper11(root, 0, res);
        return res;
    }

    private void helper11(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper11(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper11(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder12(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper12(root, 0, res);
        return res;
    }

    private void helper12(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper12(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper12(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder13(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper13(root, 0, res);
        return res;
    }

    private void helper13(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper13(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper13(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder14(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper14(root, 0, res);
        return res;
    }

    private void helper14(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper14(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper14(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder15(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper15(root, 0, res);
        return res;
    }

    private void helper15(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper15(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper15(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder16(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper16(root, 0, res);
        return res;
    }

    private void helper16(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper16(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper16(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder17(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper17(root, 0, res);
        return res;
    }

    private void helper17(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper17(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper17(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder18(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper18(root, 0, res);
        return res;
    }

    private void helper18(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            helper18(root.left, level + 1, res);
        }
        if (root.right != null) {
            helper18(root.right, level + 1, res);
        }
    }

    public List<List<Integer>> levelOrder19(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper19(root, 0, res);
        return res;
    }

    private void helper19(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if (root.left != null
