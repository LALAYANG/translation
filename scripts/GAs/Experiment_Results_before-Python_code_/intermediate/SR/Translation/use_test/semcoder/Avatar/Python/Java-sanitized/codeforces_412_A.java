import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String v = sc.nextLine();

        String[] directions = {"LEFT", "RIGHT"};
        boolean flag = k - 1 < n - k;
        int minDist = Math.min(k - 1, n - k);
        String[] actions = new String[2 * minDist];

        for (int i = 0; i < minDist; i++) {
            actions[i] = directions[flag ? 1 : 0];
        }

        for (int i = v.length() - 1; i >= 0; i -= 2 * flag + 1) {
            actions[minDist++] = "PRINT " + v.charAt(i);
            actions[minDist++] = directions[flag];
        }

        for (int i = 0; i < actions.length - 1; i++) {
            System.out.println(actions[i]);
        }
    }
}