import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Read the list of integers
        String[] input = scanner.nextLine().trim().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String s : input) {
            nums.add(Integer.parseInt(s));
        }

        // Sort the list in ascending order
        Collections.sort(nums);

        // Calculate the sum of the first k elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums.get(i);
        }

        // Print the sum as the output
        System.out.println(sum);
    }
}