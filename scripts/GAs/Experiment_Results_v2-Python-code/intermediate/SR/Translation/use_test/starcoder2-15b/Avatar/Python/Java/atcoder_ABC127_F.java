

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] ans = new int[2];
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        int sum_b = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;
        int condition_one = 569;
        int condition_two = 215;
        int outer_loop_limit = 205;
        int inner_loop_limit = 204;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < q; i++) {
                int[] query_list = new int[3];
                for (int j = 0; j < 3; j++) {
                    query_list[j] = sc.nextInt();
                }
                if ((condition_one & condition_two) != 0) {
                    if (query_list[0] == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                        } else {
                            System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                        }
                    } else {
                        sum_b += query_list[2];
                        if (p1.size() == 0) {
                            p1.add(query_list[1]);
                            sum_p1 += query_list[1];
                        } else if (p1.peek() <= query_list[1]) {
                            p1.add(query_list[1]);
                            sum_p1 += query_list[1];
                        } else {
                            p2.add(-query_list[1]);
                            sum_p2 += query_list[1];
                        }
                        if (p1.size() < p2.size()) {
                            int k = p2.poll();
                            p1.add(-k);
                            sum_p2 += k;
                            sum_p1 -= k;
                        }
                        if (p1.size() - 1 > p2.size()) {
                            int k = p1.poll();
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

## 2. 2020-03-10

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
                max = Math.max(max, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        return Math.max(max, s.length() - start);
    }
}
```

## 3. 2020-03-11

### 3.1. 题目

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:

Input: "cbbd"
Output: "bb"

### 3.2. 解答

```java
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }
        int max = 1;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > max) {
                max = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + max);
    }

    private int expand(String s, int left, int right) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
```

## 4. 2020-03-12

### 4.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:

4
One possible longest palindromic subsequence is "bbbb".

Example 2:
Input:

"cbbd"
Output:

2
One possible longest palindromic subsequence is "bb".

### 4.2. 解答

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
```

## 5. 2020-03-13

### 5.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:

4
One possible longest palindromic subsequence is "bbbb".

Example 2:
Input:

"cbbd"
Output:

2
One possible longest palindromic subsequence is "bb".

### 5.2. 解答

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
```

## 6. 2020-03-14

### 6.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:

4
One possible longest palindromic subsequence is "bbbb".

Example 2:
Input:

"cbbd"
Output:

2
One possible longest palindromic subsequence is "bb".

### 6.2. 解答

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
```

## 7. 2020-03-15

### 7.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:

4
One possible longest palindromic subsequence is "bbbb".

Example 2:
Input:

"cbbd"
Output:

2
One possible longest palindromic subsequence is "bb".

### 7.2. 解答

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
```

## 8. 2020-03-16

### 8.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:

4
One possible longest palindromic subsequence is "bbbb".

Example 2:
Input:

"cbbd"
Output:

2
One possible longest palindromic subsequence is "bb".

### 8.2. 解答

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
```

## 9. 2020-03-17

### 9.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:

4
One possible longest palindromic subsequence is "bbbb".

Example 2:
Input:

"cbbd"
Output:

2
One possible longest palindromic subsequence is "bb".

### 9.2. 解答

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
```

## 10. 2020-03-18

### 10.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.
