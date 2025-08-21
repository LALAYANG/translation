

```
import java.util.*;
import java.io.*;

public class Main {
    static class BIT {
        int size;
        int[] tree;
        int depth;

        BIT(int N) {
            size = N;
            tree = new int[N + 1];
            depth = Integer.numberOfTrailingZeros(N);
        }

        int bitsum(int l, int r) {
            return bitsum(r) - bitsum(l);
        }

        int bitsum(int index) {
            int ret = 0;
            while (index > 0) {
                ret += tree[index];
                index ^= index & -index;
            }
            return ret;
        }

        void bitadd(int index, int x) {
            index = index + 1;
            while (index <= size) {
                tree[index] += x;
                index += index & -index;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> d = new HashMap<>();
        List<Integer> _a = new ArrayList<>();
        for (int x : a) {
            if (!_a.contains(x)) {
                _a.add(x);
            }
        }
        Collections.sort(_a);
        for (int i = 0; i < _a.size(); i++) {
            d.put(_a.get(i), i);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int[] t = new int[] { _a.size(), 0 };
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            int[] b = new int[n + 1];
            for (int i = 0; i < n; i++) {
                b[i + 1] = b[i] + (a[i] >= mid ? 2 : -1);
            }
            int c = Integer.MAX_VALUE;
            for (int x : b) {
                c = Math.min(c, x);
            }
            for (int i = 0; i < n + 1; i++) {
                b[i] -= c;
            }
            BIT bit = new BIT(Collections.max(Arrays.asList(b)) + 2);
            int ans = 0;
            for (int x : b) {
                ans += bit.bitsum(x + 1);
                bit.bitadd(x, 1);
            }
            if (ans >= m) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(_a.get(t[1]));
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

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针指向当前子串的起始位置，另一个指针指向当前子串的结束位置，然后不断向后移动结束位置，如果遇到重复的字符，则将起始位置移动到重复字符的下一个位置，然后计算当前子串的长度，并更新最大长度。

### 2.3. 代码

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        d = dict()
        start = 0
        end = 0
        max_len = 0
        while end < len(s):
            if s[end] in d:
                start = max(start, d[s[end]] + 1)
            d[s[end]] = end
            max_len = max(max_len, end - start + 1)
            end += 1
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

使用一个字典记录每个字符出现的位置，然后遍历字符串，如果字符出现的位置等于当前位置，则返回当前位置。

### 3.3. 代码

```
class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = dict()
        for i, c in enumerate(s):
            if c not in d:
                d[c] = i
            else:
                d[c] = -1
        for i, c in enumerate(s):
            if d[c] == i:
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

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针指向当前子串的起始位置，另一个指针指向当前子串的结束位置，然后不断向后移动结束位置，如果遇到重复的字符，则将起始位置移动到重复字符的下一个位置，然后计算当前子串的长度，并更新最大长度。

### 4.3. 代码

```
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        d = dict()
        start = 0
        end = 0
        max_len = 0
        while end < len(s):
            if s[end] in d:
                d[s[end]] = end
            else:
                if len(d) == k:
                    min_pos = min(d.values())
                    del d[s[min_pos]]
                    start = min_pos + 1
                d[s[end]] = end
            max_len = max(max_len, end - start + 1)
            end += 1
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

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针指向当前子串的起始位置，另一个指针指向当前子串的结束位置，然后不断向后移动结束位置，如果遇到重复的字符，则将起始位置移动到重复字符的下一个位置，然后计算当前子串的长度，并更新最大长度。

### 5.3. 代码

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        d = dict()
        start = 0
        end = 0
        max_len = 0
        while end < len(s):
            if s[end] in d:
                start = max(start, d[s[end]] + 1)
            d[s[end]] = end
            max_len = max(max_len, end - start + 1)
            end += 1
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

使用一个字典记录每个字符出现的位置，然后遍历字符串，如果字符出现的位置等于当前位置，则返回当前位置。

### 6.3. 代码

```
class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = dict()
        for i, c in enumerate(s):
            if c not in d:
                d[c] = i
            else:
                d[c] = -1
        for i, c in enumerate(s):
            if d[c] == i:
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

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针指向当前子串的起始位置，另一个指针指向当前子串的结束位置，然后不断向后移动结束位置，如果遇到重复的字符，则将起始位置移动到重复字符的下一个位置，然后计算当前子串的长度，并更新最大长度。

### 7.3. 代码

```
class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        d = dict()
        start = 0
        end = 0
        max_len = 0
        while end < len(s):
            if s[end] in d:
                d[s[end]] = end
            else:
                if len(d) == k:
                    min_pos = min(d.values())
                    del d[s[min_pos]]
                    start = min_pos + 1
                d[s[end]] = end
            max_len = max(max_len, end - start + 1)
            end += 1
        return max_len
```

## 8. 2019-09-16

### 8.1. 题目

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

### 8.2. 思路

使用一个字典记录每个字符出现的位置，然后使用两个指针，一个指针指向当前子串的起始位置，另一个指针指向当前子串的结束位置，然后不断向后移动结束位置，如果遇到重复的字符，则将起始位置移动到重复字符的下一个位置，然后计算当前子串的长度，并更新最大长度。


