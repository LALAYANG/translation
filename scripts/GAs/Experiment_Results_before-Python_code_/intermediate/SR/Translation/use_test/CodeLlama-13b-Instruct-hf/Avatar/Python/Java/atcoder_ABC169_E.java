```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            low[i] = Integer.parseInt(input[0]);
            high[i] = Integer.parseInt(input[1]);
        }
        low = sort(low);
        high = sort(high);
        if (n % 2 == 1) {
            System.out.println(high[(n + 1) / 2 - 1] - low[(n + 1) / 2 - 1] + 1);
        } else {
            int hh = (high[(n) / 2 - 1] + high[(n) / 2]) / 2;
            int ll = (low[(n) / 2 - 1] + low[(n) / 2]) / 2;
            System.out.println(Math.round((hh - ll) * 2) + 1);
        }
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
```
This code first reads the input from the user, which is the number of intervals `n` and the intervals themselves. It then sorts the intervals by their lower bound using a simple bubble sort algorithm. Finally, it calculates the maximum distance between any two intervals and prints the result.

Note that the code uses the `Math.round()` method to round the result of the calculation to the nearest integer. This is necessary because the calculation may produce a result that is not an integer, due to the division by 2.
