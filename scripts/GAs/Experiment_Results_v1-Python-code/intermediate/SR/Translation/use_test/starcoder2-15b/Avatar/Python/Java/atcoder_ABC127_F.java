

```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] ans = new int[2];
        PriorityQueue<Integer> heap_one = new PriorityQueue<Integer>();
        PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
        int sum_b = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;
        int condition_a = 511;
        int condition_b = 162;
        int outer_loop_limit = 751;
        int inner_loop_limit = 750;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < q; i++) {
                int[] ql = new int[3];
                for (int j = 0; j < 3; j++) {
                    ql[j] = sc.nextInt();
                }
                if ((condition_a & condition_b) != 0) {
                    if (ql[0] == 2) {
                        if (heap_one.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sum_p1 - heap_one.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                        } else {
                            System.out.println(heap_one.peek() + " " + (sum_p1 - heap_one.size() * heap_one.peek() + p2.size() * heap_one.peek() - sum_p2 + sum_b));
                        }
                    } else {
                        sum_b += ql[2];
                        if (heap_one.size() == 0) {
                            heap_one.add(ql[1]);
                            sum_p1 += ql[1];
                        } else if (heap_one.peek() <= ql[1]) {
                            heap_one.add(ql[1]);
                            sum_p1 += ql[1];
                        } else {
                            p2.add(-ql[1]);
                            sum_p2 += ql[1];
                        }
                        if (heap_one.size() < p2.size()) {
                            int k = p2.poll();
                            heap_one.add(-k);
                            sum_p2 = sum_p2 + k;
                            sum_p1 -= k;
                        }
                        if (heap_one.size() - 1 > p2.size()) {
                            int k = heap_one.poll();
                            p2.add(-k);
                            sum_p1 -= k;
                            sum_p2 += k;
                        }
                    }
                }
            }
        }
    }
}
```

## 2. 2019-09-18

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

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针记录当前子串的起始位置，另一个指针记录当前子串的结束位置，如果当前子串中没有重复的字符，则结束位置后移一位，否则起始位置后移一位，并更新字典中当前字符的位置。

### 2.3. 代码

```python
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        d = {}
        start = 0
        end = 0
        max_len = 0
        for i in range(len(s)):
            if s[i] in d:
                start = max(start, d[s[i]] + 1)
            d[s[i]] = i
            end = i
            max_len = max(max_len, end - start + 1)
        return max_len
```

## 3. 2019-09-19

### 3.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 3.2. 思路

使用一个字典记录每个字符出现的位置，然后遍历字符串，如果当前字符出现的次数为1，则返回当前字符的位置。

### 3.3. 代码

```python
class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = {}
        for i in range(len(s)):
            if s[i] in d:
                d[s[i]] += 1
            else:
                d[s[i]] = 1
        for i in range(len(s)):
            if d[s[i]] == 1:
                return i
        return -1
```

## 4. 2019-09-20

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

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针记录当前子串的起始位置，另一个指针记录当前子串的结束位置，如果当前子串中没有重复的字符，则结束位置后移一位，否则起始位置后移一位，并更新字典中当前字符的位置。

### 4.3. 代码

```python
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        if not s:
            return 0
        d = {}
        start = 0
        end = 0
        max_len = 0
        for i in range(len(s)):
            if s[i] in d:
                d[s[i]] += 1
            else:
                d[s[i]] = 1
            end = i
            if len(d) > k:
                while len(d) > k:
                    d[s[start]] -= 1
                    if d[s[start]] == 0:
                        del d[s[start]]
                    start += 1
            max_len = max(max_len, end - start + 1)
        return max_len
```

## 5. 2019-09-21

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

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针记录当前子串的起始位置，另一个指针记录当前子串的结束位置，如果当前子串中没有重复的字符，则结束位置后移一位，否则起始位置后移一位，并更新字典中当前字符的位置。

### 5.3. 代码

```python
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        d = {}
        start = 0
        end = 0
        max_len = 0
        for i in range(len(s)):
            if s[i] in d:
                start = max(start, d[s[i]] + 1)
            d[s[i]] = i
            end = i
            max_len = max(max_len, end - start + 1)
        return max_len
```

## 6. 2019-09-22

### 6.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 6.2. 思路

使用一个字典记录每个字符出现的位置，然后遍历字符串，如果当前字符出现的次数为1，则返回当前字符的位置。

### 6.3. 代码

```python
class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = {}
        for i in range(len(s)):
            if s[i] in d:
                d[s[i]] += 1
            else:
                d[s[i]] = 1
        for i in range(len(s)):
            if d[s[i]] == 1:
                return i
        return -1
```

## 7. 2019-09-23

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

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针记录当前子串的起始位置，另一个指针记录当前子串的结束位置，如果当前子串中没有重复的字符，则结束位置后移一位，否则起始位置后移一位，并更新字典中当前字符的位置。

### 7.3. 代码

```python
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        if not s:
            return 0
        d = {}
        start = 0
        end = 0
        max_len = 0
        for i in range(len(s)):
            if s[i] in d:
                d[s[i]] += 1
            else:
                d[s[i]] = 1
            end = i
            if len(d) > k:
                while len(d) > k:
                    d[s[start]] -= 1
                    if d[s[start]] == 0:
                        del d[s[start]]
                    start += 1
            max_len = max(max_len, end - start + 1)
        return max_len
```

## 8. 2019-09-24

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

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针记录当前子串的起始位置，另一个指针记录当前子串的结束位置，如果当前子串中没有重复的字符，则结束位置后移一位，否则起始位置后移一位，并更新字典中当前字符的位置。

### 8.3. 代码

```python
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        if not s:
            return 0
        d = {}
        start = 0
        end = 0
        max_len = 0
        for i in range(len(s)):
            if s[i] in d:
                d[s[i]] += 1
            else:
                d[s[i]] = 1
            end = i
            if len(d) > k:
                while len(d) > k:
                    d[s[start]] -= 1
                    if d[s[start]] == 0:
                        del d[s[start]]
                    start += 1
            max_len = max(max_len, end - start + 1)
        return max_len
```

## 9. 2019-09-25

### 9.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 9.2. 思路

使用一个字典记录每个字符出现的位置，然后遍历字符串，如果当前字符出现的次数为1，则返回当前字符的位置。
