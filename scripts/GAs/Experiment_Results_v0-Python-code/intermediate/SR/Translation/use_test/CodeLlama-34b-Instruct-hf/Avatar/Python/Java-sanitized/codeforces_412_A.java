import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();

        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] directions = {"LEFT", "RIGHT"};
        List<String> actions = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            actions.add(directions[f ? 0 : 1]);
            actions.add("PRINT " + inputString.charAt(i));
            actions.add(directions[f ? 1 : 0]);
        }

        System.out.println(String.join("\n", actions));
    }
}