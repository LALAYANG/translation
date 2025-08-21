import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.nextLine();
        List<String> directions = Arrays.asList("LEFT", "RIGHT");
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        List<String> actions = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            actions.add(directions.get(f ? 1 : 0));
        }

        for (int i = 0; i < inputString.length(); i++) {
            actions.add("PRINT " + inputString.charAt(i));
            actions.add(directions.get(f ? 0 : 1));
        }

        System.out.println(String.join("\n", actions));
    }
}