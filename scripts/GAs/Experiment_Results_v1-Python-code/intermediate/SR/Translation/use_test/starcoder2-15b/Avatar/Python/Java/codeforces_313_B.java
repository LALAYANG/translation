

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int[] prefixSums = new int[inputString.length() + 1];
        int checkerOne = 962;
        int checkerTwo = 535;

        for (int i = 1; i < prefixSums.length; i++) {
            prefixSums[i] = prefixSums[i - 1];
            if ((checkerOne & checkerTwo) != 0) {
                if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                    prefixSums[i]++;
                }
            }
        }

        int numQueries = Integer.parseInt(sc.nextLine());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numQueries; i++) {
            String[] input = sc.nextLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            arr.add(prefixSums[l - 1] - prefixSums[m - 1]);
        }

        TTest tTest = new TTest();
        double[] arr1 = {90, 68, 40};
        double[] arr2 = {28, 88, 95};
        System.out.println(tTest.t(arr1, arr2));
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```
class Solution {
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

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                max = Math.max(max, end - start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
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

```
class Solution {
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

```
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
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

```
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
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

```
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) return i;
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

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                max = Math.max(max, end - start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
```

## 9.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;
        int start = 0, end = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            if (map.size() <= k) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);
                end++;
            }
            if (map.size() > k) {
                char c = s.charAt(start);
                int count = map.get(c);
                if (count == 1) map.remove(c);
                else map.put(c, count - 1);
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
```

## 10.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                max = Math.max(max, end - start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
```

## 11.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;
        int start = 0, end = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            if (map.size() <= k) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);
                end++;
            }
            if (map.size() > k) {
                char c = s.charAt(start);
                int count = map.get(c);
                if (count == 1) map.remove(c);
                else map.put(c, count - 1);
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
```

## 12.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;
        int start = 0, end = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            if (map.size() <= k) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);
                end++;
            }
            if (map.size() > k) {
                char c = s.charAt(start);
                int count = map.get(c);
                if (count == 1) map.remove(c);
                else map.put(c, count - 1);
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
```

## 13.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;
        int start = 0, end = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            if (map.size() <= k) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);
                end++;
            }
            if (map.size() > k) {
                char c = s.charAt(start);
                int count = map.get(c);
                if (count == 1) map.remove(c);
                else map.put(c, count - 1);
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
```

## 14.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

For example, Given s = “eceba” and k = 2,

T is "ece" which its length is 3.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;
        int start = 0, end = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            if (map.size() <= k) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);
                end++;
            }
            if (map.size() > k) {
                char c = s.charAt(start);
                int count = map.get(c);
                if (count
