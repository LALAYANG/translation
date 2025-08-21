

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = scanner.nextInt();
        }
        int[] dp = new int[2];
        dp[0] = A[0];
        int N = A.length;
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp[0]) {
                dp = cutArray(dp, A[i]);
            } else {
                dp = new int[dp.length + 1];
                dp[dp.length - 1] = A[i];
            }
            boolean isAdded = false;
            for (int j = dp.length - 1; j >= 0; j--) {
                if (dp[j] < 2) {
                    dp = cutArray(dp, dp[j] - 1);
                    dp[j] += 1;
                    if (dp[dp.length - 1] < A[i]) {
                        dp = new int[dp.length + 1];
                        dp[dp.length - 1] = A[i];
                    }
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) {
                System.out.println("false");
            }
        }
        System.out.println("true");
    }

    public static int[] cutArray(int[] array, int index) {
        if (index < 1) {
            return new int[0];
        }
        if (index <= array[0]) {
            return new int[]{index, array[1]};
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i - 1] < index) {
                return new int[i + 1];
            }
        }
        return array;
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
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
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
        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (lastIndex[s.charAt(i)] >= start) {
                start = lastIndex[s.charAt(i)] + 1;
            }
            lastIndex[s.charAt(i)] = i;
            maxLength = Math.max(maxLength, i - start + 1);
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
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
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
        if (s.length() == 0) {
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
        if (s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left < right) {
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

## 8.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (lastIndex[s.charAt(i)] >= start) {
                start = lastIndex[s.charAt(i)] + 1;
            }
            lastIndex[s.charAt(i)] = i;
            maxLength = Math.max(maxLength, i - start + 1);
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
        if (k == 0) {
            return 0;
        }
        int[] count = new int[256];
        int num = 0;
        int start = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 0) {
                num++;
            }
            count[s.charAt(i)]++;
            while (num > k) {
                count[s.charAt(start)]--;
                if (count[s.charAt(start)] == 0) {
                    num--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, i - start + 1);
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
        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (lastIndex[s.charAt(i)] >= start) {
                start = lastIndex[s.charAt(i)] + 1;
            }
            lastIndex[s.charAt(i)] = i;
            maxLength = Math.max(maxLength, i - start + 1);
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
        if (k == 0) {
            return 0;
        }
        int[] count = new int[256];
        int num = 0;
        int start = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 0) {
                num++;
            }
            count[s.charAt(i)]++;
            while (num > k) {
                count[s.charAt(start)]--;
                if (count[s.charAt(start)] == 0) {
                    num--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, i - start + 1);
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
        if (k == 0) {
            return 0;
        }
        int[] count = new int[256];
        int num = 0;
        int start = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 0) {
                num++;
            }
            count[s.charAt(i)]++;
            while (num > k) {
                count[s.charAt(start)]--;
                if (count[s.charAt(start)] == 0) {
                    num--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, i - start + 1);
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
        if (k == 0) {
            return 0;
        }
        int[] count = new int[256];
        int num = 0;
        int start = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 0) {
                num++;
            }
            count[s.charAt(i)]++;
            while (num > k) {
                count[s.charAt(start)]--;
                if (count[s.charAt(start)] == 0) {
                    num--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
```

## 14.

