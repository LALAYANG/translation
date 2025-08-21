

```
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.*;

class GFG {
    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {
            return this.first - o.first;
        }
    }

    static class CalculateDifference implements Callable<Integer> {
        int variable_3_34;
        int variable_1_34;

        public CalculateDifference(int variable_3_34, int variable_1_34) {
            this.variable_3_34 = variable_3_34;
            this.variable_1_34 = variable_1_34;
        }

        @Override
        public Integer call() throws Exception {
            Thread.sleep(180);
            return variable_1_34 - variable_3_34;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num_nodes = sc.nextInt();
        int M = sc.nextInt();
        List<Set<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < num_nodes; i++) {
            edges.add(new HashSet<>());
        }
        int[] degrees = new int[num_nodes];
        int[] parity = new int[num_nodes];
        boolean[] flag = new boolean[num_nodes];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int node_b = sc.nextInt() - 1;
            edges.get(a).add(node_b);
            edges.get(node_b).add(a);
            degrees[a]++;
            degrees[node_b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        List<Pair> Q = new ArrayList<>();
        for (int i = 0; i < num_nodes; i++) {
            Q.add(new Pair(degrees[i], i));
        }
        Collections.sort(Q);
        while (Q.size() > 0) {
            Pair pair = Q.get(0);
            Q.remove(0);
            int u = pair.second;
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            int i = 0;
            for (int neighbor_node : edges.get(u)) {
                edges.get(neighbor_node).remove(u);
                if (parity[u] != 0 && i == 0) {
                    System.out.println(u + 1 + " " + neighbor_node + 1);
                    int variable_3_34 = parity[u];
                    int variable_1_34 = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(new CalculateDifference(variable_3_34, variable_1_34));
                    int result = future.get();
                    parity[u] = result;
                } else {
                    System.out.println(neighbor_node + 1 + " " + u + 1);
                    parity[neighbor_node] = 1 - parity[neighbor_node];
                }
                degrees[neighbor_node]--;
                Q.add(new Pair(degrees[neighbor_node], neighbor_node));
                Collections.sort(Q);
                i++;
            }
        }
    }
}
```
/docs/leetcode/0001-0100/0001-0010.md
## 1. Two Sum [$\star$](https://leetcode.com/problems/two-sum) :thumbsdown:

![](https://img.shields.io/badge/-Hash%20Table-7BA23F.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(n)$

```python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lookup = {}

        for i, num in enumerate(nums):
            if target - num in lookup:
                return [lookup[target - num], i]

            lookup[num] = i
```

## 2. Add Two Numbers [$\star\star$](https://leetcode.com/problems/add-two-numbers) :thumbsup:

![](https://img.shields.io/badge/-Linked%20List-90B44B.svg?style=flat-square) ![](https://img.shields.io/badge/-Math-434343.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(1)$

```python
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = ListNode(0)
        curr = dummy
        carry = 0

        while l1 or l2 or carry:
            if l1:
                carry += l1.val
                l1 = l1.next
            if l2:
                carry += l2.val
                l2 = l2.next
            curr.next = ListNode(carry % 10)
            curr = curr.next
            carry //= 10

        return dummy.next
```

## 3. Longest Substring Without Repeating Characters [$\star\star$](https://leetcode.com/problems/longest-substring-without-repeating-characters) :thumbsup:

![](https://img.shields.io/badge/-Hash%20Table-7BA23F.svg?style=flat-square) ![](https://img.shields.io/badge/-Sliding%20Window-1E88A8.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(1)$

```python
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        lookup = {}
        ans = 0
        i = 0

        for j, c in enumerate(s):
            if c in lookup:
                i = max(i, lookup[c] + 1)
            ans = max(ans, j - i + 1)
            lookup[c] = j

        return ans
```

## 4. Median of Two Sorted Arrays [$\star\star\star$](https://leetcode.com/problems/median-of-two-sorted-arrays) :thumbsup:

![](https://img.shields.io/badge/-Binary%20Search-1B813E.svg?style=flat-square)

- [x] Time: $O(\log\min(m, n))$
- [x] Space: $O(1)$

```python
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m = len(nums1)
        n = len(nums2)

        if m > n:
            nums1, nums2, m, n = nums2, nums1, n, m

        imin = 0
        imax = m
        half = (m + n + 1) // 2

        while imin <= imax:
            i = (imin + imax) // 2
            j = half - i
            if i < m and nums2[j - 1] > nums1[i]:
                imin = i + 1
            elif i > 0 and nums1[i - 1] > nums2[j]:
                imax = i - 1
            else:
                if i == 0:
                    max_of_left = nums2[j - 1]
                elif j == 0:
                    max_of_left = nums1[i - 1]
                else:
                    max_of_left = max(nums1[i - 1], nums2[j - 1])

                if (m + n) % 2 == 1:
                    return max_of_left

                if i == m:
                    min_of_right = nums2[j]
                elif j == n:
                    min_of_right = nums1[i]
                else:
                    min_of_right = min(nums1[i], nums2[j])

                return (max_of_left + min_of_right) / 2
```

## 5. Longest Palindromic Substring [$\star\star$](https://leetcode.com/problems/longest-palindromic-substring) :thumbsup:

![](https://img.shields.io/badge/-Dynamic%20Programming-113285.svg?style=flat-square) ![](https://img.shields.io/badge/-String-60373E.svg?style=flat-square)

- [x] Time: $O(n^2)$
- [x] Space: $O(n^2)$

```python
class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        dp = [[False] * n for _ in range(n)]
        ans = ''

        for i in range(n - 1, -1, -1):
            for j in range(i, n):
                dp[i][j] = s[i] == s[j] and (j - i < 3 or dp[i + 1][j - 1])
                if dp[i][j] and j - i + 1 > len(ans):
                    ans = s[i:j + 1]

        return ans
```

## 6. ZigZag Conversion [$\star\star$](https://leetcode.com/problems/zigzag-conversion) :thumbsdown:

![](https://img.shields.io/badge/-String-60373E.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(n)$

```python
class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s

        ans = [''] * numRows

        for i, c in enumerate(s):
            row = i % (2 * numRows - 2)
            if row >= numRows:
                row = 2 * numRows - 2 - row
            ans[row] += c

        return ''.join(ans)
```

## 7. Reverse Integer [$\star$](https://leetcode.com/problems/reverse-integer) :thumbsdown:

![](https://img.shields.io/badge/-Math-434343.svg?style=flat-square)

- [x] Time: $O(\log n)$
- [x] Space: $O(1)$

```python
class Solution:
    def reverse(self, x: int) -> int:
        ans = 0

        while x:
            ans = ans * 10 + x % 10
            x //= 10

        return ans if ans <= 2**31 - 1 and ans >= -2**31 else 0
```

## 8. String to Integer (atoi) [$\star\star$](https://leetcode.com/problems/string-to-integer-atoi) :thumbsdown:

![](https://img.shields.io/badge/-Math-434343.svg?style=flat-square) ![](https://img.shields.io/badge/-String-60373E.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(1)$

```python
class Solution:
    def myAtoi(self, s: str) -> int:
        ans = 0
        sign = 1
        i = 0

        while i < len(s) and s[i] == ' ':
            i += 1

        if i < len(s) and s[i] == '+':
            i += 1
        elif i < len(s) and s[i] == '-':
            sign = -1
            i += 1

        while i < len(s) and s[i].isdigit():
            ans = ans * 10 + int(s[i])
            i += 1

        ans *= sign
        return min(max(ans, -2**31), 2**31 - 1)
```

## 9. Palindrome Number [$\star$](https://leetcode.com/problems/palindrome-number) :thumbsdown:

![](https://img.shields.io/badge/-Math-434343.svg?style=flat-square)

- [x] Time: $O(\log n)$
- [x] Space: $O(1)$

```python
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        ans = 0

        while x > ans:
            ans = ans * 10 + x % 10
            x //= 10

        return x == ans or x == ans // 10
```

## 10. Regular Expression Matching [$\star\star\star$](https://leetcode.com/problems/regular-expression-matching) :thumbsup:

![](https://img.shields.io/badge/-Dynamic%20Programming-113285.svg?style=flat-square) ![](https://img.shields.io/badge/-Recursion-0F2540.svg?style=flat-square) ![](https://img.shields.io/badge/-String-60373E.svg?style=flat-square)

- [x] Time: $O(mn)$, where `m = len(s)` and `n = len(p)`
- [x] Space: $O(mn)$

```python
class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        m = len(s)
        n = len(p)
        dp = [[False] * (n + 1) for _ in range(m + 1)]
        dp[0][0] = True

        for i in range(m + 1):
            for j in range(1, n + 1):
                if p[j - 1] == '*':
                    dp[i][j] = dp[i][j -
