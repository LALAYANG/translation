To solve this problem, we need to iterate through the list of integers and calculate the differences between adjacent elements. We will follow the logic provided in the Python code snippet to determine the differences and print the results as specified.

Here is the Java solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println((arr[i + 1] - arr[i]) + " " + (arr[n - 1] - arr[i]));
                continue;
            } else if (i == n - 1) {
                System.out.println((arr[n - 1] - arr[n - 2]) + " " + (arr[n - 1] - arr[0]));
                continue;
            } else if (arr[i] - arr[i - 1] > arr[i + 1] - arr[i]) {
                System.out.print((arr[i + 1] - arr[i]) + " ");
            } else {
                System.out.print((arr[i] - arr[i - 1]) + " ");
            }

            if (arr[n - 1] - arr[i] > arr[i] - arr[0]) {
                System.out.println(arr[n - 1] - arr[i]);
            } else {
                System.out.println(arr[i] - arr[0]);
            }
        }
    }
}
```

This Java solution reads the input integers, iterates through them, and calculates the differences as per the Python code snippet's logic. It then prints the results as specified in the problem description.
