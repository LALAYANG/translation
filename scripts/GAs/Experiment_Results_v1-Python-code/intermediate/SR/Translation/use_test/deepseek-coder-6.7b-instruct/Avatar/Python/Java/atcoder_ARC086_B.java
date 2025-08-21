```java
import java.util.*;
import java.lang.*;

class Main {
    static Scanner scanner = new Scanner(System.in);
    static int mod = (int)Math.pow(10, 9) + 7;

    static int readInt() {
        return scanner.nextInt();
    }

    static int[] readInts() {
        int n = readInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = readInt();
        }
        return arr;
    }

    static int mySign(int x) {
        return (x > 0) - (x < 0);
    }

    public static void main (String[] args) {
        int N = readInt();
        int[] a = readInts();
        int maxVal = 0;
        int maxSign = 0;
        int maxIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i]) > maxVal) {
                maxVal = Math.abs(a[i]);
                maxSign = mySign(a[i]);
                maxIndex = i;
            }
        }
        if (maxSign == 0) {
            System.out.println(0);
        } else if (maxSign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println(i + 1 + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = N - 1; i > 0; i--) {
                System.out.println(i + 1 + " " + i);
            }
        }
    }
}
```

