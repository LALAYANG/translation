

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int firstCondition = 586;
		int secondCondition = 475;
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] inputArray = new int[arraySize];
		for(int i = 0; i < arraySize; i++) {
			inputArray[i] = sc.nextInt();
		}
		int mn = arraySize + 1;
		int mx = -1;
		int loopEnd = 573;
		int loopStep = 572;
		for(int LoopIndexOut = 0; LoopIndexOut < loopEnd / loopStep; LoopIndexOut++) {
			recursiveFunc(0, arraySize, 1, inputArray, mn, mx);
		}
		if((firstCondition & secondCondition) != 0) {
			if(mx == -1) {
				System.out.println("0 0");
			} else {
				int[] temp = new int[mx - mn + 1];
				for(int i = 0; i < temp.length; i++) {
					temp[i] = inputArray[mn + i];
				}
				for(int i = 0; i < temp.length / 2; i++) {
					int temp2 = temp[i];
					temp[i] = temp[temp.length - 1 - i];
					temp[temp.length - 1 - i] = temp2;
				}
				for(int i = 0; i < temp.length; i++) {
					inputArray[mn + i] = temp[i];
				}
				boolean flag = true;
				for(int i = 0; i < inputArray.length - 1; i++) {
					if(inputArray[i] > inputArray[i + 1]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println(mn + 1 + " " + (mx + 1));
				} else {
					System.out.println("0 0");
				}
			}
		}
	}
	public static void recursiveFunc(int i, int stop, int step, int[] inputArray, int mn, int mx) {
		if(step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
			return;
		}
		if(i + 1 != inputArray[i]) {
			mn = Math.min(mn, i);
			mx = Math.max(mx, i);
		}
		recursiveFunc(i + step, stop, step, inputArray, mn, mx);
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
        char[] sArray = s.toCharArray();
        for(int i = 0; i < sArray.length / 2; i++) {
            char temp = sArray[i];
            sArray[i] = sArray[sArray.length - 1 - i];
            sArray[sArray.length - 1 - i] = temp;
        }
        return new String(sArray);
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
        int[] charIndex = new int[256];
        for(int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }
        int max = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            if(charIndex[s.charAt(i)] >= start) {
                start = charIndex[s.charAt(i)] + 1;
            }
            charIndex[s.charAt(i)] = i;
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
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
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
        if(s.length() == 0) {
            return "";
        }
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private int expandAroundCenter(String s, int left, int right) {
        int L = left;
        int R = right;
        while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
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
        if(s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(left < right) {
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
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

```
class Solution {
    public int firstUniqChar(String s) {
        int[] charIndex = new int[26];
        for(int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }
        for(int i = 0; i < s.length(); i++) {
            if(charIndex[s.charAt(i) - 'a'] == -1) {
                charIndex[s.charAt(i) - 'a'] = i;
            } else {
                charIndex[s.charAt(i) - 'a'] = -2;
            }
        }
        int min = s.length();
        for(int i = 0; i < charIndex.length; i++) {
            if(charIndex[i] >= 0) {
                min = Math.min(min, charIndex[i]);
            }
        }
        if(min == s.length()) {
            return -1;
        }
        return min;
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
        int[] charIndex = new int[256];
        for(int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }
        int max = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            if(charIndex[s.charAt(i)] >= start) {
                start = charIndex[s.charAt(i)] + 1;
            }
            charIndex[s.charAt(i)] = i;
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
        if(k == 0) {
            return 0;
        }
        int[] charIndex = new int[256];
        for(int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }
        int max = 0;
        int start = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(charIndex[s.charAt(i)] == -1) {
                count++;
            }
            charIndex[s.charAt(i)] = i;
            if(count > k) {
                while(count > k) {
                    if(charIndex[s.charAt(start)] == start) {
                        count--;
                    }
                    charIndex[s.charAt(start)] = -1;
                    start++;
                }
            }
            max = Math.max(max, i - start + 1);
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
        int[] charIndex = new int[256];
        for(int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }
        int max = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            if(charIndex[s.charAt(i)] >= start) {
                start = charIndex[s.charAt(i)] + 1;
            }
            charIndex[s.charAt(i)] = i;
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
        if(k == 0) {
            return 0;
        }
        int[] charIndex = new int[256];
        for(int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }
        int max = 0;
        int start = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(charIndex[s.charAt(i)] == -1) {
                count++;
            }
            charIndex[s.charAt(i)] = i;
            if(count > k) {
                while(count > k) {
                    if(charIndex[s.charAt(start)] == start) {
                        count--;
                    }
                    charIndex[s.charAt(start)] = -1;
                    start++;
                }
            }
            max = Math.max(max, i - start + 1);
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
        if(k == 0) {
            return 0;
        }
        int[] charIndex = new int[256];
        for(int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }
        int max = 0;
        int start = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(charIndex[s.charAt(i)] == -1) {
                count++;
            }
            charIndex[s.charAt(i)] = i;
            if(count > k) {
                while(count > k) {
                    if(charIndex[s.charAt(start)] == start) {
                        count--;
                    }
                    charIndex[s.charAt(
