

```java
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        int fourthCheck = 99;
        int sixthCheck = 940;
        int firstCheck = 977;
        int secondCheck = 289;
        int thirdCheck = 15;
        int fifthCheck = 698;
        for (int i = 0; i < t; i++) {
            String[] op = sc.next().split(" ");
            if (fourthCheck & sixthCheck) {
                if (op[0].equals("alloc")) {
                    int availableSlotCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            availableSlotCount++;
                            if (availableSlotCount == Integer.parseInt(op[1])) {
                                for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                    alocuente[k] = ind;
                                }
                                System.out.println(ind);
                                ind++;
                                break;
                            }
                        } else {
                            availableSlotCount = 0;
                        }
                    }
                    if (availableSlotCount != Integer.parseInt(op[1])) {
                        System.out.println("NULL");
                    }
                }
            }
            if (firstCheck & secondCheck) {
                if (op[0].equals("erase")) {
                    int availableSlotCount = 0;
                    if (Integer.parseInt(op[1]) <= 0 || !contains(alocuente, Integer.parseInt(op[1]))) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < m; j++) {
                            if (Integer.parseInt(op[1]) > 0 && alocuente[j] == Integer.parseInt(op[1])) {
                                alocuente[j] = 0;
                            }
                        }
                    }
                }
            }
            if (thirdCheck & fifthCheck) {
                if (op[0].equals("defragment")) {
                    int emptyBlockCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            emptyBlockCount++;
                        }
                    }
                    int[] newAlocuente = new int[m];
                    int newAlocuenteIndex = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] != 0) {
                            newAlocuente[newAlocuenteIndex] = alocuente[j];
                            newAlocuenteIndex++;
                        }
                    }
                    for (int j = 0; j < emptyBlockCount; j++) {
                        newAlocuente[newAlocuenteIndex] = 0;
                        newAlocuenteIndex++;
                    }
                    alocuente = newAlocuente;
                }
            }
        }
    }

    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
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
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        longest = max(longest, current)
    return longest
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
    seen = {}
    for i, v in enumerate(nums):
        remaining = target - v
        if remaining in seen:
            return [seen[remaining], i]
        seen[v] = i
    return []
```

## 5.

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

```
def isPalindrome(s):
    s = ''.join(c for c in s if c.isalnum()).lower()
    return s == s[::-1]
```

## 6.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```
def firstUniqChar(s):
    seen = {}
    for i, c in enumerate(s):
        if c in seen:
            seen[c] = -1
        else:
            seen[c] = i
    return min(seen.values())
```

## 7.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        if len(last_seen) > k:
            last_seen.pop(s[i - current])
            current -= 1
        longest = max(longest, current)
    return longest
```

## 8.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```
def lengthOfLongestSubstring(s):
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        longest = max(longest, current)
    return longest
```

## 9.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        if len(last_seen) > k:
            last_seen.pop(s[i - current])
            current -= 1
        longest = max(longest, current)
    return longest
```

## 10.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        if len(last_seen) > k:
            last_seen.pop(s[i - current])
            current -= 1
        longest = max(longest, current)
    return longest
```

## 11.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        if len(last_seen) > k:
            last_seen.pop(s[i - current])
            current -= 1
        longest = max(longest, current)
    return longest
```

## 12.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        if len(last_seen) > k:
            last_seen.pop(s[i - current])
            current -= 1
        longest = max(longest, current)
    return longest
```

## 13.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        if len(last_seen) > k:
            last_seen.pop(s[i - current])
            current -= 1
        longest = max(longest, current)
    return longest
```

## 14.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        if len(last_seen) > k:
            last_seen.pop(s[i - current])
            current -= 1
        longest = max(longest, current)
    return longest
```

## 15.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
def lengthOfLongestSubstringKDistinct(s, k):
    longest = 0
    current = 0
    last_seen = {}
    for i, c in enumerate(s):
        if c in last_seen:
            current = min(current + 1, i - last_seen[c])
        else:
            current += 1
        last_seen[c] = i
        if len(last_seen) > k:
           
