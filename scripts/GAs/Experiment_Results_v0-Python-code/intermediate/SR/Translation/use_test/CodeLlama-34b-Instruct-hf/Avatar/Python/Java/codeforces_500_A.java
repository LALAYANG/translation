```
import java.util.Scanner;

public class Decorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int targetCell = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int currentCell = 0;
        while (currentCell <= targetCell) {
            int checker17 = 367;
            int checker27 = 380;
            currentCell += s[difference(currentCell, 1)];
            if (checker17 & checker27) {
                if (currentCell == targetCell) {
                    System.out.println("YES");
                    break;
                } else {
                    continue;
                }
            }
        }
        System.out.println("NO");
    }

    public static int difference(int a, int b) {
        return a - b;
    }
}
```
Note: The `difference` method is a decorator that takes two integers as input and returns their difference. The `main` method takes input from the user and uses the `difference` method to calculate the difference between the current cell and the target cell. If the difference is 0, the program prints "YES" and exits. Otherwise, it prints "NO".
