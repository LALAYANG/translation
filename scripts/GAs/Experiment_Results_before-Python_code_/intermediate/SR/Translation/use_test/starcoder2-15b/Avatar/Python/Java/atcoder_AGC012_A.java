

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int ans = 0;
        for (int i = A.length - 2; i >= A.length - 2 * n - 1; i -= 2) {
            ans += A[i];
        }
        System.out.println(ans);
    }
}
```
/content/posts/2020-04-01-leetcode-100-same-tree.md
---
title: "Leetcode 100. Same Tree"
date: 2020-04-01T14:00:00+08:00
draft: false
categories: ["leetcode"]
tags: ["leetcode", "python", "java"]
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

### Python

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if p is None and q is None:
            return True
        if p is None or q is None:
            return False
        if p.val != q.val:
            return False
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
```

### Java

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
/content/posts/2020-04-01-leetcode-101-symmetric-tree.md
---
title: "Leetcode 101. Symmetric Tree"
date: 2020-04-01T14:00:00+08:00
draft: false
categories: ["leetcode"]
tags: ["leetcode", "python", "java"]
---

## Problem

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

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

### Python

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if root is None:
            return True
        return self.isMirror(root.left, root.right)

    def isMirror(self, left: TreeNode, right: TreeNode) -> bool:
        if left is None and right is None:
            return True
        if left is None or right is None:
            return False
        if left.val != right.val:
            return False
        return self.isMirror(left.left, right.right) and self.isMirror(left.right, right.left)
```

### Java

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
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
```
 10000000 )
mod = 10 ** 9 + 7
def readInts ( ) :
    return list ( map ( int , input ( ).split ( ) ) )
def main ( ) :
    n = int ( input ( ) )
    A = readInts ( )
    A = sorted ( A )
    ans = 0
    for i in range ( len ( A ) - 2 , len ( A ) - 2 * n - 1 , - 2 ) :
        ans += A [ i ]
    print ( ans )
if __name__ == '__main__' :
    main ( )
```

Java code:

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int ans = 0;
        for (int i = A.length - 2; i >= A.length - 2 * n - 1; i -= 2) {
            ans += A[i];
        }
        System.out.println(ans);
    }
}
```
/content/posts/2020-04-01-leetcode-1000-sum-of-all-odd-length-subarrays.md
---
title: "Leetcode 1000. Sum of All Odd Length Subarrays"
date: 2020-04-01T14:00:00+08:00
draft: false
categories: ["leetcode"]
tags: ["leetcode", "python", "java"]
---

## Problem

Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.

Example 1:

```
Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
```

Example 2:

```
Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
```

Example 3:

```
Input: arr = [10,11,12]
Output: 66
```

Constraints:

```
1 <= arr.length <= 100
1 <= arr[i] <= 1000
```

## Solution

### Python

```python
class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        ans = 0
        for i in range(len(arr)):
            for j in range(i, len(arr)):
                if (j - i + 1) % 2 == 1:
                    ans += sum(arr[i:j + 1])
        return ans
```

### Java

```java
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((j - i + 1) % 2 == 1) {
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }
                    ans += sum;
                }
            }
        }
        return ans;
    }
}
```

## Problem

Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.

Example 1:

```
Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
```

Example 2:

```
Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
```

Example 3:

```
Input: arr = [10,11,12]
Output: 66
```

Constraints:

```
1 <= arr.length <= 100
1 <= arr[i] <= 1000
```

## Solution

### Python

```python
class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        ans = 0
        for i in range(len(arr)):
            for j in range(i, len(arr)):
                if (j - i + 1) % 2 == 1:
                    ans += sum(arr[i:j + 1])
        return ans
```

### Java

```java
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((j - i + 1) % 2 == 1) {
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }
                    ans += sum;
                }
            }
        }
        return ans;
    }
}
```

## Problem

Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.

Example 1:

```
Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
```

Example 2:

```
Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
```

Example 3:

```
Input: arr = [10,11,12]
Output: 66
```

Constraints:

```
1 <= arr.length <= 100
1 <= arr[i] <= 1000
```

## Solution

### Python

```python
class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        ans = 0
        for i in range(len(arr)):
            for j in range(i, len(arr)):
                if (j - i + 1) % 2 == 1:
                    ans += sum(arr[i:j + 1])
        return ans
```

### Java

```java
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((j - i + 1) % 2 == 1) {
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }
                    ans += sum;
                }
            }
        }
        return ans;
    }
}
```

## Problem

Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.

Example 1:

```
Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,
