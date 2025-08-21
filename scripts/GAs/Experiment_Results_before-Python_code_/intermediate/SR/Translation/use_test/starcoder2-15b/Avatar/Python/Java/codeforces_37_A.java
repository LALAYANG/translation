

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/Q1046.java
package com.leetcode.algorithm.easy;

import java.util.Arrays;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1046 {
    pu(int[] arr) {
        Arrays.sort(arr);
        int i = arr.length - 1;
        while (i > 0) {
            if (arr[i] == arr[i - 1]) {
                i -= 2;
            } else {
                return arr[i];
            }
        }
        return arr[0];
    }
}
blic int lastStoneWeight/src/main/java/com/leetcode/algorithm/easy/Q104.java
package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1002.java
package com.leetcode.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1002 {
    public List<String> commonChars(String[] A) {
        int[] minFreq = new int[26];
        for (int i = 0; i < A[0].length(); i++) {
            minFreq[A[0].charAt(i) - 'a']++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] freq = new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                freq[A[i].charAt(j) - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], freq[j]);
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
 10:30
 */
public class Q1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for (int i = 0; i < A.length && K > 0; i++) {
            if (A[i] < 0) {
                A[i] = -A[i];
                K--;
            } else {
                break;
            }
        }
        if (K % 2 == 1) {
            Arrays.sort(A);
            A[0] = -A[0];
        }
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1005.java
package com.leetcode.algorithm.easy;

import java.util.Arrays;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int i = 0;
        while (i < A.length && K > 0 && A[i] < 0) {
            A[i] = -A[i];
            K--;
            i++;
        }
        if (K % 2 == 1) {
            Arrays.sort(A);
            A[0] = -A[0];
        }
        int sum = 0;
        for (int j = 0; j < A.length; j++) {
            sum += A[j];
        }
        return sum;
    }
}

/**
 * @author 
 * @date 2020/10/14/src/main/java/com/leetcode/algorithm/easy/Q1013.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int part = sum / 3;
        int count = 0;
        int cur = 0;
        for (int i = 0; i < A.length; i++) {
            cur += A[i];
            if (cur == part) {
                count++;
                cur = 0;
            }
        }
        return count >= 3;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1021.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBu  if (S.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                sb.append(S.substring(start + 1, i));
                start = i + 1;
            }
        }
        return sb.toString();
    }
}
ilder();
        int count = 0;
        int start = 0;
        for (int i = 0; i < S.length(); i++) {
            }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1009.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1009 {
    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        int res = 0;
        int i = 0;
        while (N > 0) {
            res += (N & 1) ^ 1 << i++;
            N >>= 1;
        }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1025.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:30
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
  /src/main/java/com/leetcode/algorithm/easy/Q1010.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1010 {
    }
        return res;
    }
}
  public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        int res = 0;
        for (int i = 0; i < time.length; i++) {
            int t = time[i] % 60;
            res += count[(60 - t) % 60];
            count[t]++;
      /src/main/ 0;
        int j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                res++;
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }
}
java/com/leetcode/algorithm/easy/Q1009.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1009 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int res = 0;
        int i = 0;
        int[] count = new int[100];
        for (int[] dominoe : dominoes) {
            int val = Math.min(dominoe[0], dominoe[1]) * 10 + Math.max(dominoe[0], dominoe[1]);
            res += count[val];
            count[val]++;
        }
        return res;
    }

    public int numEquivDominoPairs2(int[][] dominoes) {
        int[] A = new int[dominoes.length];
        int[] B = new int[dominoes.length];
        for (int i = 0; i < dominoes.length; i++) {
            A[i] = Math.min(dominoes[i][0], dominoes[i][1]);
            B[i] = Math.max(dominoes[i][0], dominoes[i][1]);
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int res = 0;
        int i =  }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1007.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1007 {
    public int minDominoRotations(int[] A, int[] B) {
        int res = -1;
        for (int i = 1; i <= 6; i++) {
            int a = 0;
            int b = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] != i && B[j] != i) {
                    break;
                }
                if (A[j] != i) {
                    a++;
                }
                if (B[j] != i) {
                    b++;
                }
                if (j == A.length - 1) {
                    res = Math.min(res == -1 ? Integer.MAX_VALUE : res, Math.min(a, b));
                }
            }
      /src/main/java/com/leetcode/algorithm/easy/Q1016.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1016 {
    public boolean queryString(String S, int N) {
        for (int i = 1; i <= N; i++) {
            if (!S.contains(Integer.toBinaryString(i))) {
                return false;
            }
        }
        return true;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1018.java
package com.leetcode.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int cur = 0;
        for (int i = 0; i < A.length; i++) {
            cur = (cur * 2 + A[i]) % 5;
            res.add(cur == 0);
        }
        return res;
    }

    public List<Boolean> prefixesDivBy52(int[] A) {
        List<Boolean> res = new <>();
        int cur = 0;
        for (int i = 0; i < A.length; i++) {
            cur = (cur << 1 + A[i]) % 5;
            res.add(cur == 0);
        }
        return res;
    }
}
ArrayList/src/main/java/com/leetcode/algorithm/easy/Q1011.java
package com.leetcode.algorithm.easy;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1011 {
    public int shipWithinDays(int[] weights, int D) {
        int left = 0;
        int right = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, D, mid)) {
                right = mid;
            } else {
                left =  }
        return true;
    }
}
 mid + 1;
            }
        }
        return left;
    }

    private boolean canShip(int[] weights, int D, int capacity) {
        int i = 0;
        int cur = 0;
        while (i < weights.length) {
            if (cur + weights[i] > capacity) {
                D--;
                cur = 0;
            }
            if (D == 0) {
                return false;
            }
            cur += weights[i++];
        }
        return res;
    }
}
/src/main/java/com/leetcode/algorithm/easy/Q1008.java
package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

/**
 * @author 
 * @date 2020/10/14 10:30
 */
public class Q1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, 0, preorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[left]);
        int i = left + 1;
        while (i <= right && preorder[i] < preorder[left]) {
            i++;
        }
        root.left = build(preorder, left + 1, i - 1);
        root.right = build(preorder, i, right);
        return root;
    }

    public TreeNode bstFromPreorder2(int[] preorder) {
        TreeNode root = null;
        for (int i = 0; i < preorder.length; i
