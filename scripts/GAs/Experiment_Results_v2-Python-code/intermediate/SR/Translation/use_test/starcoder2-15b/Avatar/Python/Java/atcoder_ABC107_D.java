

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class BIT {
    int size;
    int[] tree;
    int depth;

    BIT(int N) {
        size = N;
        tree = new int[N + 1];
        depth = Integer.numberOfLeadingZeros(N);
    }

    int bitsum(int l, int r) {
        int ret = 0;
        if (r == null) {
            r = l;
        }
        while (l <= r) {
            ret += tree[l];
            l += l & -l;
        }
        return ret;
    }

    void bitadd(int i, int x) {
        i = i + 1;
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> d = new HashMap<>();
        int[] _a = Arrays.stream(a).boxed().distinct().sorted().toArray();
        for (int i = 0; i < _a.length; i++) {
            d.put(_a[i], i);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }

        int[] t = new int[] { _a.length, 0 };
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            boolean[] b = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                b[i + 1] = a[i] >= mid;
            }
            for (int i = 0; i < n; i++) {
                b[i + 1] = b[i + 1] || b[i];
            }
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (b[i]) {
                    c++;
                }
            }
            for (int i = 0; i < n; i++) {
                b[i + 1] = b[i + 1] ? 1 : -1;
            }
            BIT bit = new BIT(Arrays.stream(b).max().getAsInt() + 2);
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += bit.bitsum(b[i + 1] + 1);
                bit.bitadd(b[i + 1], 1);
            }
            if (ans >= m) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(_a[t[1]]);
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

### 2.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                start = last[c] + 1;
            }
            last[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
```

## 3. 2019-09-11

### 3.1. 题目

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

### 3.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                start = last[c] + 1;
            }
            last[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
```

## 4. 2019-09-12

### 4.1. 题目

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

### 4.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                start = last[c] + 1;
            }
            last[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
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

### 5.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                start = last[c] + 1;
            }
            last[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
```

## 6. 2019-09-14

### 6.1. 题目

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

### 6.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                start = last[c] + 1;
            }
            last[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
```

## 7. 2019-09-15

### 7.1. 题目

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

### 7.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                start = last[c] + 1;
            }
            last[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
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

### 8.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c
