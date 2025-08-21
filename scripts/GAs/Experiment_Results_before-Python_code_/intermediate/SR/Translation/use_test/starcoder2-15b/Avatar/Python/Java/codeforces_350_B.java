

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n+1];
        int[] a = new int[n+1];
        int[] cnt = new int[n+1];
        for(int i=1;i<=n;i++){
            t[i] = sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            cnt[a[i]]++;
        }
        int[] ans = new int[n+1];
        int cnt_ans = 0;
        for(int i=1;i<=n;i++){
            if(t[i]==1){
                int[] crt = new int[n+1];
                int crt_cnt = 0;
                int x = a[i];
                while(cnt[x]==1){
                    crt[crt_cnt++] = x;
                    x = a[x];
                }
                if(crt_cnt>cnt_ans){
                    cnt_ans = crt_cnt;
                    for(int j=0;j<crt_cnt;j++){
                        ans[j] = crt[j];
                    }
                }
            }
        }
        System.out.println(cnt_ans);
        for(int i=cnt_ans-1;i>=0;i--){
            System.out.print(ans[i]+" ");
        }
    }
}
```

## 2. 1000000007

### 2.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.2. Input

The first line contains a positive integer n (1≤n≤10^9).

### 2.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.4. Sample test(s)

#### 2.4.1. Sample input

```
10
```

#### 2.4.2. Sample output

```
23
```

### 2.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(i%3==0||i%5==0){
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}
```

## 3. 1000000008

### 3.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.2. Input

The first line contains a positive integer n (1≤n≤10^9).

### 3.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.4. Sample test(s)

#### 3.4.1. Sample input

```
10
```

#### 3.4.2. Sample output

```
23
```

### 3.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(i%3==0||i%5==0){
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}
```
/docs/leetcode/in_order/101.md
# 101. 对称二叉树 (Easy)

## 题目描述

给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```

但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

```
    1
   / \
  2   2
   \   \
   3    3
```

说明:

如果你可以运用递归和迭代两种方法解决这个问题，会很加分。

## 递归

### 思路

递归判断左右子树是否对称。

### 代码

```java
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        if(left.val!=right.val) return false;
        return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }
}
```

## 迭代

### 思路

使用队列，将左右子树的节点依次入队，然后出队比较。

### 代码

```java
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if(left==null&&right==null) continue;
            if(left==null||right==null) return false;
            if(left.val!=right.val) return false;
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }
}
```
/docs/leetcode/in_order/104.md
# 104. 二叉树的最大深度 (Easy)

## 题目描述

给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

说明: 叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，

```
    3
   / \
  9  20
    /  \
   15   7
```

返回它的最大深度 3 。

## 递归

### 思路

递归求左右子树的最大深度，然后加一。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
```

## 迭代

### 思路

使用队列，将根节点入队，然后出队，将左右子树入队，直到队列为空。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }
        return depth;
    }
}
```

## 递归2

### 思路

递归求左右子树的最大深度，然后加一。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
```

## 迭代2

### 思路

使用队列，将根节点入队，然后出队，将左右子树入队，直到队列为空。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }
        return depth;
    }
}
```

## 递归3

### 思路

递归求左右子树的最大深度，然后加一。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
```

## 迭代3

### 思路

使用队列，将根节点入队，然后出队，将左右子树入队，直到队列为空。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }
        return depth;
    }
}
```

## 递归4

### 思路

递归求左右子树的最大深度，然后加一。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
```

## 迭代4

### 思路

使用队列，将根节点入队，然后出队，将左右子树入队，直到队列为空。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }
        return depth;
    }
}
```

## 递归5

### 思路

递归求左右子树的最大深度，然后加一。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
```

## 迭代5

### 思路

使用队列，将根节点入队，然后出队，将左右子树入队，直到队列为空。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }
        return depth;
    }
}
```

## 递归6

### 思路

递归求左右子树的最大深度，然后加一。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
```

## 迭代6

### 思路

使用队列，将根节点入队，然后出队，将左右子树入队，直到队列为空。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }
        return depth;
    }
}
```

## 递归7

### 思路

递归求左右子树的最大深度，然后加一。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
```

## 迭代7

### 思路

使用队列，将根节点入队，然后出队，将左右子树入队，直到队列为空。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }
        return depth;
    }
}
```

## 递归8

### 思路

递归求左右子树的最大深度，然后加一。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
```

## 迭代8

### 思路

使用队列，将根节点入队，然后出队，将左右子树入队，直到队列为空。

### 代码

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.
