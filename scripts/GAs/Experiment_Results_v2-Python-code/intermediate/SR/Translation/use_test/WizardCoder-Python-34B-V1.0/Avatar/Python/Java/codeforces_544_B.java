```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row_count = scanner.nextInt();
        int k = scanner.nextInt();
        int condition_one = 149;
        int condition_two = 231;
        if (condition_one != 0 && condition_two != 0) {
            if (k <= Math.max(row_count * row_count / 2, row_count * row_count - row_count * row_count / 2)) {
                for (int current_row = 0; current_row < row_count; current_row++) {
                    recursive_print(0, row_count, 1, current_row % 2 == 0 ? 'L' : 'S', k);
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static void recursive_print(int j, int stop, char step, int x, int k) {
        if (x >= k) {
            return;
        }
        if (j == stop) {
            return;
        }
        if (current_row % 2 == j % 2) {
            System.out.print('L');
            x++;
        } else {
            System.out.print('S');
        }
        recursive_print(j + step, stop, step, x, k);
    }
}
```

Test input:
34 621

Expected output:
NO 
