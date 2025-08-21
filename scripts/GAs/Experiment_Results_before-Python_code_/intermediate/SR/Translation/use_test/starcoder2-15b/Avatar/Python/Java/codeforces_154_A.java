

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = 0, b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == x.charAt(0)) {
                    a++;
                } else if (s.charAt(j) == x.charAt(1)) {
                    b++;
                } else {
                    ans += Math.min(a, b);
                    a = 0;
                    b = 0;
                }
            }
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 2.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.4. Sample

#### 2.4.1. Input

```
10
```

#### 2.4.2. Output

```
23
```

### 2.5. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long a = n / 3;
        long b = n / 5;
        long c = n / 15;
        ans = 3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2;
        System.out.println(ans);
    }
}

```

## 3. 1000000007

### 3.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 3.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.4. Sample

#### 3.4.1. Input

```
10
```

#### 3.4.2. Output

```
23
```

### 3.5. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long a = n / 3;
        long b = n / 5;
        long c = n / 15;
        ans = 3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2;
        System.out.println(ans);
    }
}

```
/docs/leetcode/0001-0100/0001-0010.md
# 0001-0010

## 1. Two Sum

### 1.1. Description

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

### 1.2. Example

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

### 1.3. Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
```

## 2. Add Two Numbers

### 2.1. Description

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

### 2.2. Example

```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

### 2.3. Solution

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
        ListNode ans = new ListNode(0);
        ListNode p = ans;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            p.next = new ListNode(carry);
        }
        return ans.next;
    }
}
```

## 3. Longest Substring Without Repeating Characters

### 3.1. Description

Given a string, find the length of the longest substring without repeating characters.

### 3.2. Example

```
Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

### 3.3. Solution

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] map = new int[128];
        for (int i = 0, j = 0; i < s.length(); i++) {
            j = Math.max(j, map[s.charAt(i)]);
            ans = Math.max(ans, i - j + 1);
            map[s.charAt(i)] = i + 1;
        }
        return ans;
    }
}
```

## 4. Median of Two Sorted Arrays

### 4.1. Description

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

### 4.2. Example

```
nums1 = [1, 3]
nums2 = [2]

The median is 2.0

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
```

### 4.3. Solution

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

## 5. Longest Palindromic Substring

### 5.1. Description

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

### 5.2. Example

```
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Input: "cbbd"
Output: "bb"
```

### 5.3. Solution

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

## 6. ZigZag Conversion

### 6.1. Description

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

### 6.2. Example

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
```

### 6.3. Solution

```java
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            sb[i].append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder s1 : sb) {
            ans.append(s1);
        }
        return ans.toString();
    }
}
```

## 7. Reverse Integer

### 7.1. Description

Given a 32-bit signed integer, reverse digits of an integer.

### 7.2. Example

```
Input: 123
Output: 321

Input: -123
Output: -321

Input: 120
Output: 21
```

### 7.3. Solution

```java
class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            ans = ans * 10 + pop;
        }
        return ans;
    }
}
```

## 8. String to Integer (atoi)

### 8.1. Description

Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:

Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.

### 8.2. Example

```
Input: "42"
Output: 42

Input: "   -42"
Output: -42
Explanation: The first non-whitespace character
