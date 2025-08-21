

```java

```
/src/main/java/com/leetcode/problems/medium/LongestPalindromicSubstring.java
package com.leetcode.problems.medium;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
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

    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.longestPalindrome("babad"));
        System.out.println(longestPalindromicSubstritring.longestPalindrome("cbbd"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("a"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("ac"));
    }
}
ng.longestPalindrome("abba"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abb"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abbac"));
        System.out.println(longestPalindromicSubs  }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = new FindKClosestElements().findClosestElements(nums, 10, 0);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
/src/main/java/com/leetcode/problems/medium/FindKClosestElements.java
package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = arr.length - k;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = new FindClosestElements().findClosestElements(nums, 10, 0);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
/src/main/java/com/leetcode/problems/medium/FindClosestElements.java
package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class FindClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = arr.length - k;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public List<Integer> findClosestElements2(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = arr.length - k;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
      /src/main/java/com/leetcode/problems/medium/FindAllDuplicatesInAnArray.java
package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();
        int[] nums = {4, 3, 2tln(findAllDuplicatesInAnArray.findDuplicates(nums));
        nums = new int[]{1, 1, 2};
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(nums));
        nums = new int[]{1};
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(nums));
    }
}
, 7, 8, 2, 3, 1};
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(nums));
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(nums));
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(nums));
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(nums));
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(nums));
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(nums));
        System.out.prin/src/main/java/com/leetcode/problems/medium/FindAllAnagramsInAString.java
package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }
        int[] hash = new int[256];
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right++)]-- >= 1) {
                count--;
            }
            if (count == 0) {
                result.add(left);
            }
            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) {
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        System.out.println(findAllAnagramsInAString.findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "a"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "b"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ba"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
        System.out.println(findAllAnagramsIn
