

```java
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += w[i];
        }
        List<Integer> resultIndices = new ArrayList<>();
        int conditionChecker = 355;
        int newConditionChecker = 753;
        int newLoopChecker = 663;
        int loopChecker = 662;
        for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {
            recursiveFunction(0, n, 1, x, w, resultIndices, conditionChecker, newConditionChecker);
        }
        System.out.println(resultIndices.size());
        for (int i = 0; i < resultIndices.size(); i++) {
            System.out.print(resultIndices.get(i) + " ");
        }
    }

    public static void recursiveFunction(int i, int stop, int step, int x, int[] w, List<Integer> resultIndices, int conditionChecker, int newConditionChecker) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (conditionChecker & newConditionChecker) {
            if ((x - w[i]) / (w.length - 1) == w[i]) {
                resultIndices.add(i + 1);
            }
        }
        recursiveFunction(i + step, stop, step, x, w, resultIndices, conditionChecker, newConditionChecker);
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public String reverseString(String s) {
    char[] chars = s.toCharArray();
    int i = 0;
    int j = chars.length - 1;
    while (i < j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        i++;
        j--;
    }
    return new String(chars);
}
```

## 3.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public int lengthOfLongestSubstring(String s) {
    int[] lastIndex = new int[256];
    Arrays.fill(lastIndex, -1);
    int start = 0;
    int maxLen = 0;
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
```

## 4.

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            return new int[]{map.get(target - nums[i]), i};
        }
        map.put(nums[i], i);
    }
    return new int[0];
}
```

## 5.

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

```java
public String longestPalindrome(String s) {
    if (s == null || s.length() == 0) {
        return "";
    }
    int start = 0;
    int end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i);
        int len2 = expandAroundCenter(s, i, i + 1);
        int len = Math.max(len1, len2);
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private int expandAroundCenter(String s, int left, int right) {
    int L = left;
    int R = right;
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--;
        R++;
    }
    return R - L - 1;
}
```

## 6.

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false

```java
public boolean isPalindrome(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
        while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
            i++;
        }
        while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
            j--;
        }
        if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
            return false;
        }
        i++;
        j--;
    }
    return true;
}
```

## 7.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```java
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
```

## 8.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public int lengthOfLongestSubstring(String s) {
    int[] lastIndex = new int[256];
    Arrays.fill(lastIndex, -1);
    int start = 0;
    int maxLen = 0;
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
```

## 9.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (s == null || s.length() == 0 || k == 0) {
        return 0;
    }
    int[] count = new int[256];
    int start = 0;
    int maxLen = 0;
    int distinct = 0;
    for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i)] == 0) {
            distinct++;
        }
        count[s.charAt(i)]++;
        while (distinct > k) {
            count[s.charAt(start)]--;
            if (count[s.charAt(start)] == 0) {
                distinct--;
            }
            start++;
        }
        maxLen = Math.max(maxLen, i - start + 1);
    }
    return maxLen;
}
```

## 10.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public int lengthOfLongestSubstring(String s) {
    int[] lastIndex = new int[256];
    Arrays.fill(lastIndex, -1);
    int start = 0;
    int maxLen = 0;
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
```

## 11.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (s == null || s.length() == 0 || k == 0) {
        return 0;
    }
    int[] count = new int[256];
    int start = 0;
    int maxLen = 0;
    int distinct = 0;
    for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i)] == 0) {
            distinct++;
        }
        count[s.charAt(i)]++;
        while (distinct > k) {
            count[s.charAt(start)]--;
            if (count[s.charAt(start)] == 0) {
                distinct--;
            }
            start++;
        }
        maxLen = Math.max(maxLen, i - start + 1);
    }
    return maxLen;
}
```

## 12.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (s == null || s.length() == 0 || k == 0) {
        return 0;
    }
    int[] count = new int[256];
    int start = 0;
    int maxLen = 0;
    int distinct = 0;
    for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i)] == 0) {
            distinct++;
        }
        count[s.charAt(i)]++;
        while (distinct > k) {
            count[s.charAt(start)]--;
            if (count[s.charAt(start)] == 0) {
                distinct--;
            }
            start++;
        }
        maxLen = Math.max(maxLen, i - start + 1);
    }
    return maxLen;
}
```

## 13.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (s == null || s.length() == 0 || k == 0) {
        return 0;
    }
    int[] count = new int[256];
    int start = 0;
    int maxLen = 0;
    int distinct = 0;
    for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i)] == 0) {
            distinct++;
        }
        count[s.charAt(i)]++;
        while (distinct > k) {
            count[s.charAt(start)]--;
            if (count[s.charAt(start)] == 0) {
                distinct--;
            }
            start++;
        }
        maxLen = Math.max(maxLen, i - start + 1);
    }
    return maxLen;
}
```

## 14.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (s == null || s.length() == 0 || k == 0) {
        return 0;
    }
    int[] count = new int[256];
    int start = 0;
    int maxLen = 0;
    int distinct = 0;
    for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i)] == 0) {
            distinct++;
        }
        count[s.charAt(i)]++;
        while (distinct > k) {
            count[s.charAt(start)]--;
            if (count[s.charAt(start)] == 0) {
                distinct--;
            }
            start++;
        }
        maxLen = Math.max(maxLen, i - start + 1);
    }
    return maxLen;
}
```

## 15.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (s == null || s.length()
