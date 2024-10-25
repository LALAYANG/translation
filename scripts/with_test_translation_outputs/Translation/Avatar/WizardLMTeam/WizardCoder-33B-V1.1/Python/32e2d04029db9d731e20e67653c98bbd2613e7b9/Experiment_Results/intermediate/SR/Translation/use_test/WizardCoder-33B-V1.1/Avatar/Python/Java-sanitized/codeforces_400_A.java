import java.util.*;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCases; i++) {
            String input = scanner.nextLine();
            solve(input);
        }
    }

    public static void solve(String input) {
        List<String> tot = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, input)) {
                    tot.add(12 / i + "x" + i);
                }
            }
        }
        System.out.print(tot.size() + " ");
        for (String s : tot) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static boolean help(int a, int b, String input) {
        List<String> tot = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            tot.add(input.substring(i * a, i * a + a));
        }
        for (String s : tot) {
            if (s.replace("X", "").length() == b) {
                return true;
            }
        }
        return false;
    }
}