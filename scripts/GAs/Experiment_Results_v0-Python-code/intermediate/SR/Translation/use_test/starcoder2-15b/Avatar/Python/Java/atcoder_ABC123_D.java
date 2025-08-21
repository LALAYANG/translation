

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
    }
}
ng.longestPalindrome("cbbd"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("a"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("ac"));
        System.out.println(longestPalindromicSubstring.longestPalindrome(""));
        System.out.println(longestPalindromicSubstring.longestPalindrome("bb"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abb"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abba"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("abcba"));
        System.out.println(longestPalindromicSubs  }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {1, 1, 1, 0, 1, 1, 1};
        int[] nums3 = {1, 0, 1, 1, 1};
        int[] nums4 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums5 = {1, 1, 1, 1, 1, 1, 0};
        int[] nums6 = {1, 1, 1, 1, 1, 0, 1};
        int[] nums7 = {1, 1, 1, 1, 0, 1, 1};
        int[] nums8 = {1, 1, 1, 0, 1, 1, 1};
        int[] nums9 = {1, 1, 0, 1, 1, 1, 1};
        int[] nums10 = {1, 0, 1, 1, 1, 1, 1};
        int[] nums11 = {0, 1, 1, 1, 1, 1, 1};
        int[] nums12 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums13 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums14 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums15 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums16 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums17 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums18 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums19 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums20 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums21 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums22 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums23 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums24 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums25 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums26 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums27 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums28 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums29 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums30 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums31 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums32 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums33 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums34 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums35 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums36 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums37 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums38 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums39 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums40 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums41 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums42 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums43 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums44 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums45 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums46 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums47 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums48 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums49 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums50 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums51 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums52 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums53 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums54 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums55 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums56 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums57 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums58 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums59 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums60 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums61 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums62 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums63 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums64 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums65 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums66 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums67 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums68 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums69 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums70 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums71 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums72 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums73 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums74 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums75 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums76 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums77 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums78 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums79 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums80 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums81 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums82 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums83 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums84 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums85 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums86 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums87 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums88 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums89 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums90 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums91 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums92 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums93 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums94 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums95 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums96 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums97 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums98 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums99 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums100 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums101 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums102 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums103 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums104 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums105 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums106 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums107 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums108 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums109 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums110 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums111 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums112 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums113 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums114 = {1, 1, 1, 1, 1, 1, 1};
        int[] nums
