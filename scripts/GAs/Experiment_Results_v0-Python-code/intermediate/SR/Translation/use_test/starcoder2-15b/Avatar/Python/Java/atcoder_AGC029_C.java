

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        dp[0] = A[0];
        int dp_len = 1;
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp[0]) {
                dp[0] = A[i];
            } else if (A[i] > dp[dp_len - 1]) {
                dp[dp_len] = A[i];
                dp_len++;
            } else {
                int l = 0, r = dp_len - 1;
                while (r - l > 1) {
                    int m = (l + r) / 2;
                    if (dp[m] >= A[i]) {
                        r = m;
                    } else {
                        l = m;
                    }
                }
                dp[r] = A[i];
            }
        }
        System.out.println(dp_len);
    }
}
```

## 2. 2019-09-10

### 2.1. 题目

Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

### 2.2. 思路

使用一个字典记录每个字符上一次出现的位置，然后使用两个指针，一个指针从左往右遍历，另一个指针记录当前无重复子串的起始位置。

### 2.3. 代码

```python
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        d = {}
        max_len = 0
        start = 0
        for i, c in enumerate(s):
            if c in d and d[c] >= start:
                start = d[c] + 1
            d[c] = i
            max_len = max(max_len, i - start + 1)
        return max_len
```

## 3. 2019-09-11

### 3.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 3.2. 思路

使用一个字典记录每个字符出现的次数，然后遍历字符串，找到第一个出现次数为1的字符。

### 3.3. 代码

```python
class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = {}
        for c in s:
            d[c] = d.get(c, 0) + 1
        for i, c in enumerate(s):
            if d[c] == 1:
                return i
        return -1
```

## 4. 2019-09-12

### 4.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 4.2. 思路

使用一个字典记录每个字符出现的次数，然后使用两个指针，一个指针从左往右遍历，另一个指针记录当前无重复子串的起始位置。

### 4.3. 代码

```python
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        if not s:
            return 0
        d = {}
        max_len = 0
        start = 0
        for i, c in enumerate(s):
            d[c] = d.get(c, 0) + 1
            while len(d) > k:
                d[s[start]] -= 1
                if d[s[start]] == 0:
                    del d[s[start]]
                start += 1
            max_len = max(max_len, i - start + 1)
        return max_len
```

## 5. 2019-09-13

### 5.1. 题目

Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

### 5.2. 思路

使用一个字典记录每个字符上一次出现的位置，然后使用两个指针，一个指针从左往右遍历，另一个指针记录当前无重复子串的起始位置。

### 5.3. 代码

```python
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        d = {}
        max_len = 0
        start = 0
        for i, c in enumerate(s):
            if c in d and d[c] >= start:
                start = d[c] + 1
            d[c] = i
            max_len = max(max_len, i - start + 1)
        return max_len
```

## 6. 2019-09-14

### 6.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 6.2. 思路

使用一个字典记录每个字符出现的次数，然后遍历字符串，找到第一个出现次数为1的字符。

### 6.3. 代码

```python
class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = {}
        for c in s:
            d[c] = d.get(c, 0) + 1
        for i, c in enumerate(s):
            if d[c] == 1:
                return i
        return -1
```

## 7. 2019-09-15

### 7.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 7.2. 思路

使用一个字典记录每个字符出现的次数，然后使用两个指针，一个指针从左往右遍历，另一个指针记录当前无重复子串的起始位置。

### 7.3. 代码

```python
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        if not s:
            return 0
        d = {}
        max_len = 0
        start = 0
        for i, c in enumerate(s):
            d[c] = d.get(c, 0) + 1
            while len(d) > k:
                d[s[start]] -= 1
                if d[s[start]] == 0:
                    del d[s[start]]
                start += 1
            max_len = max(max_len, i - start + 1)
        return max_len
```

## 8. 2019-09-16

### 8.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 8.2. 思路

使用一个字典记录每个字符出现的次数，然后使用两个指针，一个指针从左往右遍历，另一个指针记录当前无重复子串的起始位置。

### 8.3. 代码

```python
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        if not s:
            return 0
        d = {}
        max_len = 0
        start = 0
        for i, c in enumerate(s):
            d[c] = d.get(c, 0) + 1
            while len(d) > k:
                d[s[start]] -= 1
                if d[s[start]] == 0:
                    del d[s[start]]
                start += 1
            max_len = max(max_len, i - start + 1)
        return max_len
```

## 9. 2019-09-17

### 9.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 9.2. 思路

使用一个字典记录每个字符出现的次数，然后使用两个指针，一个指针从左往右遍历，另一个指针记录当前无重复子串的起始位置。

### 9.3. 代码

```python
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        if not s:
            return 0
        d = {}
        max_len = 0
        start = 0
        for i, c in enumerate(s):
            d[c] = d.get(c, 0) + 1
            while len(d) > k:
                d[s[start]] -= 1
                if d[s[start]] == 0:
                    del d[s[start]]
                start += 1
            max_len = max(max_len, i - start + 1)
        return max_len
```

## 10. 2019-09-18

### 10.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 10.2. 思路

使用一个字典记录每个字符出现的次数，然后使用两个指针，一个指针从左往右遍历，另一个指针记录当前无重复子串的起始位置。

### 10.3. 代码

```python
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        if not s:
            return 0
        d = {}
        max_len = 0
        start = 0
        for i, c in enumerate(s):
            d[c] = d.get(c, 0) + 1
            while len(d) > k:
                d[s[start]] -= 1
                if d[s[start]] == 0:
                    del d[s[start]]
                start += 1
            max_len = max(max_len, i - start + 1)
        return max_len
```

## 11. 2019-09-19

### 11.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 11.2. 思路

使用一个字典记录每个字符出现的次数，然后使用两个指针，一个指针从左往右遍历，另一个指针记录当前无重复子串的起始位置。

### 11.3. 代码

```python
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        if not s:
            return 0
        d = {}
        max_len = 0
        start = 0
        for i, c in enumerate(s):
            d[c] = d.get(c, 0) + 1
            while len(d) > k:
                d[s[start]] -= 1
                if d[s[start]] == 0:
                    del d[s
