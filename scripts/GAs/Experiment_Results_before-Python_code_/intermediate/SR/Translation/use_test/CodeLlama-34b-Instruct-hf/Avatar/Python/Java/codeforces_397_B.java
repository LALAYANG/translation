```
import java.util.Scanner;

public class CodeforcesTask397BSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[][] queries = new int[t][3];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j] = scanner.nextInt();
            }
        }

        String[] result = new String[t];
        for (int i = 0; i < t; i++) {
            int k = queries[i][0] / queries[i][1];
            if (k * queries[i][2] >= queries[i][0]) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It reads the input from the user, processes the task, and prints the result.
