import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        String[] directions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] actions = new String[inputString.length() * 2];

        int actionsIndex = 0;
        for (int i = 0; i < m; i++) {
            actions[actionsIndex++] = directions[f ? 1 : 0];
        }

        for (int i = inputString.length() - 1; i >= 0; i--) {
            actions[actionsIndex++] = "PRINT " + inputString.charAt(i);
            actions[actionsIndex++] = directions[f ? 0 : 1];
        }

        for (int i = 0; i < actionsIndex; i++) {
            System.out.println(actions[i]);
        }
    }
}