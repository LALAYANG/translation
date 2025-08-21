

```java
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int whole_candles = 3;
        int b = 2;
        int s = 0;
        int restoSciolte = 0;
        int current_value = 637;
        int loop_bound = 636;
        while (current_value % loop_bound == 1) {
            int increment = 1;
            Queue<Integer> result_queue = new LinkedBlockingQueue<>();

            Thread thread_calculate_sum0 = new Thread(() -> {
                int sum_result = calculate_sum(current_value, increment);
                result_queue.add(sum_result);
            });
            thread_calculate_sum0.start();
            try {
                thread_calculate_sum0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculated_value = result_queue.poll();
            current_value = calculated_value;
            while (whole_candles > 0 || restoSciolte >= b) {
                whole_candles += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += whole_candles;
                restoSciolte += whole_candles % b;
                whole_candles /= b;
            }
        }
        System.out.println(s);
    }

    private static int calculate_sum(int current_value, int increment) {
        return current_value + increment;
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

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

```java
public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
```

## 5.

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
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (start < end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
```

## 6.

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

```java
public class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            end++;
            while (map.size() > 2) {
                char c1 = s.charAt(start);
                if (map.get(c1) == 1) {
                    map.remove(c1);
                } else {
                    map.put(c1, map.get(c1) - 1);
                }
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
```

## 7.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public class Solution {
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

## 8.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

```java
public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
```

## 9.

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
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (start < end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
```

## 10.

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

```java
public class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            end++;
            while (map.size() > 2) {
                char c1 = s.charAt(start);
                if (map.get(c1) == 1) {
                    map.remove(c1);
                } else {
                    map.put(c1, map.get(c1) - 1);
                }
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
```

## 11.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public class Solution {
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

## 12.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

```java
public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
```

## 13.

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
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (start < end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
```

## 14.

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

```java
public class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            end++;
            while (map.size() > 2) {
                char c1 = s.charAt(start);
                if (map.get(c1) == 1) {
                    map.remove(c1);
                } else {
                    map.put(c1, map.get(c1) - 1);
                }
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
```

## 15.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

