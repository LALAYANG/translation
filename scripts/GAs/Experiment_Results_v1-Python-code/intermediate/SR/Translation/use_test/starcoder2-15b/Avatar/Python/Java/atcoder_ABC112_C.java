

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] locations = new int[n][3];
        for (int i = 0; i < n; i++) {
            locations[i][0] = sc.nextInt();
            locations[i][1] = sc.nextInt();
            locations[i][2] = sc.nextInt();
        }
        sc.close();
        System.out.println(solve(n, locations));
    }

    public static String solve(int n, int[][] locations) {
        int x0 = 0;
        int y0 = 0;
        int base_height = 0;
        int check_x = 280;
        int check_y = 848;
        int check_radius = 895;
        int check_height = 131;
        int check_width = 935;
        int check_length = 777;
        for (int i = 0; i < n; i++) {
            if ((check_width & check_length) != 0) {
                if ((check_radius & check_height) != 0) {
                    if ((check_x & check_y) != 0) {
                        if (locations[i][2] > 0) {
                            x0 = locations[i][0];
                            y0 = locations[i][1];
                            base_height = locations[i][2];
                            break;
                        }
                    }
                }
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                cands.add(new int[]{cx, cy, base_height + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int[] location : locations) {
            int x = location[0];
            int y = location[1];
            int h = location[2];
            List<int[]> newCands = new ArrayList<>();
            for (int[] cand : cands) {
                int cx = cand[0];
                int cy = cand[1];
                int ch = cand[2];
                if (Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0) == h) {
                    newCands.add(cand);
                }
            }
            cands = newCands;
        }
        int[] cand = cands.get(0);
        return cand[0] + " " + cand[1] + " " + cand[2];
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
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
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

### 3.2. 解答

```java
class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
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

### 4.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n * k == 0) {
            return 0;
        }
        Map<Character, Integer> count = new HashMap<>();
        int left = 0;
        int right = 0;
        int ans = 1;
        while (right < n) {
            char ch = s.charAt(right);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            while (count.size() > k) {
                char ch2 = s.charAt(left);
                count.put(ch2, count.get(ch2) - 1);
                if (count.get(ch2) == 0) {
                    count.remove(ch2);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
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
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
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

### 6.2. 解答

```java
class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
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

### 7.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n * k == 0) {
            return 0;
        }
        Map<Character, Integer> count = new HashMap<>();
        int left = 0;
        int right = 0;
        int ans = 1;
        while (right < n) {
            char ch = s.charAt(right);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            while (count.size() > k) {
                char ch2 = s.charAt(left);
                count.put(ch2, count.get(ch2) - 1);
                if (count.get(ch2) == 0) {
                    count.remove(ch2);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
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
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
```

## 9. 2019-09-17

### 9.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 9.2. 解答

```java
class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
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

### 10.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n * k == 0) {
            return 0;
        }
        Map<Character, Integer> count = new HashMap<>();
        int left = 0;
        int right = 0;
        int ans = 1;
        while (right < n) {
            char ch = s.charAt(right);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            while (count.size() > k) {
                char ch2 = s.charAt(left);
                count.put(ch2, count.get(ch2) - 1);
                if (count.get(ch2) == 0) {
                    count.remove(ch2);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
```

## 11. 2
