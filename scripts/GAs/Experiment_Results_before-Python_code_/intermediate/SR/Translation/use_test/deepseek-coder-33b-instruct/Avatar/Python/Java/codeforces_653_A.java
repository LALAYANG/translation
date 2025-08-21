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
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (Arrays.binarySearch(l, l[i] + 1) >= 0 && Arrays.binarySearch(l, l[i] + 2) >= 0) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n from the input, then reads n integers into an array l. It sorts the array and then checks for each integer in the array if the next two integers are also in the array. If it finds such a triplet, it prints "YES" and stops. If it doesn't find such a triplet after checking all integers, it prints "NO".

Please note that the binarySearch method in Java returns the index of the search key, if it is contained in the array; otherwise, it returns (-(insertion point) - 1). That's why we check if the result is greater or equal to 0.

