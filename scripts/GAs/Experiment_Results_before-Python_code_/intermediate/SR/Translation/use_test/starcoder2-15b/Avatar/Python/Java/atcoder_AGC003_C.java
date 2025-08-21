

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int d = (A[i] % N) % 2;
            if (d % 2 != i % 2) {
                cnt++;
            }
        }
        System.out.println(cnt / 2);
    }
}

```

## 2. 1000000007

### 2.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 2.2. Input

The input consists of a single integer N.

### 2.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 2.4. Constraints

1 ≤ N ≤ 10^18

### 2.5. Sample Input

```
10
```

### 2.6. Sample Output

```
7
```

### 2.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 2.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 3. 1000000008

### 3.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 3.2. Input

The input consists of a single integer N.

### 3.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 3.4. Constraints

1 ≤ N ≤ 10^18

### 3.5. Sample Input

```
10
```

### 3.6. Sample Output

```
7
```

### 3.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 3.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 4. 1000000009

### 4.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 4.2. Input

The input consists of a single integer N.

### 4.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 4.4. Constraints

1 ≤ N ≤ 10^18

### 4.5. Sample Input

```
10
```

### 4.6. Sample Output

```
7
```

### 4.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 4.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 5. 1000000010

### 5.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 5.2. Input

The input consists of a single integer N.

### 5.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 5.4. Constraints

1 ≤ N ≤ 10^18

### 5.5. Sample Input

```
10
```

### 5.6. Sample Output

```
7
```

### 5.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 5.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```
/src/main/java/com/leetcode/problemset/algorithms/easy/Q1001.java
package com.leetcode.problemset.algorithms.easy;

import java.util.Arrays;

/**
 * @author 
 * @date 2020-03-01 10:20
 */
public class Q1001 {
    public int gridIllumination(int N, int[][] lamps, int[][] queries) {
        int[] row = new int[N];
        int[] col = new int[N];
        int[] diag = new int[2 * N - 1];
        int[] antiDiag = new int[2 * N - 1];
        boolean[][] light = new boolean[N][N];
        for (int[] lamp : lamps) {
            int x = lamp[0];
            int y = lamp[1];
            row[x]++;
            col[y]++;
            diag[x + y]++;
            antiDiag[x - y + N - 1]++;
            light[x][y] = true;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            if (row[x] > 0 || col[y] > 0 || diag[x + y] > 0 || antiDiag[x - y + N - 1] > 0) {
                ans[i] = 1;
            }
            for (int j = -1; j <= 1; j++) {
                for (int k = -1; k <= 1; k++) {
                    int nx = x + j;
                    int ny = y + k;
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && light[nx][ny]) {
                        row[nx]--;
                        col[ny]--;
                        diag[nx + ny]--;
                        antiDiag[nx - ny + N - 1]--;
                        light[nx][ny] = false;
                    }
                }
            }
        }
        return Arrays.stream(ans).sum();
    }
}
/src/main/java/com/leetcode/problemset/algorithms/easy/Q1002.java
package com.leetcode.problemset.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 * @date 2020-03-01 10:20
 */
public class Q1002 {
    public List<String> commonChars(String[] A) {
        int[] cnt = new int[26];
        for (char c : A[0].toCharArray()) {
            cnt[c - 'a']++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] tmp = new int[26];
            for (char c : A[i].toCharArray()) {
                tmp[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                cnt[j] = Math.min(cnt[j], tmp[j]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }
}
  }
        return ans;
    }
}
/src/main/java/com/leetcode/problemset/algorithms/easy/Q1003.java
package com.leetcode.problemset.algorithms.easy;

/**
 * @author 
 * @date 2020-03-01 10:20
 */
public class Q1003 {
    public boolean isValid(String S) {
        int[] cnt = new int[3];
        for (char c : S.toCharArray()) {
            cnt[c - 'a']++;
        }
        if (cnt[0] != cnt[1] || cnt[1] != cnt[2]) {
            return false;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        boolean ans = true;
        while (i < S.length()) {
            if (S.charAt(i) == 'a') {
                i++;
                j++;
            } else if (S.charAt(i) == 'b') {
                if (j > 0) {
                    i++;
                    j--;
                    k++;
                } else {
                    ans = false;
                    break;
                }
            } else {
                if (k > 0) {
                    i++;
                    k--;
                } else {
                    ans = false;
                    break;
                }
            }
      /src/main/java/com/leetcode/problemset/algorithms/easy/Q1004.java
package com.leetcode.problemset.algorithms.easy;

/**
 * @author 
 * @date 2020-03-01 10:20
 */
public class Q1004 {
    public int longestOnes(int[] A, int K) {
        int i = 0;
        int j = 0;
        int cnt = 0;
        int ans = 0;
        while (j < A.length) {
            if (A[j] == 0) {
                cnt++;
            }
            while (cnt > K) {
                if (A[i] == 0) {
                    cnt--;
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
/src/main/java/com/leetcode/problemset/algorithms/easy/Q1005.java
package com.leetcode.problemset.algorithms.easy;

import java.util.Arrays;

/**
 * @author 
 * @date 2020-03-01 10:20
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
        return Arrays.stream(A).sum();
    }
}
  }
        return ans;
    }
}
/src/main/java/com/leetcode/problemset/algorithms/easy/Q1006.java
package com.leetcode.problemset.algorithms.easy;

/**
 * @author 
 * @date 2020-03-01 10:20
 */
public class Q1006 {
    public int clumsy(int N) {
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = i + 1;
        }
        int i = 0;
        int j = N - 1;
        int ans = 0;
        while (i < j) {
            ans += A[i] * A[j];
            i++;
            j--;
            if (i < j) {
                ans -= A[i] / A[j];
                i++;
                j--;
            }
        }
        return ans;
    }
}
/src/main/java/com/leetcode/problemset/algorithms/easy/Q1007.java
package com.leetcode.problemset.algorithms.easy;

/**
 * @author 
 * @date 2020-03-01 10:20
 */
public class Q1007 {
    public int minDominoRotations(int[] A, int[] B) {
        int[] cntA = new int[7];
        int[] cntB = new int[7];
        int[] same = new int[7];
        for (int i = 0; i < A.length; i++) {
            cntA[A[i]]++;
            cntB[B[i]]++;
            if (A[i] == B[i]) {
                same[A[i]]++;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= 6; i++) {
            if (cntA[i] +
