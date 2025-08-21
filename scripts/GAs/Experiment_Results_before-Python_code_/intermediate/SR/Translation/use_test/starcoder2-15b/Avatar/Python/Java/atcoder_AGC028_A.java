

```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        List<Integer> list_S = new ArrayList<Integer>();
        List<Integer> list_T = new ArrayList<Integer>();
        List<Integer> Number_i = new ArrayList<Integer>();
        List<Integer> Number_iMN = new ArrayList<Integer>();
        List<Integer> Number_j = new ArrayList<Integer>();
        List<Integer> Kaburi_j = new ArrayList<Integer>();
        List<Integer> Kaburi_i = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list_S.add(S.charAt(i));
            Number_i.add(i);
        }
        for (int j = 0; j < M; j++) {
            list_T.add(T.charAt(j));
            Number_j.add(j);
        }
        for (int i = 0; i < N; i++) {
            Number_iMN.add((int) (i * M / N));
        }
        Set<Integer> set_Number_iMN = new HashSet<Integer>(Number_iMN);
        Set<Integer> set_Number_j = new HashSet<Integer>(Number_j);
        Kaburi_j.addAll(set_Number_iMN);
        Kaburi_j.retainAll(set_Number_j);
        for (int j : Kaburi_j) {
            Kaburi_i.add((int) (j * N / M));
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (list_S.get(Kaburi_i.get(counter)) == list_T.get(Kaburi_j.get(counter))) {
                pass;
            } else {
                Flag = 1;
                break;
            }
            counter += 1;
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println((int) (N * M / gcd(N, M)));
        }
    }
    public static int gcd(int a, int b) {
        while (b > 0) {
            a = b;
            b = a % b;
        }
        return a;
    }
}

```

## 2. 2019年10月13日

### 2.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

### 2.2. 解答

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        max_length = 0
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j])) == j-i:
                    if j-i > max_length:
                        max_length = j-i
        return max_length
```

## 3. 2019年10月14日

### 3.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

### 3.2. 解答

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        max_length = 0
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j])) == j-i:
                    if j-i > max_length:
                        max_length = j-i
        return max_length
```

## 4. 2019年10月15日

### 4.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

### 4.2. 解答

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        max_length = 0
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j])) == j-i:
                    if j-i > max_length:
                        max_length = j-i
        return max_length
```

## 5. 2019年10月16日

### 5.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

### 5.2. 解答

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        max_length = 0
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j])) == j-i:
                    if j-i > max_length:
                        max_length = j-i
        return max_length
```

## 6. 2019年10月17日

### 6.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

### 6.2. 解答

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        max_length = 0
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j])) == j-i:
                    if j-i > max_length:
                        max_length = j-i
        return max_length
```

## 7. 2019年10月18日

### 7.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

### 7.2. 解答

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        max_length = 0
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j])) == j-i:
                    if j-i > max_length:
                        max_length = j-i
        return max_length
```

## 8. 2019年10月19日

### 8.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

### 8.2. 解答

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        max_length = 0
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j])) == j-i:
                    if j-i > max_length:
                        max_length = j-i
        return max_length
```

## 9. 2019年10月20日

### 9.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

### 9.2. 解答

```
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        max_length = 0
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j
