

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] global_array = new int[1];
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculate_product(N, global_array));
        int m = future.get();
        int[] f = new int[N];
        process_input(0, scanner.nextInt(), 1, scanner, f);
        int a = 0;
        int b = 0;
        int c = 0;
        calculate_min_pairs(0, N, 1, c, b, a, m, f);
        System.out.println(c);
    }

    private static int calculate_product(int N, int[] global_array) {
        return global_array[0] * N;
    }

    private static void process_input(int i, int stop, int step, Scanner scanner, int[] f) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String operation_type = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt() + 1;
        if (operation_type.equals("M")) {
            m[a] += 2;
            m[b] -= 2;
        } else {
            f[a] += 2;
            f[b] -= 2;
        }
        process_input(i + step, stop, step, scanner, f);
    }

    private static void calculate_min_pairs(int i, int stop, int step, int c, int b, int a, int m, int[] f) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a += m[i];
        b += f[i];
        if (Math.min(a, b) > c) {
            c = Math.min(a, b);
        }
        calculate_min_pairs(i + step, stop, step, c, b, a, m, f);
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
        int[] lastSeen = new int[256];
        Arrays.fill(lastSeen, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastSeen[c] >= start) {
                start = lastSeen[c] + 1;
            }
            lastSeen[c] = i;
            max = Math.max(max, i - start + 1);
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
        int[] lastSeen = new int[256];
        Arrays.fill(lastSeen, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastSeen[c] >= start) {
                start = lastSeen[c] + 1;
            }
            lastSeen[c] = i;
            max = Math.max(max, i - start + 1);
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
        int[] count = new int[256];
        int num = 0, i = 0, j = 0, max = 0;
        while (j < s.length()) {
            if (count[s.charAt(j++)]++ == 0) num++;
            while (num > k) {
                if (count[s.charAt(i++)]-- == 1) num--;
            }
            max = Math.max(max, j - i);
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
        int[] lastSeen = new int[256];
        Arrays.fill(lastSeen, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastSeen[c] >= start) {
                start = lastSeen[c] + 1;
            }
            lastSeen[c] = i;
            max = Math.max(max, i - start + 1);
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
        int[] count = new int[256];
        int num = 0, i = 0, j = 0, max = 0;
        while (j < s.length()) {
            if (count[s.charAt(j++)]++ == 0) num++;
            while (num > k) {
                if (count[s.charAt(i++)]-- == 1) num--;
            }
            max = Math.max(max, j - i);
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
        int[] count = new int[256];
        int num = 0, i = 0, j = 0, max = 0;
        while (j < s.length()) {
            if (count[s.charAt(j++)]++ == 0) num++;
            while (num > k) {
                if (count[s.charAt(i++)]-- == 1) num--;
            }
            max = Math.max(max, j - i);
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
        int[] count = new int[256];
        int num = 0, i = 0, j = 0, max = 0;
        while (j < s.length()) {
            if (count[s.charAt(j++)]++ == 0) num++;
            while (num > k) {
                if (count[s.charAt(i++)]-- == 1) num--;
            }
            max = Math.max(max, j - i);
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
        int[] count = new int[256];
        int num = 0, i = 0, j = 0, max = 0;
        while (j
