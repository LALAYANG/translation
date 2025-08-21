

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int max_length = Math.max(a.length(), b.length());
        a = String.format("%" + max_length + "s", a).replace(' ', '0');
        b = String.format("%-" + max_length + "s", b).replace(' ', '0');
        String s = "";
        int c = 0;
        for (int i = 0; i < max_length; i++) {
            int d = Integer.parseInt(b.substring(i, i + 1)) + Integer.parseInt(a.substring(max_length - i - 1, max_length - i)) + c;
            if (d > 9) {
                s += String.valueOf(d).substring(1);
                c = 1;
            } else {
                s += String.valueOf(d);
                c = 0;
            }
        }
        if (c == 1) {
            s = "1" + s;
        }
        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString()));
    }
}
```

## 2. 2019-09-10

### 2.1. 题目

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

### 2.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        int length = s.length();
        Set<Character> set = new HashSet<>();
        while (start < length && end < length) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                max = Math.max(max, end - start);
            } else {
                set.remove(s.charAt(start++));
            }
        }
        return max;
    }
}
```

## 3. 2019-09-11

### 3.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 3.2. 解答

```java
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

## 4. 2019-09-12

### 4.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 4.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int max = 0;
        int start = 0;
        int end = 0;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        while (start < length && end < length) {
            if (map.size() <= k) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (map.size() <= k) {
                    max = Math.max(max, end - start + 1);
                }
                end++;
            }
            if (map.size() > k) {
                char c = s.charAt(start);
                int count = map.get(c);
                if (count == 1) {
                    map.remove(c);
                } else {
                    map.put(c, count - 1);
                }
                start++;
            }
        }
        return max;
    }
}
```

## 5. 2019-09-13

### 5.1. 题目

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

### 5.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        int length = s.length();
        Set<Character> set = new HashSet<>();
        while (start < length && end < length) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                max = Math.max(max, end - start);
            } else {
                set.remove(s.charAt(start++));
            }
        }
        return max;
    }
}
```

## 6. 2019-09-14

### 6.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 6.2. 解答

```java
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

## 7. 2019-09-15

### 7.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 7.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int max = 0;
        int start = 0;
        int end = 0;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        while (start < length && end < length) {
            if (map.size() <= k) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (map.size() <= k) {
                    max = Math.max(max, end - start + 1);
                }
                end++;
            }
            if (map.size() > k) {
                char c = s.charAt(start);
                int count = map.get(c);
                if (count == 1) {
                    map.remove(c);
                } else {
                    map.put(c, count - 1);
                }
                start++;
            }
        }
        return max;
    }
}
```

## 8. 2019-09-16

### 8.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 8.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int max = 0;
        int start = 0;
        int end = 0;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        while (start < length && end < length) {
            if (map.size() <= k) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (map.size() <= k) {
                    max = Math.max(max, end - start + 1);
                }
                end++;
            }
            if (map.size() > k) {
                char c = s.charAt(start);
                int count = map.get(c);
                if (count == 1) {
                    map.remove(c);
                } else {
                    map.put(c, count - 1);
                }
                start++;
            }
        }
        return max;
    }
}
```

## 9. 2019-09-17

### 9.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 9.2. 解答

```java
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

## 10. 2019-09-18

### 10.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 10.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int max = 0;
        int start = 0;
        int end = 0;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        while (start < length && end < length) {
            if (map.size() <= k) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (map.size() <= k) {
                    max = Math.max(max, end - start + 1);
                }
                end++;
            }
            if (map.size() > k) {
                char c = s.charAt(start);
                int count = map.get(c);
                if (count == 1) {
                    map.remove(c);
                } else {
                    map.put(c, count - 1);
                }
                start++;
            }
        }
        return max;
    }
}
```

## 11. 2019-09-19

### 11.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 11.2. 解答

```java
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

## 12. 2019-09-20

### 12.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 12.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int max = 
