```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = Integer.parseInt(input[i + 2]);
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print(p + 1 + " ");
                    break;
                }
            }
            for (int l = 0; l < p - k; l++) {
                M[l]--;
            }
            M[p]--;
        }
    }
}
```

Test input:
10 1
9 8 7 6 5 4 3 2 1 0

Expected output:
10 9 8 7 6 5 4 3 2 1 
