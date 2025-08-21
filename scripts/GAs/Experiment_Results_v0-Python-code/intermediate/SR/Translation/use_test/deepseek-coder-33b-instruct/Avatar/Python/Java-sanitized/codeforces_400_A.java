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
        List<String> validDimensions = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, input)) {
                    validDimensions.add(i + "x" + (12 / i));
                }
            }
        }
        System.out.print(validDimensions.size() + " ");
        for (String dimension : validDimensions) {
            System.out.print(dimension + " ");
        }
        System.out.println();
    }

    public static boolean help(int a, int b, String input) {
        List<String> validDimensions = new ArrayList<>();
        for (int i = 0; i < input.length(); i += a) {
            validDimensions.add(input.substring(i, i + a));
        }
        for (String dimension : validDimensions) {
            int sum = 0;
            for (char c : dimension.toCharArray()) {
                sum += c == '1' ? 1 : 0;
            }
            if (sum == b) {
                return true;
            }
        }
        return false;
    }
}