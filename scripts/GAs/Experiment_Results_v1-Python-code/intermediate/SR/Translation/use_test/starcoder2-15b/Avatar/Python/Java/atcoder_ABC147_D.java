

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = sc.nextInt();
        }
        int result = 0;
        for (int b = 0; b < 60; b++) {
            int bs = 0;
            for (int i = 0; i < N; i++) {
                if ((inputArray[i] & (1 << b)) != 0) {
                    bs++;
                }
            }
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

## 2. 2019-01-01

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
        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }
            lastIndex[c] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```

## 3. 2019-01-02

### 3.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 3.2. 解答

```java
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
```

## 4. 2019-01-03

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

### 4.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
            while (start < i && count[c] > 1) {
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```

## 5. 2019-01-04

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
        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }
            lastIndex[c] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```

## 6. 2019-01-05

### 6.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 6.2. 解答

```java
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
```

## 7. 2019-01-06

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

### 7.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
            while (start < i && count[c] > 1) {
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```

## 8. 2019-01-07

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

### 8.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
            while (start < i && count[c] > 1) {
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```

## 9. 2019-01-08

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

### 9.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
            while (start < i && count[c] > 1) {
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```

## 10. 2019-01-09

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

### 10.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
            while (start < i && count[c] > 1) {
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```

## 11. 2019-01-10

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

### 11.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
            while (start < i && count[c] > 1) {
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```

## 12. 2019-01-11

### 12.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 12.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
            while (start < i && count[c] > 1) {
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```

## 13. 2019-01-12

### 13.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 13.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
            while (start < i && count[c] > 1) {
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
       
