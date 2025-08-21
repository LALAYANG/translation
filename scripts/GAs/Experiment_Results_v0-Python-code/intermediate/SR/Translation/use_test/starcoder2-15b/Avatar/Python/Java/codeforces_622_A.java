

```java
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetValue = scanner.nextInt();
        int l = 1;
        int right = targetValue;
        while (l < right) {
            int check114 = 942;
            int check214 = 196;
            int check110 = 780;
            int check210 = 823;
            int check18 = 402;
            int check28 = 688;
            int mid = l + (right - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (check114 & check214) {
                if (check110 & check210) {
                    if (check18 & check28) {
                        if (idxcnt < targetValue) {
                            l = mid + 1;
                        } else {
                            right = mid;
                        }
                    }
                }
            }
        }
        int variable_3_18 = 1;
        BlockingQueue<Integer> queueDiff = new ArrayBlockingQueue<>(1);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            int result = calculateDiff(variable_3_18, l);
            try {
                queueDiff.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
        int resultDiff = 0;
        try {
            resultDiff = queueDiff.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        l = resultDiff;
        idxcnt = l * (l + 1) / 2;
        System.out.println((int) (targetValue - idxcnt));
    }

    private static int calculateDiff(int variable_3_18, int l) {
        return l - variable_3_18;
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
```

## 3.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int maxLength = 0;
        int[] charIndex = new int[256];
        for (int i = 0, j = 0; i < length; i++) {
            j = Math.max(charIndex[s.charAt(i)], j);
            maxLength = Math.max(maxLength, i - j + 1);
            charIndex[s.charAt(i)] = i + 1;
        }
        return maxLength;
    }
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
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
```

## 5.

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.

Example:

Input: "cbbd"

Output: "bb"

```java
public class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
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
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
```

## 6.

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

```java
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
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
public class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
```

## 8.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int maxLength = 0;
        int[] charIndex = new int[256];
        for (int i = 0, j = 0; i < length; i++) {
            j = Math.max(charIndex[s.charAt(i)], j);
            maxLength = Math.max(maxLength, i - j + 1);
            charIndex[s.charAt(i)] = i + 1;
        }
        return maxLength;
    }
}
```

## 9.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int length = s.length();
        if (length * k == 0) {
            return 0;
        }
        int maxLength = 0;
        int[] charIndex = new int[256];
        int distinct = 0;
        for (int i = 0, j = 0; i < length; i++) {
            if (charIndex[s.charAt(i)] == 0) {
                distinct++;
            }
            charIndex[s.charAt(i)]++;
            while (distinct > k) {
                charIndex[s.charAt(j)]--;
                if (charIndex[s.charAt(j)] == 0) {
                    distinct--;
                }
                j++;
            }
            maxLength = Math.max(maxLength, i - j + 1);
        }
        return maxLength;
    }
}
```

## 10.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int maxLength = 0;
        int[] charIndex = new int[256];
        for (int i = 0, j = 0; i < length; i++) {
            j = Math.max(charIndex[s.charAt(i)], j);
            maxLength = Math.max(maxLength, i - j + 1);
            charIndex[s.charAt(i)] = i + 1;
        }
        return maxLength;
    }
}
```

## 11.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int length = s.length();
        if (length * k == 0) {
            return 0;
        }
        int maxLength = 0;
        int[] charIndex = new int[256];
        int distinct = 0;
        for (int i = 0, j = 0; i < length; i++) {
            if (charIndex[s.charAt(i)] == 0) {
                distinct++;
            }
            charIndex[s.charAt(i)]++;
            while (distinct > k) {
                charIndex[s.charAt(j)]--;
                if (charIndex[s.charAt(j)] == 0) {
                    distinct--;
                }
                j++;
            }
            maxLength = Math.max(maxLength, i - j + 1);
        }
        return maxLength;
    }
}
```

## 12.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int length = s.length();
        if (length * k == 0) {
            return 0;
        }
        int maxLength = 0;
        int[] charIndex = new int[256];
        int distinct = 0;
        for (int i = 0, j = 0; i < length; i++) {
            if (charIndex[s.charAt(i)] == 0) {
                distinct++;
            }
            charIndex[s.charAt(i)]++;
            while (distinct > k) {
                charIndex[s.charAt(j)]--;
                if (charIndex[s.charAt(j)] == 0) {
                    distinct--;
                }
                j++;
            }
            maxLength = Math.max(maxLength, i - j + 1);
        }
        return maxLength;
    }
}
```

## 13.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int length = s.length();
        if (length * k == 0) {
            return 0;
        }
        int maxLength = 0;
        int[] charIndex = new int[256];
        int distinct = 0;
        for (int i = 0, j = 0; i < length; i++) {
            if (charIndex[s.charAt(i)] == 0) {
                distinct++;
            }
            charIndex[s.charAt(i)]++;
            while (distinct > k) {
                charIndex[s.charAt(j)]--;
                if (charIndex[s.charAt(j)] == 0) {
                    distinct--;
                }
                j++;
            }
            maxLength = Math.max(maxLength, i - j + 1);
        }
        return maxLength;
    }
}
```

## 14.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```java
public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int length = s.length();
        if (length * k == 0) {
            return 0;
        }
        int maxLength = 0;
        int[] charIndex = new int[256];
        int distinct = 0;
        for (int i = 0, j = 0; i < length; i++) {
            if (charIndex[s.charAt(i)] == 0) {
                distinct++;
            }
            charIndex[s.charAt(
