import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();

        int[] directions = {1, -1};
        int f = k - 1 < n - k ? 1 : -1;
        int m = Math.min(k - 1, n - k);
        int[] actions = new int[m];

        for (int i = 0; i < m; i++) {
            actions[i] = directions[f];
        }

        for (int i = 0; i < inputString.length(); i++) {
            actions[i] = 'PRINT ' + inputString.charAt(i);
            actions[i + 1] = directions[f];
        }

        for (int i = 0; i < actions.length; i++) {
            System.out.println(actions[i]);
        }
    }
}