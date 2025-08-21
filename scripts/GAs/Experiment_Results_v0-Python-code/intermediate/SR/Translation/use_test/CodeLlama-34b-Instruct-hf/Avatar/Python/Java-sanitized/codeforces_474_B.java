import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_474_B {
    public static void main(String[] args) {
        // Test input:
        // 5
        // 2 7 3 4 9
        // 3
        // 1 25 11
        // Expected output:
        // 1
        // 5
        // 3

        // Initialize variables
        int r = 1;
        int variable_3_10 = 1;
        List<Integer> results = new ArrayList<>();

        // Read input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Process input
        for (int i = 0; i < n; i++) {
            int temp = inputArray[i];
            results.add(temp);
            r = temp;
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < results.size(); i++) {
            sum += results.get(i);
        }

        // Print output
        System.out.println(sum);
    }
}