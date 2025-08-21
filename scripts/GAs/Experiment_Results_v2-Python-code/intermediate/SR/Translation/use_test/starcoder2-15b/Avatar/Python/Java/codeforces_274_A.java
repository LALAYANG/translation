

```java
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor = sc.nextInt();
        int[] input_array = new int[num];
        for (int i = 0; i < num; i++) {
            input_array[i] = sc.nextInt();
        }
        Set<Integer> unique_elements = new HashSet<>();
        int maximum_unique_count = 0;
        Arrays.sort(input_array);
        for (int x : input_array) {
            if (x % divisor != 0 || !unique_elements.contains(x / divisor)) {
                unique_elements.add(x);
            }
            maximum_unique_count = Math.max(unique_elements.size(), maximum_unique_count);
        }
        System.out.println(maximum_unique_count);
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
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
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
        int[] last_seen = new int[256];
        Arrays.fill(last_seen, -1);
        int max_length = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (last_seen[s.charAt(i)] >= start) {
                max_length = Math.max(max_length, i - start);
                start = last_seen[s.charAt(i)] + 1;
            }
            last_seen[s.charAt(i)] = i;
        }
        return Math.max(max_length, s.length() - start);
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
        int[] last_seen = new int[256];
        Arrays.fill(last_seen, -1);
        int max_length = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (last_seen[s.charAt(i)] >= start) {
                max_length = Math.max(max_length, i - start);
                start = last_seen[s.charAt(i)] + 1;
            }
            last_seen[s.charAt(i)] = i;
        }
        return Math.max(max_length, s.length() - start);
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
        int max_length = 0;
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
            max_length = Math.max(max_length, i - start + 1);
        }
        return max_length;
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
        int[] last_seen = new int[256];
        Arrays.fill(last_seen, -1);
        int max_length = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (last_seen[s.charAt(i)] >= start) {
                max_length = Math.max(max_length, i - start);
                start = last_seen[s.charAt(i)] + 1;
            }
            last_seen[s.charAt(i)] = i;
        }
        return Math.max(max_length, s.length() - start);
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
        int max_length = 0;
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
            max_length = Math.max(max_length, i - start + 1);
        }
        return max_length;
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
        int max_length = 0;
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
            max_length = Math.max(max_length, i - start + 1);
        }
        return max_length;
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
        int max_length = 0;
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
            max_length = Math.max(max_length, i - start + 1);
        }
        return max_length;
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
        if (k == 0) {
            return 0;
        }
        int[] count = new int[256];
        int num = 0;
        int start = 0;
        int max_length = 0;
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
            max_length = Math.max(max_length, i - start + 1);
        }
        return max_length;
    }
}
```

## 15.

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
        int max_length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 0) {
                num++;
            }
            count[s.charAt(i)]++;
            while (num > k) {
                count[s.charAt(start)]--;
