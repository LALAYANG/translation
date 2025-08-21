import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");

        // Calculate the threshold
        double threshold = calculateThreshold(n, 2);

        // Check if the counts are possible
        boolean isPossible = true;
        for (String element : set(m)) {
            if (m.count(element) >= threshold + 1) {
                isPossible = false;
                break;
            }
        }

        // Print the result
        System.out.println(isPossible ? "YES" : "NO");
    }

    public static double calculateThreshold(int n, int k) {
        // Calculate the threshold using the given formula
        return n / k;
    }

    public static Set<String> set(String[] m) {
        // Create a set from the given array
        return new HashSet<String>(Arrays.asList(m));
    }
}