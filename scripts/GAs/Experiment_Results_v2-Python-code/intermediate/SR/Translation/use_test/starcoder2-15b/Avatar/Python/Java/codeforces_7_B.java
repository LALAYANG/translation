

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        int MinConditionChecker = 355;
        int SmallConditionChecker = 263;
        int MediumConditionChecker = 505;
        int MidConditionChecker = 686;
        int LowConditionChecker = 139;
        int MaxConditionChecker = 298;
        for (int i = 0; i < t; i++) {
            String[] operation = sc.next().split(" ");
            if (MinConditionChecker & SmallConditionChecker) {
                if (operation[0].equals("alloc")) {
                    int pos = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            pos++;
                            if (pos == Integer.parseInt(operation[1])) {
                                for (int k = j - Integer.parseInt(operation[1]) + 1; k <= j; k++) {
                                    alocuente[k] = ind;
                                }
                                System.out.println(ind);
                                ind++;
                                break;
                            }
                        } else {
                            pos = 0;
                        }
                    }
                    if (pos == 0) {
                        System.out.println("NULL");
                    }
                }
            }
            if (MediumConditionChecker & MidConditionChecker) {
                if (operation[0].equals("erase")) {
                    int pos = 0;
                    if (Integer.parseInt(operation[1]) <= 0 || !Arrays.asList(alocuente).contains(Integer.parseInt(operation[1]))) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < m; j++) {
                            if (Integer.parseInt(operation[1]) > 0 && alocuente[j] == Integer.parseInt(operation[1])) {
                                alocuente[j] = 0;
                            }
                        }
                    }
                }
            }
            if (LowConditionChecker & MaxConditionChecker) {
                if (operation[0].equals("defragment")) {
                    int zeroCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            zeroCount++;
                        }
                    }
                    int[] temp = new int[m - zeroCount];
                    int k = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] != 0) {
                            temp[k] = alocuente[j];
                            k++;
                        }
                    }
                    for (int j = 0; j < zeroCount; j++) {
                        temp[k] = 0;
                        k++;
                    }
                    alocuente = temp;
                }
            }
        }
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```
def reverseString(s):
    return s[::-1]
```

## 3.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```
def lengthOfLongestSubstring(s):
    if len(s) == 0:
        return 0
    max_length = 1
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            if len(set(s[i:j])) == j - i:
                max_length = max(max_length, j - i)
    return max_length
```

## 4.

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

```
def twoSum(nums, target):
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
```

## 5.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```
def firstUniqChar(s):
    for i in range(len(s)):
        if s.count(s[i]) == 1:
            return i
    return -1
```

## 6.

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

```
def isPalindrome(s):
    s = s.lower()
    s = ''.join(c for c in s if c.isalnum())
    return s == s[::-1]
```

## 7.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    if k == 0:
        return 0
    max_length = 0
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            if len(set(s[i:j])) <= k:
                max_length = max(max_length, j - i)
    return max_length
```

## 8.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```
def lengthOfLongestSubstring(s):
    if len(s) == 0:
        return 0
    max_length = 1
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            if len(set(s[i:j])) == j - i:
                max_length = max(max_length, j - i)
    return max_length
```

## 9.

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringTwoDistinct(s):
    if len(s) == 0:
        return 0
    max_length = 1
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            if len(set(s[i:j])) <= 2:
                max_length = max(max_length, j - i)
    return max_length
```

## 10.

Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".

Note:
If there is no such window in S that covers all characters in T, return the empty string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.

```
def minWindow(s, t):
    if len(s) == 0 or len(t) == 0:
        return ""
    min_length = len(s) + 1
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            if len(set(s[i:j])) == len(t) and len(t) == len(set(s[i:j]) & set(t)):
                min_length = min(min_length, j - i)
    return min_length
```

## 11.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```
def firstUniqChar(s):
    for i in range(len(s)):
        if s.count(s[i]) == 1:
            return i
    return -1
```

## 12.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```
def lengthOfLongestSubstring(s):
    if len(s) == 0:
        return 0
    max_length = 1
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            if len(set(s[i:j])) == j - i:
                max_length = max(max_length, j - i)
    return max_length
```

## 13.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    if k == 0:
        return 0
    max_length = 0
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            if len(set(s[i:j])) <= k:
                max_length = max(max_length, j - i)
    return max_length
```

## 14.

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringTwoDistinct(s):
    if len(s) == 0:
        return 0
    max_length = 1
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            if len(set(s[i:j])) <= 2:
                max_length = max(max_length, j - i)
    return max_length
```

## 15.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```
def firstUniqChar(s):
    for i in range(len(s)):
        if s.count(s[i]) == 1:
            return i
    return -1
```

## 16.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    if k == 0:
        return 0
    max_length = 0
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            if len(set(s[i:j])) <= k:
                max_length = max(max_length, j - i)
    return max_length
```

## 17.

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringTwoDistinct(s):
    if len(s) == 0:
        return 0
    max
