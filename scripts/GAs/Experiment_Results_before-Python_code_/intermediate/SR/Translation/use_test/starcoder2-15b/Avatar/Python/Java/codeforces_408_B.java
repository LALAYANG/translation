

```
import java.util.*;
import java.io.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bought = sc.nextLine();
        String made = sc.nextLine();
        int res = 0;
        for (int i = 0; i < made.length(); i++) {
            char c = made.charAt(i);
            int count = 0;
            for (int j = 0; j < bought.length(); j++) {
                if (bought.charAt(j) == c) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(-1);
                return;
            }
            res += Math.min(count, 1);
        }
        System.out.println(res);
    }
}

```

## 2.

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

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                res = Math.max(res, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        res = Math.max(res, s.length() - start);
        return res;
    }
}

```

## 3.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```
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

## 4.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int res = 0;
        int start = 0;
        int distinct = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c] == 0) {
                distinct++;
            }
            count[c]++;
            while (distinct > k) {
                char c2 = s.charAt(start);
                count[c2]--;
                if (count[c2] == 0) {
                    distinct--;
                }
                start++;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}

```

## 5.

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

Example 1:

Input: "eceba"
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: "ccaabbb"
Output: 5
Explanation: T is "aabbb" which its length is 5.

```
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] count = new int[256];
        int res = 0;
        int start = 0;
        int distinct = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c] == 0) {
                distinct++;
            }
            count[c]++;
            while (distinct > 2) {
                char c2 = s.charAt(start);
                count[c2]--;
                if (count[c2] == 0) {
                    distinct--;
                }
                start++;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}

```

## 6.

Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
Note:

If there is no such window in S that covers all characters in T, return the empty string "".
If there is such window, you are guaranteed that there will always be only one unique minimum window in S.

```
class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[256];
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)]++;
        }
        int start = 0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;
        int distinct = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c] > 0) {
                distinct++;
            }
            count[c]--;
            while (distinct == t.length()) {
                if (i - start + 1 < minLen) {
                    minLen = i - start + 1;
                    minStart = start;
                }
                char c2 = s.charAt(start);
                count[c2]++;
                if (count[c2] > 0) {
                    distinct--;
                }
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}

```

## 7.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int res = 0;
        int start = 0;
        int distinct = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c] == 0) {
                distinct++;
            }
            count[c]++;
            while (distinct > k) {
                char c2 = s.charAt(start);
                count[c2]--;
                if (count[c2] == 0) {
                    distinct--;
                }
                start++;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}

```

## 8.

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

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                res = Math.max(res, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        res = Math.max(res, s.length() - start);
        return res;
    }
}

```

## 9.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```
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

## 10.

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

Example 1:

Input: "eceba"
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: "ccaabbb"
Output: 5
Explanation: T is "aabbb" which its length is 5.

```
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] count = new int[256];
        int res = 0;
        int start = 0;
        int distinct = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c] == 0) {
                distinct++;
            }
            count[c]++;
            while (distinct > 2) {
                char c2 = s.charAt(start);
                count[c2]--;
                if (count[c2] == 0) {
                    distinct--;
                }
                start++;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}

```

## 11.

Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
Note:

If there is no such window in S that covers all characters in T, return the empty string "".
If there is such window, you are guaranteed that there will always be only one unique minimum window in S.

```
class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[256];
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)]++;
        }
        int start = 0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;
        int distinct = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c] > 0) {
                distinct++;
            }
            count[c]--;
            while (distinct == t.length()) {
                if (i - start + 1 < minLen) {
                    minLen = i - start + 1;
                    minStart = start;
                }
                char c2 = s.charAt(start);
                count[c2]++;
                if (count[c2] > 0) {
                    distinct--;
                }
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}

```

## 12.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int res = 0;
        int start = 0;
        int distinct = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c] == 0) {
                distinct++;
            }
            count[c]++;
            while (distinct > k) {
                char c2 = s.charAt(start);
                count[c2]--;
                if (count[c2] == 0) {
                    distinct--;
                }
                start++;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}

```

## 13.

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

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
               
