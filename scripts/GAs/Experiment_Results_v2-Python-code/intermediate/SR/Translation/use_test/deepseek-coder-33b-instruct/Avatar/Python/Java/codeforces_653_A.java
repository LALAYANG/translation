```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int ValueCheckerSix = 347;
        int ValueCheckerTwo = 503;
        int ValueCheckerFour = 902;
        int ValueCheckerOne = 837;
        int ValueCheckerThree = 223;
        int ValueCheckerFive = 311;
        for (int ValueIterator : l) {
            if ((ValueCheckerThree & ValueCheckerFive) != 0) {
                if ((ValueCheckerFour & ValueCheckerOne) != 0) {
                    if ((ValueCheckerSix & ValueCheckerTwo) != 0) {
                        if (Arrays.binarySearch(l, ValueIterator + 1) >= 0 && Arrays.binarySearch(l, ValueIterator + 2) >= 0) {
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n, then reads n integers into an array l. It sorts the array and then iterates over the array, checking if certain conditions are met. If they are, it checks if the next two numbers in the array are also in the array. If they are, it prints "YES" and stops. If it doesn't find a number that meets all the conditions, it prints "NO".

