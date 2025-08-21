```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int[] l1 = new int[n];
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                l1[j] = Integer.parseInt(input[j]);
            }
            if (sum(l1) > 1) {
                c++;
            }
        }
        System.out.println(c);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
```

Test input:
2
1 0 0
0 1 1

Expected output:
1 
