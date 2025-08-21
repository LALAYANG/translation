```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] lista = new int[a];
        for (int i = 0; i < a; i++) {
            lista[i] = scanner.nextInt();
        }

        int[] listb = new int[b];
        for (int i = 0; i < b; i++) {
            listb[i] = scanner.nextInt();
        }

        for (int k = 0; k < n; k++) {
            boolean found = false;
            for (int i = 0; i < a; i++) {
                if (k + 1 == lista[i]) {
                    System.out.print("1 ");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print("2 ");
            }
        }
    }
}
```

This Java code does the same thing as the provided Python code. It reads the input, then for each number from 1 to n, it checks if it is in the first list. If it is, it prints 1, otherwise it prints 2.

