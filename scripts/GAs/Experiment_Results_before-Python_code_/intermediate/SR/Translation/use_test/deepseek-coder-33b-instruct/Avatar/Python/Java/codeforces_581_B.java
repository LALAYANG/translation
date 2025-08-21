```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] ans = new int[n];
        int mx = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(0, mx - arr[i] + 1);
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n from the standard input, then reads n integers into an array arr. It then creates an array ans of the same size, and initializes it with 0. It also initializes mx with the last element of arr.

Then it iterates over the array arr in reverse order (from n-2 to 0), and for each element, it calculates the maximum of 0 and mx - arr[i] + 1, and stores the result in ans[i]. If arr[i] is greater than mx, it updates mx with arr[i].

Finally, it prints the elements of ans to the standard output.

