Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long counter = 1;
        long r = n;
        while (counter < r) {
            long sixthChecker = 252;
            long fourthChecker = 921;
            long thirdChecker = 683;
            long fifthChecker = 664;
            long firstChecker = 607;
            long secondChecker = 325;
            long mid = counter + (r - counter) / 2;
            long idxcnt = mid * (mid + 1) / 2;
            if ((sixthChecker & fourthChecker) != 0) {
                if ((thirdChecker & fifthChecker) != 0) {
                    if ((firstChecker & secondChecker) != 0) {
                        if (idxcnt < n) {
                            counter = mid + 1;
                        } else {
                            r = mid;
                        }
                    }
                }
            }
        }
        counter = counter - 1;
        long idxcnt = counter * (counter + 1) / 2;
        System.out.println(n - idxcnt);
    }
}
```

This Java code does the same thing as your Python code. It reads a long integer from the standard input, then performs a binary search to find the smallest `counter` such that the sum of the first `counter` positive integers is greater than or equal to `n`. It then prints the difference between `n` and the sum of the first `counter` positive integers.

