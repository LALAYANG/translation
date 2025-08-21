```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input_string = sc.next();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < k - 1) {
                left[i] = 1;
            } else if (i > n - k) {
                right[i] = 1;
            } else {
                left[i] = 1;
                right[i] = 1;
            }
        }
        int[] directions = new int[n];
        for (int i = 0; i < n; i++) {
            if (left[i] == 1) {
                directions[i] = 0;
            } else if (right[i] == 1) {
                directions[i] = 1;
            } else {
                directions[i] = -1;
            }
        }
        int m = Math.min(k - 1, n - k);
        int[] instructions = new int[n * 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (directions[i] == -1) {
                continue;
            }
            int start = Math.max(0, i - m);
            int stop = Math.min(n - 1, i + m);
            int step = directions[i] == 0 ? 1 : -1;
            for (int j = start; j <= stop; j += step) {
                instructions[index++] = directions[j] == 0 ? 0 : 1;
            }
        }
        for (int i = 0; i < input_string.length(); i++) {
            char c = input_string.charAt(i);
            instructions[index++] = 2;
            instructions[index++] = (int) c;
        }
        for (int i = 0; i < instructions.length; i += 2) {
            if (instructions[i] == 0) {
                System.out.println("LEFT");
            } else if (instructions[i] == 1) {
                System.out.println("RIGHT");
            } else {
                System.out.println("PRINT " + (char) instructions[i + 1]);
            }
        }
    }
}
```
