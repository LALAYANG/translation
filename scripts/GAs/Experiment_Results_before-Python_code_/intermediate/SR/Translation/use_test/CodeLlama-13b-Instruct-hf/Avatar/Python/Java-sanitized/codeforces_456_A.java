import java.util.Scanner;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            m[i][0] = sc.nextInt();
            m[i][1] = sc.nextInt();
        }
        sc.close();

        // Sort the array in descending order
        Arrays.sort(m, (a, b) -> b[1] - a[1]);

        // Find the first element that is greater than the second element
        for (int i = 1; i < n; i++) {
            if (m[i][1] > m[i - 1][1]) {
                System.out.println("Happy Alex");
                break;
            }
        }

        // If no element is greater than the second element, print "Poor Alex"
        if (i == n) {
            System.out.println("Poor Alex");
        }
    }
}