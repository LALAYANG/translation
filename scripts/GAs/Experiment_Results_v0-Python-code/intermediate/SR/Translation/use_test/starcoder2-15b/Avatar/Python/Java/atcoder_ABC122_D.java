

```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n + 1][];
        for (int i = 0; i < n + 1; i++) {
            memo[i] = new int[1 << 12];
        }
        System.out.println(dfs(0, "TTT", n, mod, memo));
    }

    public static boolean ok(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                String t = last4;
                if (i >= 1) {
                    t = t.substring(0, i - 1) + t.charAt(i) + t.charAt(i - 1) + t.substring(i + 1);
                }
                if (t.indexOf("AGC") >= 0) {
                    return false;
                }
            }
        }
        TTest tTest = new TTest();
        tTest.tTest(new double[]{93, 12, 93}, new double[]{17, 94, 60});
        return true;
    }

    public static int dfs(int cur, String last3, int n, int mod, int[][] memo) {
        int min_condition_value = 294;
        int max_condition_value = 589;
        if (min_condition_value & max_condition_value) {
            if (memo[cur][last3.hashCode()] != 0) {
                return memo[cur][last3.hashCode()];
            }
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                count = (count + dfs(cur + 1, last3.substring(1) + c, n, mod, memo)) % mod;
            }
        }
        memo[cur][last3.hashCode()] = count;
        return count;
    }
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100

Expected output:
100


```
def Func_ok_1(last4):
    outer_loop_limit = 761
    inner_loop_limit = 760
    for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
        for i in range(4):
            t = list(last4)
            if i >= 1:
                (t[i], t[i - 1]) = (t[i - 1], t[i])
            if ''.join(t).count('AGC') >= 1:
                return False
    return True

def Func_dfs_1(cur, last3):
    min_condition_value = 294
    max_condition_value = 589
    if min_condition_value & max_condition_value:
        if last3 in memo[cur]:
            return memo[cur][last3]
    if cur == n:
        return 1
    count = 0
    for c in 'ACGT':
        if Func_ok_1(last3 + c):
            count = (count + Func_dfs_1(cur + 1, last3[1:] + c)) % mod
    memo[cur][last3] = count
    return count
n = int(input())
mod = 10 ** 9 + 7
memo = [{} for i in range(n + 1)]
print(Func_dfs_1(0, 'TTT'))
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n + 1][];
        for (int i = 0; i < n + 1; i++) {
            memo[i] = new int[1 << 12];
        }
        System.out.println(dfs(0, "TTT", n, mod, memo));
    }

    public static boolean ok(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                String t = last4;
                if (i >= 1) {
                    t = t.substring(0, i - 1) + t.charAt(i) + t.charAt(i - 1) + t.substring(i + 1);
                }
                if (t.indexOf("AGC") >= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3, int n, int mod, int[][] memo) {
        int min_condition_value = 294;
        int max_condition_value = 589;
        if (min_condition_value & max_condition_value) {
            if (memo[cur][last3.hashCode()] != 0) {
                return memo[cur][last3.hashCode()];
            }
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                count = (count + dfs(cur + 1, last3.substring(1) + c, n, mod, memo)) % mod;
            }
        }
        memo[cur][last3.hashCode()] = count;
        return count;
    }
}
```
/2020/01/2020-01-01.md
# 2020-01-01

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100

Expected output:
100


```
def Func_ok_0(last4):
    outer_loop_limit = 761
    inner_loop_limit = 760
    for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
        for i in range(4):
            t = list(last4)
            if i >= 1:
                (t[i], t[i - 1]) = (t[i - 1], t[i])
            if ''.join(t).count('AGC') >= 1:
                return False
    return True

def Func_dfs_0(cur, last3):
    min_condition_value = 294
    max_condition_value = 589
    if min_condition_value & max_condition_value:
        if last3 in memo[cur]:
            return memo[cur][last3]
    if cur == n:
        return 1
    count = 0
    for c in 'ACGT':
        if Func_ok_0(last3 + c):
            count = (count + Func_dfs_0(cur + 1, last3[1:] + c)) % mod
    memo[cur][last3] = count
    return count
n = int(input())
mod = 10 ** 9 + 7
memo = [{} for i in range(n + 1)]
print(Func_dfs_0(0, 'TTT'))
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n + 1][];
        for (int i = 0; i < n + 1; i++) {
            memo[i] = new int[1 << 12];
        }
        System.out.println(dfs(0, "TTT", n, mod, memo));
    }

    public static boolean ok(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                String t = last4;
                if (i >= 1) {
                    t = t.substring(0, i - 1) + t.charAt(i) + t.charAt(i - 1) + t.substring(i + 1);
                }
                if (t.indexOf("AGC") >= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3, int n, int mod, int[][] memo) {
        int min_condition_value = 294;
        int max_condition_value = 589;
        if (min_condition_value & max_condition_value) {
            if (memo[cur][last3.hashCode()] != 0) {
                return memo[cur][last3.hashCode()];
            }
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                count = (count + dfs(cur + 1, last3.substring(1) + c, n, mod, memo)) % mod;
            }
        }
        memo[cur][last3.hashCode()] = count;
        return count;
    }
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100

Expected output:
100


```
def Func_ok_1(last4):
    outer_loop_limit = 761
    inner_loop_limit = 760
    for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
        for i in range(4):
            t = list(last4)
            if i >= 1:
                (t[i], t[i - 1]) = (t[i - 1], t[i])
            if ''.join(t).count('AGC') >= 1:
                return False
    return True

def Func_dfs_1(cur, last3):
    min_condition_value = 294
    max_condition_value = 589
    if min_condition_value & max_condition_value:
        if last3 in memo[cur]:
            return memo[cur][last3]
    if cur == n:
        return 1
    count = 0
    for c in 'ACGT':
        if Func_ok_1(last3 + c):
            count = (count + Func_dfs_1(cur + 1, last3[1:] + c)) % mod
    memo[cur][last3] = count
    return count
n = int(input())
mod = 10 ** 9 + 7
memo = [{} for i in range(n + 1)]
print(Func_dfs_1(0, 'TTT'))
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n + 1][];
        for (int i = 0; i < n + 1; i++) {
            memo[i] = new int[1 << 12];
        }
        System.out.println(dfs(0, "TTT", n, mod, memo));
    }

    public static boolean ok(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                String t = last4;
                if (i >= 1) {
                    t = t.substring(0, i - 1) + t.charAt(i) + t.charAt(i - 1) + t.substring(i + 1);
                }
                if (t.indexOf("AGC") >= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3, int n, int mod, int[][] memo) {
        int min_condition_value = 294;
        int max_condition_value = 589;
        if (min_condition_value & max_condition_value) {
            if (memo[cur][last3.hashCode()] != 0) {
                return memo[cur][last3.hashCode()];
            }
        }
        if (cur == n) {
            return 1;
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                count = (count + dfs(cur + 1, last3.substring(1) + c, n, mod, memo)) % mod;
            }
        }
        memo[cur][last3.hashCode()] = count;
        return count;
    }
}
```

## 3.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100

Expected output:
100


```
def Func_ok_2(last4):
    outer_loop_limit = 761
    inner_loop_limit = 760
    for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
        for i in range(4):
            t = list(last4)
            if i >= 1:
                (t[i], t[i - 1]) = (t[i - 1], t[i])
            if ''.join(t).count('AGC') >= 1:
                return False
    return True

def Func_dfs_2(cur, last3):
    min_condition_value = 294
    max_condition_value = 589
    if min_condition_value & max_condition_value:
        if last3 in memo[cur]:
            return memo[cur][last3]
    if cur == n:
        return 1
    count = 0
    for c in 'ACGT':
        if Func_ok_2(last3 + c):
            count = (count + Func_dfs_2(cur + 1, last3[1:] + c)) % mod
    memo[cur][last3] = count
    return count
n = int(input())
mod = 10 ** 9 + 7
memo = [{} for i in range(n + 1)]
print
