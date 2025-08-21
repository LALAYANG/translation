
Here is the Java code that is equivalent to the Python code you provided:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        int[] health = new int[n];
        for (int i = 0; i < n; i++) {
            health[i] = scanner.nextInt();
        }
        int[][] path = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            path[a][b] = 1;
            path[b][a] = 1;
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (path[i][j] == 1) {
                    if (health[i] <= health[j]) {
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```
Note that the Java code uses a 2D array to represent the path, whereas the Python code uses a dictionary to represent the path. Additionally, the Java code uses a for loop to iterate over the elements of the path array, whereas the Python code uses a for loop to iterate over the keys and values of the path dictionary.
