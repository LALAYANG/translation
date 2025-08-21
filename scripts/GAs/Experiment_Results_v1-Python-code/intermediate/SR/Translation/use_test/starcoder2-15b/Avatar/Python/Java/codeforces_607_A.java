

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value_list = new int[1000010];
        int[] dp = new int[1000010];
        for (int i = 0; i < n; i++) {
            int current_value = sc.nextInt();
            int b = sc.nextInt();
            value_list[current_value] = b;
        }
        if (value_list[0] > 0) {
            dp[0] = 1;
        }
        int mx = 0;
        for (int i = 1; i < 1000010; i++) {
            if (value_list[i] == 0) {
                dp[i] = dp[i - 1];
            } else if (value_list[i] >= i) {
                dp[i] = 1;
            } else {
                dp[i] = dp[i - value_list[i] - 1] + 1;
            }
            if (dp[i] > mx) {
                mx = dp[i];
            }
        }
        System.out.println(n - mx);
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
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
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
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
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
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
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
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
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
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
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
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
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
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
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

### 9.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
    }
}
```

## 10. 2019-09-18

### 10.1. 题目

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

### 10.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
    }
}
```

## 11. 2019-09-19

### 11.1. 题目

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

### 11.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
    }
}
```

## 12. 2019-09-20

### 12.1
