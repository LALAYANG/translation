```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][2];
        for (int i = 0; i < n; i++) {
            matrix[i][0] = scanner.nextInt();
            matrix[i][1] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][0] == matrix[j][1] || matrix[i][1] == matrix[j][0]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```

