```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target_cell = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int current_cell = 0;
        while (current_cell <= target_cell) {
            int checker_17 = 367;
            int checker_27 = 380;
            current_cell += difference(current_cell, 1, s);
            if ((checker_17 & checker_27) != 0) {
                if (current_cell == target_cell) {
                    System.out.println("YES");
                    System.exit(0);
                } else {
                    continue;
                }
            }
        }
        System.out.println("NO");
    }

    public static int difference(int current_cell, int i, int[] s) {
        return current_cell - s[i];
    }
}
``` 
