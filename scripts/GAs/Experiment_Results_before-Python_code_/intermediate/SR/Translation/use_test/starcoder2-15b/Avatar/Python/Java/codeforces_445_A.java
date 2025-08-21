

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] l = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '.') {
                    if ((i + j) % 2 == 0) {
                        l[i][j] = 'B';
                    } else {
                        l[i][j] = 'W';
                    }
                } else {
                    l[i][j] = s.charAt(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(l[i][j]);
            }
            System.out.println();
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/Q1046.java
package com.leetcode.algorithm.easy;

import java.util.Arrays;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1046 {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        while (stones.length > 1) {
            int a = stones[stones.length - 1];
            int b = stones[stones.length - 2];
            if (a == b) {
                stones = Arrays.copyOfRange(stones, 0, stones.length - 2);
            } else {
                stones[stones.length - 2] = a - b;
                stones = Arrays.copyOfRange(stones, 0, stones.length - 1);
            }
            Arrays.sort(stones);
        }
        return stones.length == 0 ? 0 : stones[0];
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q104.java
package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class ht(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
Q104 {
    public int maxDep/src/main/java/com/leetcode/algorithm/easy/Q1002.java
package com.leetcode.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1002 {
    public List<String> commonChars(String[] A) {
        int[] minFreq = new int[26];
        for (int i = 0; i < 26; i++) {
            minFreq[i] = Integer.MAX_VALUE;
        }
        for (String s : A) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                res.add(String.valueOf((char) (i + 'a')));
            }
        }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1047.java
package com.leetcode.algorithm.easy;

import java.util.Stack;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1047 {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
  }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1021.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1021 {
    public String removeOuterParentheses(String S) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
            }
            if (count != 0) {
                sb.append(c);
            }
        }
        String res = sb.toString();
        if (res.length() > 0) {
            return res;
      /src/main/java/com/leetcode/algorithm/easy/Q1005.java
package com.leetcode.algorithm.easy;

import java.util.Arrays;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int i = 0;
        while (i < A.length && K > 0 && A[i] < 0) {
            A[i] = -A[i];
            i++;
            K--;
        }
        if (K % 2 == 1) {
            Arrays.sort(A);
            A[0] = -A[0];
        }
        int res = 0;
        for (int a : A) {
            res += a;
        }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1013.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int a  0;
        int count = 0;
        for (int a : A) {
            sum += a;
            if (sum == target) {
                count++;
                sum = 0;
            }
        }
        return count >= 3;
    }
}
: A) {
            sum += a;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum =  }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1009.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1009 {
    public int bitwiseComplement(int N) {
        int res = 0;
        int i = 0;
        while (N > 0) {
            if ((N & 1) == 0) {
                res += 1 << i;
            }
            i++;
            N >>= 1;
        }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1025.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1025 {
    public boolean divisorGame(int N) {
        boolean[] dp = new boolean[N + 1];
        dp[1] = false;
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0 && !dp[i - j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[N];
  /src/main/java/com/leetcode/algorithm/easy/Q1018.java
package com.leetcode.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 * 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count == 3) {
                res.add(i - 2);
            }
        }
        return res;
    }
}
 @date 2020/10/14 10:46
 */
public class Q1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int num = 0;
        for (int a : A) {
            num = (num * 2 + a) % 5;
            res.add(num == 0);
        }
        int count =/src/main/ 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                count++;
            } else {
                count = 0;
            }
            if (count == 3) {
                res.add(i - 2);
            }
        }
        return res;
    }
}
java/com/leetcode/algorithm/easy/Q1004.java
package com.leetcode.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1004 {
    public List<Integer> longestOnes(int[] A, int K) {
        int count =  }
}
/src/main/java/com/leetcode/algorithm/easy/Q1010.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1010 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    public int numSquares2(int n) {
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }
        for (int i = 0; i * i <= n; i++) {
            int j = (int) Math.sqrt(n - i * i);
            if (i * i + j * j == n) {
                return i == 0 ? 1 : 2;
            }
        }
        return 3;
    }

    public int numSquares3(int n) {
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }
        for (int i = 0; i * i <= n; i++) {
            int j = (int) Math.sqrt(n - i * i);
            if (i * i + j * j == n) {
                return i == 0 ? 1 : 2;
            }
        }
        return 3;
    }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1008.java
package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[start]);
        int i = start + 1;
        while (i <= end && preorder[i] < preorder[start]) {
            i++;
        }
        root.left = helper(preorder, start + 1, i - 1);
        root.right = helper(preorder, i, end);
        return root;
    }

    public TreeNode bstFromPreorder2(int[] preorder) {
        TreeNode root = null;
        for (int i = 0; i < preorder.length; i++) {
            root = insertIntoBST(root, preorder[i]);
        }
        return root;
    }

    private TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public TreeNode bstFromPreorder3(int[] preorder) {
        TreeNode res = null;
        for (int i = 0; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            res = insertIntoBST(res, node);
        }
        return res;
    }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1016.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:46
 */
public class Q1016 {
    public boolean queryString(String S, int N) {
        for (int i = 1; i <= N; i++) {
            String binary = Integer.toBinaryString(i);
            if (!S.contains(binary)) {
                return false;
            }
        }
        return true;
    }

    public boolean queryString2(String S, int N) {
        for (int i = 1; i <= N; i++) {
            int num = i;
            StringBuilder sb = new StringBuilder();
            while (num > 0) {
                sb.append(num % 2);
                num /= 2;
            }
            if (!S.contains(sb.toString())) {
                return false;
            }
        }
        return true;
    }

    public boolean queryString3(String S, int N) {
        for (int i = 1; i <= N; i++) {
            int num = i;
            StringBuilder sb = new StringBuilder();
            while (num > 0) {
                sb.append(num % 2);
                num /= 2;
            }
            if (!S.contains(sb.toString())) {
                return false;
            }
        }
        return true;
    }

    public boolean queryString4(String S, int N) {
        for (int i = 1; i <= N; i++) {
            int num = i;
            StringBuilder sb = new StringBuilder();
            while (num > 0) {
                sb.append(num % 2);
                num /= 2;
            }
            if (!S.contains(sb.toString())) {
                return false;
            }
        }
        return true;
    }

    public boolean queryString5(String S, int N) {
        boolean res = true;
        for (int i = 1; i <= N; i++) {
            int num = i;
            StringBuilder sb = new StringBuilder();
            while (
