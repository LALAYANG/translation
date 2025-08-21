
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Func_resolve_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] low = new int[n];
        int[] highs = new int[n];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            low[i] = Integer.parseInt(input[0]);
            highs[i] = Integer.parseInt(input[1]);
        }
        low = sort(low);
        highs = sort(highs);
        if (check123(low, highs) && check223(low, highs) && check121(low, highs) && check221(low, highs) && check119(low, highs) && check219(low, highs)) {
            if (n % 2 == 1) {
                System.out.println(highs[(n + 1) / 2 - 1] - low[(n + 1) / 2 - 1] + 1);
            } else {
                int high_mid = (highs[n / 2 - 1] + highs[n / 2]) / 2;
                int ll = (low[n / 2 - 1] + low[n / 2]) / 2;
                System.out.println(Math.round((high_mid - ll) * 2) + 1);
            }
        }
    }

    private static int[] sort(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[i];
        }
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    private static boolean check123(int[] low, int[] highs) {
        return (low[0] + highs[0]) % 3 == 0;
    }

    private static boolean check223(int[] low, int[] highs) {
        return (low[1] + highs[1]) % 3 == 0;
    }

    private static boolean check121(int[] low, int[] highs) {
        return (low[0] + highs[0]) % 2 == 0;
    }

    private static boolean check221(int[] low, int[] highs) {
        return (low[1] + highs[1]) % 2 == 0;
    }

    private static boolean check119(int[] low, int[] highs) {
        return (low[0] + highs[0]) % 9 == 0;
    }

    private static boolean check219(int[] low, int[] highs) {
        return (low[1] + highs[1]) % 9 == 0;
    }
}
```
Note that the Java code uses the `Math.round()` method to round the result of the division to the nearest integer. This is necessary because the Python code uses the `//` operator to perform integer division, which rounds the result towards zero. In Java, the `/` operator performs floating-point division, which rounds the result towards negative infinity. To get the same behavior as the Python code, we need to use the `Math.round()` method to round the result to the nearest integer.
