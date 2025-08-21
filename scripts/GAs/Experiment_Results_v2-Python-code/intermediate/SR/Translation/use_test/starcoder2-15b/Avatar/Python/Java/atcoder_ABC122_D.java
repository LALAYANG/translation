

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) 1e9 + 7;
        int[][] memoization_table = new int[n + 1][];
        for (int i = 0; i < n + 1; i++) {
            memoization_table[i] = new int[1 << 12];
        }
        System.out.println(dfs(0, "TTT", n, mod, memoization_table));
    }

    public static int dfs(int cur, String last3, int n, int mod, int[][] memoization_table) {
        if (memoization_table[cur][last3.hashCode()] != 0) {
            return memoization_table[cur][last3.hashCode()];
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (is_valid_sequence(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, n, mod, memoization_table)) % mod;
            }
        }
        memoization_table[cur][last3.hashCode()] = ret;
        return ret;
    }

    public static boolean is_valid_sequence(String last4) {
        for (int i = 0; i < 4; i++) {
            String t = last4;
            if (i >= 1) {
                t = t.substring(0, i - 1) + t.charAt(i) + t.charAt(i - 1) + t.substring(i + 1);
            }
            if (t.contains("AGC")) {
                return false;
            }
        }
        return true;
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

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个set来存储，每次移动right，如果right对应的字符在set中，则将left对应的字符从set中删除，并将left右移，直到right对应的字符不在set中，将right对应的字符加入set中，并更新最大长度。

### 2.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }
        return maxLen;
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

### 3.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个set来存储，每次移动right，如果right对应的字符在set中，则将left对应的字符从set中删除，并将left右移，直到right对应的字符不在set中，将right对应的字符加入set中，并更新最大长度。

### 3.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }
        return maxLen;
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

### 4.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个set来存储，每次移动right，如果right对应的字符在set中，则将left对应的字符从set中删除，并将left右移，直到right对应的字符不在set中，将right对应的字符加入set中，并更新最大长度。

### 4.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }
        return maxLen;
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

### 5.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个set来存储，每次移动right，如果right对应的字符在set中，则将left对应的字符从set中删除，并将left右移，直到right对应的字符不在set中，将right对应的字符加入set中，并更新最大长度。

### 5.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }
        return maxLen;
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

### 6.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个set来存储，每次移动right，如果right对应的字符在set中，则将left对应的字符从set中删除，并将left右移，直到right对应的字符不在set中，将right对应的字符加入set中，并更新最大长度。

### 6.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }
        return maxLen;
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

### 7.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个set来存储，每次移动right，如果right对应的字符在set中，则将left对应的字符从set中删除，并将left右移，直到right对应的字符不在set中，将right对应的字符加入set中，并更新最大长度。

### 7.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }
        return maxLen;
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

### 8.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个set来存储，每次移动right，如果right对应的字符在set中，则将left对应的字符从set中删除，并将left右移，直到right对应的字符不在set中，将right对应的字符加入set中，并更新最大长度。

### 8.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }
        return maxLen;
    }
}
```

## 9. 2019-09-17

### 9.1. 题目

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

### 9.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界
