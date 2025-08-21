

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] L = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            L[i] = sc.nextInt();
        }
        int[] path = new int[N + 1];
        int[] Hash = new int[N + 1];
        int ind = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        for (int i = 1; i <= N; i++) {
            int ne = L[x];
            if (Hash[ne] != 0) {
                flag = true;
                t = Hash[ne];
                break;
            }
            path[i] = ne;
            ind++;
            Hash[ne] = ind;
            x = ne;
        }
        if (flag) {
            int[] loop = new int[N + 1];
            int j = 0;
            for (int i = t; i <= N; i++) {
                loop[j] = path[i];
                j++;
            }
            if (K < (ind + 1)) {
                System.out.println(path[K]);
            } else {
                K = K - ind;
                K = K % j;
                System.out.println(loop[K]);
            }
        } else {
            System.out.println(path[K]);
        }
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

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个HashSet来存储，每次将right向右移动一位，如果当前字符不在HashSet中，则将其加入HashSet中，并更新窗口的最大长度，如果当前字符在HashSet中，则将left向右移动一位，直到当前字符不在HashSet中，然后将当前字符加入HashSet中，并更新窗口的最大长度。

### 2.3. 代码

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
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

### 3.2. 思路

使用一个HashMap来存储每个字符出现的次数，然后遍历字符串，如果当前字符出现的次数为1，则返回其下标。

### 3.3. 代码

```
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
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

### 4.2. 思路

使用滑动窗口，窗口内的字符不超过k个，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个HashMap来存储，每次将right向右移动一位，如果当前字符不在HashMap中，则将其加入HashMap中，并更新窗口的最大长度，如果当前字符在HashMap中，则将其出现次数加1，如果HashMap的大小超过k，则将left向右移动一位，直到HashMap的大小不超过k，然后将当前字符加入HashMap中，并更新窗口的最大长度。

### 4.3. 代码

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n * k == 0) return 0;
        // sliding window left and right pointers
        int left = 0;
        int right = 0;
        // hashmap character -> its rightmost position 
        // in the sliding window
        Map<Character, Integer> hashmap = new HashMap<Character, Integer>();

        int max_len = 1;

        while (right < n) {
            // slidewindow contains less than k characters
            if (hashmap.size() <= k) {
                char c = s.charAt(right);
                hashmap.put(c, right);
                right++;
            }
            // slidewindow contains more than k characters
            if (hashmap.size() > k) {
                // delete the leftmost character
                int leftmost = n;
                for (int i : hashmap.values()) {
                    leftmost = Math.min(leftmost, i);
                }
                char c = s.charAt(leftmost);
                hashmap.remove(c);
                left = leftmost + 1;
            }

            max_len = Math.max(max_len, right - left);
        }
        return max_len;
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

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个HashSet来存储，每次将right向右移动一位，如果当前字符不在HashSet中，则将其加入HashSet中，并更新窗口的最大长度，如果当前字符在HashSet中，则将left向右移动一位，直到当前字符不在HashSet中，然后将当前字符加入HashSet中，并更新窗口的最大长度。

### 5.3. 代码

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
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

### 6.2. 思路

使用一个HashMap来存储每个字符出现的次数，然后遍历字符串，如果当前字符出现的次数为1，则返回其下标。

### 6.3. 代码

```
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
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

### 7.2. 思路

使用滑动窗口，窗口内的字符不超过k个，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个HashMap来存储，每次将right向右移动一位，如果当前字符不在HashMap中，则将其加入HashMap中，并更新窗口的最大长度，如果当前字符在HashMap中，则将其出现次数加1，如果HashMap的大小超过k，则将left向右移动一位，直到HashMap的大小不超过k，然后将当前字符加入HashMap中，并更新窗口的最大长度。

### 7.3. 代码

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n * k == 0) return 0;
        // sliding window left and right pointers
        int left = 0;
        int right = 0;
        // hashmap character -> its rightmost position 
        // in the sliding window
        Map<Character, Integer> hashmap = new HashMap<Character, Integer>();

        int max_len = 1;

        while (right < n) {
            // slidewindow contains less than k characters
            if (hashmap.size() <= k) {
                char c = s.charAt(right);
                hashmap.put(c, right);
                right++;
            }
            // slidewindow contains more than k characters
            if (hashmap.size() > k) {
                // delete the leftmost character
                int leftmost = n;
                for (int i : hashmap.values()) {
                    leftmost = Math.min(leftmost, i);
                }
                char c = s.charAt(leftmost);
                hashmap.remove(c);
                left = leftmost + 1;
            }

            max_len = Math.max(max_len, right - left);
        }
        return max_len;
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

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，窗口内的字符用一个HashSet来存储，每次将right向右移动一位，如果当前字符不在HashSet
