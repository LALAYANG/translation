

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int t = l;
            while (t <= r) {
                int next_val = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                comp[t - 1] = r + 1 > t ? r + 1 : x;
                t = next_val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}

```

## 2. 1000000007

Given a number N, find the number of trailing zeros in N!

Input:
The first line contains T, the number of test cases. Each test case contains a number N.

Output:
For each test case, print the answer in a new line.

Constraints:
1 <= T <= 1000
1 <= N <= 1000000000

Sample Input:
2
3
6

Sample Output:
0
1

Explanation:
3! = 6, no trailing zero. 6! = 720, one trailing zero.

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 5; j <= n; j *= 5) {
                count += n / j;
            }
            System.out.println(count);
        }
    }
}

```

## 3. Longest Common Subsequence

Given two strings str1 and str2, find the length of the longest common subsequence.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two space separated strings.

Output:
For each test case, print the length of the longest common subsequence.

Constraints:
1 <= T <= 100
1 <= |str1|, |str2| <= 100

Sample Input:
2
6 6
ABCDGH LCSKD
3 2
ABC XYZ

Sample Output:
4
0

Explanation:
LCS for input Sequences “ABCDGH” and “LCSKD” is “CDGH” of length 4.
LCS of “ABC” and “XYZ” is “” of length 0.

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            int[][] dp = new int[n + 1][m + 1];
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    if (str1.charAt(j - 1) == str2.charAt(k - 1)) {
                        dp[j][k] = dp[j - 1][k - 1] + 1;
                    } else {
                        dp[j][k] = Math.max(dp[j - 1][k], dp[j][k - 1]);
                    }
                }
            }
            System.out.println(dp[n][m]);
        }
    }
}

```

## 4. Longest Increasing Subsequence

Given a sequence A of size N, find the length of the longest increasing subsequence from a given sequence .
The longest increasing subsequence means to find a subsequence of a given sequence in which the subsequence's elements are in sorted order, lowest to highest, and in which the subsequence is as long as possible. This subsequence is not necessarily contiguous, or unique.

Note: Duplicate numbers are not counted as increasing subsequence.

Input:
The first line contains an integer T, depicting total number of test cases. Then following T lines contains an integer N depicting the size of array and next line followed by the value of array.

Output:
For each testcase, in a new line, print the Max length of the subsequence in a separate line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
0 ≤ A[i] ≤ 300

Example:
Input:
2
16
0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15
6
5 8 3 7 9 1

Output:
6
3

Explanation:
Testcase 1: Longest increasing subsequence is 0 2 6 9 13 15, which has length 6

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int[] dp = new int[n];
            Arrays.fill(dp, 1);
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    if (arr[j] > arr[k]) {
                        dp[j] = Math.max(dp[j], dp[k] + 1);
                    }
                }
            }
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dp[j]);
            }
            System.out.println(max);
        }
    }
}

```

## 5. Longest Common Substring

Given two strings X and Y. The task is to find the length of the longest common substring.

Input:
First line of the input contains number of test cases T. Each test case consist of three lines, first of which contains 2 space separated integers N and M denoting the size of string X and Y strings respectively. The next two lines contains the string X and Y.

Output:
For each test case print the length of longest  common substring of the two strings .

Constraints:
1 <= T <= 200
1 <= N, M <= 100

Example:
Input:
2
6 6
ABCDGH
ACDGHR
3 2
ABC
AC

Output:
4
1

Explanation:
Testcase 1: CDGH is the longest substring present in both of the strings.

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            int[][] dp = new int[n + 1][m + 1];
            int max = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    if (str1.charAt(j - 1) == str2.charAt(k - 1)) {
                        dp[j][k] = dp[j - 1][k - 1] + 1;
                        max = Math.max(max, dp[j][k]);
                    } else {
                        dp[j][k] = 0;
                    }
                }
            }
            System.out.println(max);
        }
    }
}

```

## 6. Longest Palindromic Subsequence

Given a sequence, find the length of the longest palindromic subsequence in it.

Input:
The first line of input contains an integer T, denoting no of test cases. Then T test cases follow. The first line of each test case is an integer N denoting the length of the string. The next line contains the string s consisting only of lower case english alphabets.

Output:
For each test case, in a new line, print the Max length of the longest palindrome subsequence.

Constraints:
1 <= T <= 100
1 <= N <= 1000

Example:
Input:
2
6
bbabcb
3
bac

Output:
5
1

Explanation:
Testcase 1: The whole string itself is the palindrome.

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            int[][] dp = new int[n][n];
            for (int j = 0; j < n; j++) {
                dp[j][j] = 1;
            }
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < n - j; k++) {
                    if (str.charAt(k) == str.charAt(k + j)) {
                        dp[k][k + j] = dp[k + 1][k + j - 1] + 2;
                    } else {
                        dp[k][k + j] = Math.max(dp[k + 1][k + j], dp[k][k + j - 1]);
                    }
                }
            }
            System.out.println(dp[0][n - 1]);
        }
    }
}

```

## 7. Longest Repeated Subsequence

Given a string str, find length of the longest repeating subseequence such that the two subsequence don’t have same string character at same position, i.e., any i’th character in the two subsequences shouldn’t have the same index in the original string.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains one line of input containing string str.

Output:
For each testcase, in a new line, print the length of longest repeating subsequence.

Constraints:
1 ≤ T ≤ 100
1 ≤ Str Length ≤ 100

Example:
Input:
2
abab
axxxy

Output:
2
1

Explanation:
Testcase 1: "ab" is the longest repeating subsequence

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            int n = str.length();
            int[][] dp = new int[n + 1][n + 1];
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (str.charAt(j - 1) == str.charAt(k - 1) && j != k) {
                        dp[j][k] = dp[j - 1][k - 1] + 1;
                    } else {
                        dp[j][k] = Math.max(dp[j - 1][k], dp[j][k - 1]);
                    }
                }
            }
            System.out.println(dp[n][n]);
        }
    }
}

```

## 8. Minimum number of deletions and insertions

Given two strings str1 and str2, find the minimum number of deletions and insertions to transform str1 into str2.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two space separated strings denoting the str1 and str2 respectively.

Output:
For each test case, print the minimum number of deletions and insertions separated by a space.

Constraints:
1 <= T <= 100
1 <= |str1|, |str2| <= 100

Example:
Input:
1
geek gesek

Output:
1 1

Explanation:
Testcase 1: One solution is:
Delete extra 'k' from str1 and insert it into str2 at the end.

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            int n = str1.length();
            int m = str2.length();
            int[][] dp = new int[n + 1][m + 1];
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    if (str1.charAt(j - 1) == str2.charAt(k - 1)) {
                        dp[j][k] = dp[j - 1][k - 1] + 1;
                    } else {
                        dp[j][k] = Math.max(dp[j - 1][k], dp[j][k - 1]);
                    }
                }
            }
            System.out.println((n - dp[n][m]) + " " + (m - dp[n][m]));
        }
    }
}

```

## 9. Longest Common Substring

Given two strings X and Y. The task is to find the length of the longest common substring.

Input:
First line of the input contains number of test cases T. Each test case consist of three lines, first of which contains 2 space separated integers N and M denoting the size of string X and Y strings respectively. The next two lines contains the string X and Y.

Output:
For each test case print the length of longest  common substring of the two strings .

Constraints:
1 <= T <= 200
1 <= N, M <= 100

Example:
Input:
2
6 6
ABCDGH
ACDGHR
3 2
ABC
AC

Output:
4
1

Explanation:
Testcase 1: CDGH is the longest substring present in both of the strings.

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            int[][] dp = new int[n + 1][m + 1];
            int max = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    if (str1.charAt(j - 1) == str2.charAt(k - 1)) {
                        dp[j][k] = dp[j - 1][k - 1] + 1;
                        max = Math.max(max, dp[j][k]);
                    } else {
                        dp[j
