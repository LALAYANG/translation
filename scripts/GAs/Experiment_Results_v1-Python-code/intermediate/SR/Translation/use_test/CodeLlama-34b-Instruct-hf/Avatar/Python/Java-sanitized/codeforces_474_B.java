import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = scanner.nextInt();
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += numbers[j];
            }
            result.add(sum);
        }

        for (int i = 0; i < m; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                product *= numbers[j];
            }
            result.add(product);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(result.get(i));
        }
    }
}