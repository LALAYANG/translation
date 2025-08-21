

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int total_length = arr[0];
        arr = Arrays.stream(Arrays.copyOfRange(arr, 1, 4)).sorted().toArray();
        if (total_length % arr[0] == 0) {
            System.out.println(total_length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int count_1 = 0;
            for (int i = 0; i <= total_length / arr[2]; i++) {
                int variable_7_18 = arr[2];
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        return total_length - i * variable_7_18;
                    }
                });
                try {
                    int remainder = future.get(1000, TimeUnit.MILLISECONDS);
                    int check = remainder;
                    if (check >= 0 && check % arr[0] == 0) {
                        count_1 = check / arr[0];
                        ans = Math.max(ans, count_1 + i);
                    }
                } catch (TimeoutException e) {
                    System.out.println("Timeout");
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                } catch (ExecutionException e) {
                    System.out.println("Execution error");
                } finally {
                    executor.shutdown();
                }
            }
        } else {
            int count_1 = 0;
            for (int i = 0; i <= total_length / arr[2]; i++) {
                for (int j = 0; j <= total_length / arr[1]; j++) {
                    int check = total_length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        count_1 = check / arr[0];
                        ans = Math.max(ans, count_1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
        return;
    }
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
10


```
def Func_max_pairwise_product_0():
    n = int(input())
    a = [int(x) for x in input().split()]
    result = 0
    for i in range(0, n):
        for j in range(i + 1, n):
            if a[i] * a[j] > result:
                result = a[i] * a[j]
    print(result)
    return
Func_max_pairwise_product_0()
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] * a[j] > result) {
                    result = a[i] * a[j];
                }
            }
        }
        System.out.println(result);
        return;
    }
}
```

## 3.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
100


```
def Func_max_pairwise_product_1():
    n = int(input())
    a = [int(x) for x in input().split()]
    result = 0
    for i in range(0, n):
        for j in range(i + 1, n):
            if a[i] * a[j] > result:
                result = a[i] * a[j]
    print(result)
    return
Func_max_pairwise_product_1()
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] * a[j] > result) {
                    result = a[i] * a[j];
                }
            }
        }
        System.out.println(result);
        return;
    }
}
```

## 4.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
100


```
def Func_max_pairwise_product_2():
    n = int(input())
    a = [int(x) for x in input().split()]
    result = 0
    for i in range(0, n):
        for j in range(i + 1, n):
            if a[i] * a[j] > result:
                result = a[i] * a[j]
    print(result)
    return
Func_max_pairwise_product_2()
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] * a[j] > result) {
                    result = a[i] * a[j];
                }
            }
        }
        System.out.println(result);
        return;
    }
}
```

## 5.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
100


```
def Func_max_pairwise_product_3():
    n = int(input())
    a = [int(x) for x in input().split()]
    result = 0
    for i in range(0, n):
        for j in range(i + 1, n):
            if a[i] * a[j] > result:
                result = a[i] * a[j]
    print(result)
    return
Func_max_pairwise_product_3()
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] * a[j] > result) {
                    result = a[i] * a[j];
                }
            }
        }
        System.out.println(result);
        return;
    }
}
```

## 6.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
100


```
def Func_max_pairwise_product_4():
    n = int(input())
    a = [int(x) for x in input().split()]
    result = 0
    for i in range(0, n):
        for j in range(i + 1, n):
            if a[i] * a[j] > result:
                result = a[i] * a[j]
    print(result)
    return
Func_max_pairwise_product_4()
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] * a[j] > result) {
                    result = a[i] * a[j];
                }
            }
        }
        System.out.println(result);
        return;
    }
}
```

## 7.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
100


```
def Func_max_pairwise_product_5():
    n = int(input())
    a = [int(x) for x in input().split()]
    result = 0
    for i in range(0, n):
        for j in range(i + 1, n):
            if a[i] * a[j] > result:
                result = a[i] * a[j]
    print(result)
    return
Func_max_pairwise_product_5()
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] * a[j] > result) {
                    result = a[i] * a[j];
                }
            }
        }
        System.out.println(result);
        return;
    }
}
```

## 8.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
100


```
def Func_max_pairwise_product_6():
    n = int(input())
    a = [int(x) for x in input().split()]
    result = 0
    for i in range(0, n):
        for j in range(i + 1, n):
            if a[i] * a[j] > result:
                result = a[i] * a[j]
    print(result)
    return
Func_max_pairwise_product_6()
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] * a[j] > result) {
                    result = a[i] * a[j];
                }
            }
        }
        System.out.println(result);
        return;
    }
}
```

## 9.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
100


```
def Func_max_pairwise_product_7():
    n = int(input())
    a = [int(x) for x in input().split()]
    result = 0
    for i in range(0, n):
        for j in range(i + 1, n):
            if a[i] * a[j] > result:
                result = a[i] * a[j]
    print(result)
    return
Func_max_pairwise_product_7()
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
