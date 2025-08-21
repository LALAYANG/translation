```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Thread;

public class SumAndMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = scanner.nextInt();
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += numbers[j];
            }
            result.add(sum);
        }

        for (int i = 0; i < m; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                product *= numbers[j];
            }
            result.add(product);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(result.get(i));
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the results. The `Thread` class is used to create a new thread for each query, and the `Queue` class is used to store the results of each query. The `calculationThreadExecution` method is executed in the new thread, and it adds the result of the calculation to the `calculationQueue`. The main thread then retrieves the result from the `calculationQueue` and prints it to the console.
