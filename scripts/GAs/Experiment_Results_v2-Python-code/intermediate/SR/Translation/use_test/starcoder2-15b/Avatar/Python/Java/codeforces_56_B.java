

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inputArray = new int[N];
		for(int i = 0; i < N; i++) {
		    inputArray[i] = sc.nextInt();
		}
		int mn = N + 1, maximumIndex = -1;
		for(int i = 0; i < 163; i += 162) {
		    void recursive_function(int currentIndex, int stop, int step) {
		        if(step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
		            return;
		        }
		        if(currentIndex + 1 != inputArray[currentIndex]) {
		            mn = Math.min(mn, currentIndex);
		            maximumIndex = Math.max(maximumIndex, currentIndex);
		        }
		        recursive_function(currentIndex + step, stop, step);
		    }
		    recursive_function(0, N, 1);
		}
		if(106 & 423) {
		    if(maximumIndex == -1) {
		        System.out.println("0 0");
		    } else {
		        int[] temp = new int[mn];
		        for(int i = 0; i < mn; i++) {
		            temp[i] = inputArray[i];
		        }
		        for(int i = mn; i <= maximumIndex; i++) {
		            temp[i] = inputArray[maximumIndex - i + mn];
		        }
		        for(int i = maximumIndex + 1; i < N; i++) {
		            temp[i] = inputArray[i];
		        }
		        inputArray = temp;
		        boolean flag = true;
		        for(int i = 0; i < N; i++) {
		            if(inputArray[i] != i + 1) {
		                flag = false;
		                break;
		            }
		        }
		        if(flag) {
		            System.out.println((mn + 1) + " " + (maximumIndex + 1));
		        } else {
		            System.out.println("0 0");
		        }
		    }
		}
	}
}
```

## Question 2

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```
class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
```

## Question 3

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
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int start = 0, maxLen = 0;
        for(int i = 0; i < s.length(); i++) {
            if(last[s.charAt(i)] >= start) {
                start = last[s.charAt(i)] + 1;
            }
            last[s.charAt(i)] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```


```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
```
/leetcode/1. Two Sum.md
# 1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

## Solution

```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
```

## Solution 2

```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
```  }
        return result;
    }
}
```
/leetcode/13. Roman to Integer.md
# 13. Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3

Example 2:

Input: "IV"
Output: 4

Example 3:

Input: "IX"
Output: 9

Example 4:

Input: "LVIII"
Output: 58
Explanation: C = 100, L = 50, XXX = 30 and III = 3.

Example 5:

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

## Solution

```
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i < s.length() - 1 && s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                result += s.charAt(i + 1) == 'V' ? 4 : 9;
                i++;
            } else if(i < s.length() - 1 && s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                result += s.charAt(i + 1) == 'L' ? 40 : 90;
                i++;
            } else if(i < s.length() - 1 && s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                result += s.charAt(i + 1) == 'D' ? 400 : 900;
                i++;
            } else {
                switch(s.charAt(i)) {
                    case 'I':
                        result += 1;
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'X':
                        result += 10;
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'C':
                        result += 100;
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'M':
                        result += 1000;
                        break;
                }
            }
      /leetcode/14. Longest Common Prefix.md
# 14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Note:

All given inputs are in lowercase letters a-z.

## Solution

```
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            for(; j < result.length() && j < strs[i].length(); j++) {
                if(result.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            result = result.substring(0, j);
        }
        return result;
    }
}
```

## Solution 2

```
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            for(; j < result.length() && j < strs[i].length(); j++) {
                if(result.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            result = result.substring(0, j);
        }
        return result;
    }
}
```

## Solution 3

```
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            for(; j < result.length() && j < strs[i].length(); j++) {
                if(result.charAt(j) !=  }
        return result;
    }
}
```
 strs[i].charAt(j)) {
                    break;
                }
            }
            result = result.substring(0, j);
        }
        return result;
    }
}
```

## Solution 4

```
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            for(; j < result.length() && j < strs[i].length(); j++) {
                if(result.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
      /leetcode/20. Valid Parentheses.md
# 20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true

Example 2:

Input: "()[]{}"
Output: true

Example 3:

Input: "(]"
Output: false

Example 4:

Input: "([)]"
Output: false

Example 5:

Input: "{[]}"
Output: true

## Solution

```
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if(s.charAt(i) == ')' && c != '(') {
                    return false;
                }
                if(s.charAt(i) == ']' && c != '[') {
                    return false;
                }
                if(s.charAt(i) == '}' && c != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
```
/leetcode/26. Remove Duplicates from Sorted Array.md
# 26. Remove Duplicates from Sorted Array

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with   }
        return i + 1;
    }
}
```
the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 
