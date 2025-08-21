

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = String.format("%0" + x + "d", Integer.parseInt(a));
        b = String.format("%0" + x + "d", Integer.parseInt(b));
        String s = "";
        int c = 0;
        for (int i = 0; i < x; i++) {
            int d = Integer.parseInt(b.substring(i, i + 1)) + Integer.parseInt(a.substring(x - i - 1, x - i)) + c;
            if (d > 9) {
                s += String.valueOf(d).substring(1);
                c = 1;
            } else {
                s += String.valueOf(d);
                c = 0;
            }
        }
        if (c == 1) {
            s += "1";
        }
        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString()));
    }
}
```

## 2. 1000000007

### 2.1. Description

Given a positive integer n, calculate the sum of all the positive integers less than or equal to n.

### 2.2. Input

The first line of the input contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.

### 2.3. Output

For each test case, output a single line containing the sum of all the positive integers less than or equal to n.

### 2.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 2.5. Sample Input

```
3
1
2
3
```

### 2.6. Sample Output

```
1
3
6
```

### 2.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(n * (n + 1) / 2);
        }
    }
}
```

## 3. 1000000008

### 3.1. Description

Given a positive integer n, calculate the sum of all the positive integers less than or equal to n.

### 3.2. Input

The first line of the input contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.

### 3.3. Output

For each test case, output a single line containing the sum of all the positive integers less than or equal to n.

### 3.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 3.5. Sample Input

```
3
1
2
3
```

### 3.6. Sample Output

```
1
3
6
```

### 3.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(n * (n + 1) / 2);
        }
    }
}
```
/docs/leetcode/0001-0100/0001-0010.md
# 0001 [Two Sum](https://leetcode.com/problems/two-sum/)

## 1.

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

## 2. 解法

### 2.1. 哈希表

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
```

# 0002 [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

## 1.

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

## 2. 解法

### 2.1. 迭代

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
```

### 2.2. 递归

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;
        int sum = carry + x + y;
        ListNode node = new ListNode(sum % 10);
        node.next = addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next, sum / 10);
        return node;
    }
}
```

# 0003 [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## 1.

Given a string, find the length of the longest substring without repeating characters.

Example 1:

```
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

Example 2:

```
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

Example 3:

```
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

## 2. 解法

### 2.1. 滑动窗口

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
```

# 0004 [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

## 1.

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

```
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
```

Example 2:

```
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
```

## 2. 解法

### 2.1. 二分查找

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int iMin = 0, iMax = m;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = (m + n + 1) / 2 - i;
            if (j != 0 && i != m && nums2[j - 1] > nums1[i]) {
                iMin = i + 1;
            } else if (i != 0 && j != n && nums1[i - 1] > nums2[j]) {
                iMax = i - 1;
            } else {
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }
                int minRight = 0;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
```

# 0005 [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

## 1.

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

```
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
```

Example 2:

```
Input: "cbbd"
Output: "bb"
```

## 2. 解法

### 2.1. 动态规划

```java
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; l++) {
            for (int i = 0; i + l < n; i++) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && l + 1 > ans.length()) {
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }
}
```

### 2.2. 中心扩展

```java
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
```

# 0006 [ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/)

## 1.

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P   A   H   N
A P L S I I G
Y   I   R
```

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

```
string convert(string s, int numRows);
```

Example 1:

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```

Example 2:

```
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
```

## 2. 解法

### 2.1. 按
