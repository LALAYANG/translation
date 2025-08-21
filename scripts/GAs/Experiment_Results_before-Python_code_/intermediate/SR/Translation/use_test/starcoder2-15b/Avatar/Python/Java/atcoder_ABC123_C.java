

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(Math.ceil(N / (double) Math.min(A[0], A[1], A[2], A[3], A[4])) + 4);
    }
}

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
}
/src/main/java/com/leetcode/problems/medium/FindAllAnagramsInAString.java
package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }
   }
        return result;
    }
}
       int[] map = new int[256];
        for (char c : p.toCharArray()) {
            map[c]++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (map[s.charAt(right++)]-- >= 1) {
                count--;
            }
            if (count == 0) {
                result.add(left);
            }
            if (right - left == p.length() && map[s.charAt(left++)]++ >= 0) {
                count++;
            }
        }
        return result;
    }

    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }
        int[] map = new int[256];
        for (char c : p.toCharArray()) {
            map[c]++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (map[s.charAt(right++)]-- >= 1) {
                count--;
            }
            if (count == 0) {
                result.add(left);
            }
            if (right - left == p.length()) {
                if (map[s.charAt(left++)]++ >= 0) {
                    count++;
                }
            }
        }
        return result;
    }

    public List<Integer> findAnagrams3(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }
        int[] map = new int[256];
        for (char c : p.toCharArray()) {
            map[c]++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (map[s.charAt(right++)]-- >= 1) {
                count--;
            }
            if (count == 0) {
                result.add(left);
            }
            if (right - left == p.length()) {
                if (map[s.charAt(left++)]++ >= 0) {
                    count++;
                }
            }
        }
        return result;
    }

    public List<Integer> findAnagrams4(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }
        int[] map = new int[256];
        for (char c : p.toCharArray()) {
            map[c]++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (map[s.charAt(right++)]-- >= 1) {
                count--;
            }
            if (count == 0) {
                result.add(left);
            }
            if (right - left == p.length()) {
                if (map[s.charAt(left++)]++ >= 0) {
                    count++;
                }
            }
        }
        return result;
    }
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
      /src/main/java/com/leetcode/problems/medium/FindTheDuplicateNumber.java
package com.leetcode.problems.medium;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
/src/main/java/com/leetcode/problems/medium/FindAllTheLonelyNodes.java
package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheLonelyNodes {
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left !=t.right != null) {
            result.add(root.right.val);
        }
        helper(root.left, result);
        helper(root.right, result);
    }
}
 null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper(root.left, result);
        helper(root.right, result);
    }

    public List<Integer> getLonelyNodes2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper2(root, result);
        return result;
    }

    private void helper2(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper2(root.left, result);
        helper2(root.right, result);
    }

    public List<Integer> getLonelyNodes3(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper3(root, result);
        return result;
    }

    private void helper3(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper3(root.left, result);
        helper3(root.right, result);
    }

    public List<Integer> getLonelyNodes4(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper4(root, result);
        return result;
    }

    private void helper4(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper4(root.left, result);
        helper4(root.right, result);
    }

    public List<Integer> getLonelyNodes5(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper5(root, result);
        return result;
    }

    private void helper5(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper5(root.left, result);
        helper5(root.right, result);
    }

    public List<Integer> getLonelyNodes6(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper6(root, result);
        return result;
    }

    private void helper6(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper6(root.left, result);
        helper6(root.right, result);
    }

    public List<Integer> getLonelyNodes7(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper7(root, result);
        return result;
    }

    private void helper7(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper7(root.left, result);
        helper7(root.right, result);
    }

    public List<Integer> getLonelyNodes8(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper8(root, result);
        return result;
    }

    private void helper8(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper8(root.left, result);
        helper8(root.right, result);
    }

    public List<Integer> getLonelyNodes9(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper9(root, result);
        return result;
    }

    private void helper9(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper9(root.left, result);
        helper9(root.right, result);
    }

    public List<Integer> getLonelyNodes10(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper10(root, result);
        return result;
    }

    private void helper10(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.left != null && root.right != null) {
            result.add(root.left.val);
            result.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        helper10(root.left, result);
        helper10(root.right, result);
    }

    public List<Integer> getLonelyNodes11(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper11
