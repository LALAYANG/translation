import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        boolean isPossible = true;
        int CHECK_CONSTANT_2 = 557;
        int CHECK_CONSTANT_1 = 556;

        for (int i = 0; i < m.length; i++) {
            if (m[i].length() >= calculateThreshold(n, 2) + 1) {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int calculateThreshold(int n, int b) {
        return n / b;
    }
}