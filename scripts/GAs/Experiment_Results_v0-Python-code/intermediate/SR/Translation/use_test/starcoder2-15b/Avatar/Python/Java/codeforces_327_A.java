

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.replace("", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> zeroIndices = IntStream.range(0, s.length()).filter(i -> s.charAt(i) == '0')
                    .boxed().collect(Collectors.toList());
            if (zeroIndices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                List<List<Integer>> combs = new ArrayList<>();
                for (int i = 0; i < zeroIndices.size(); i++) {
                    for (int j = i + 1; j < zeroIndices.size(); j++) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(zeroIndices.get(i));
                        temp.add(zeroIndices.get(j));
                        combs.add(temp);
                    }
                }
                for (List<Integer> x : combs) {
                    maximum = Math.max(maximum, 2 + 2 * (Math.abs(Collections.indexOfAll(zeroIndices, x.get(0))
                            .get(0) - Collections.indexOfAll(zeroIndices, x.get(1)).get(0))) - (Math.abs(x.get(0) - x.get(1)) - 1));
                }
                System.out.println(s.chars().filter(ch -> ch == '1').count() + maximum);
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
class Solution {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
```

## 3.

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

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
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
Note: You may assume the string contain only lowercase letters.

```
class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
```

## 5.

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false

```
class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        char cHead;
        char cTail;
        while (head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}
```

## 6.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }
        int[] map = new int[256];
        int start = 0, end = 0, max = 0, counter = 0;
        while (end < s.length()) {
            if (map[s.charAt(end)] == 0) {
                counter++;
            }
            map[s.charAt(end)]++;
            end++;
            while (counter > k) {
                map[s.charAt(start)]--;
                if (map[s.charAt(start)] == 0) {
                    counter--;
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

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
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
Note: You may assume the string contain only lowercase letters.

```
class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
```

## 9.

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false

```
class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        char cHead;
        char cTail;
        while (head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}
```

## 10.

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }
        int[] map = new int[256];
        int start = 0, end = 0, max = 0, counter = 0;
        while (end < s.length()) {
            if (map[s.charAt(end)] == 0) {
                counter++;
            }
            map[s.charAt(end)]++;
            end++;
            while (counter > k) {
                map[s.charAt(start)]--;
                if (map[s.charAt(start)] == 0) {
                    counter--;
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

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }
        int[] map = new int[256];
        int start = 0, end = 0, max = 0, counter = 0;
        while (end < s.length()) {
            if (map[s.charAt(end)] == 0) {
                counter++;
            }
            map[s.charAt(end)]++;
            end++;
            while (counter > k) {
                map[s.charAt(start)]--;
                if (map[s.charAt(start)] == 0) {
                    counter--;
                }
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

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }
        int[] map = new int[256];
        int start = 0, end = 0, max = 0, counter = 0;
        while (end < s.length()) {
            if (map[s.charAt(end)] == 0) {
                counter++;
            }
            map[s.charAt(end)]++;
            end++;
            while (counter > k) {
                map[s.charAt(start)]--;
                if (map[s.charAt(start)] == 0) {
                    counter--;
                }
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
```

## 13.

Given a string, find the length of the longest substring T that contains at
