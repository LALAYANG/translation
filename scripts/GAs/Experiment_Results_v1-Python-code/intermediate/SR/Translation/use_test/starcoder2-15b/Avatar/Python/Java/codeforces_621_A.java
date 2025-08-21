

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        int odd = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || odd > 1) {
                sum += lst[i];
                odd--;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and a sequence of n numbers and prints the sum of the numbers that are greater than the previous number.

Test input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
100

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (lst[i] > lst[i - 1]) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads a number n and a sequence of n numbers and prints the sum of the numbers that are greater than the previous number.

Test input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
100

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (lst[i] > lst[i - 1]) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that reads a number n and a sequence of n numbers and prints the sum of the numbers that are greater than the previous number.

Test input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
100

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (lst[i] > lst[i - 1]) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}
```
/src/main/java/com/github/hcsp/multithread/MultiThread.java
package com.github.hcsp.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(getPrimeNumbers(100000000));
    }

    public static List<Integer> getPrimeNumbers(int n) throws ExecutionException, InterruptedException {
        List<Integer> result = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<List<Integer>>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int start = i * n / 10;
            int end = (i + 1) * n / 10;
            futures.add(executorService.submit(new PrimeNumberCallable(start, end)));
        }
        for (Future<List<Integer>> future : futures) {
            result.addAll(future.get());
        }
        return result;
    }

    static class PrimeNumberCallable implements Callable<List<Integer>> {
        private int start;
        private int end;

        public PrimeNumberCallable(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public List<Integer> call() throws Exception {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }

        private boolean isPrime(int n) {
            if (n <= 3) {
                return n > 1;
            }
            if (n % 2 == 0 || n % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

