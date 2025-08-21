import java.util.*;

public class codeforces_61_B {

    public static double divide(double arg0, double arg1) {
        return arg0 / arg1;
    }

    public static double multiply(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public static double calculateRatio(double arg0, double arg1) {
        return divide(arg0, arg1);
    }

    public static double calculateProduct(double arg1, double arg2) {
        return multiply(arg1, arg2);
    }

    public static double calculateSum(double arg0, double arg1) {
        return calculateRatio(arg0, arg1);
    }

    public static double solveQuadratic(double arg1, double arg2) {
        return calculateProduct(arg1, arg2);
    }

    public static boolean FuncValid0(int i, int j, int n, int m) {
        if (i < n && i >= 0 && (j >= 0) && (j < m)) {
            return true;
        }
        return false;
    }

    public static double FuncSumn0(int i, int n) {
        return calculateSum((n - i) * (i + n), 2);
    }

    public static double FuncSqfun0(double a, double b, double c) {
        return solveQuadratic((-b + Math.sqrt(b * b - 4 * a * c)) / 2, a);
    }

    public static List<Integer> value() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        while (scanner.hasNext()) {
            values.add(scanner.nextInt());
        }
        return values;
    }

    public static String f(String s) {
        String r = "";
        for (char i : s.toCharArray()) {
            if (i != '-' && i != ';' && i != '_') {
                r += Character.toLowerCase(i);
            }
        }
        return r;
    }

    public static void solve() {
        List<String> teamNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            teamNames.add(f(scanner.nextLine()));
        }
        List<String> teamPermutations = new ArrayList<>();
        permutation("", teamNames, teamPermutations);
        for (String teamName : teamPermutations) {
            String submission = scanner.nextLine();
            if (f(submission).equals(teamName)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static void permutation(String prefix, List<String> teamNames, List<String> teamPermutations) {
        int n = teamNames.size();
        if (n == 0) teamPermutations.add(prefix);
        else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + teamNames.get(i), teamNames.subList(0, i) + teamNames.subList(i + 1, n), teamPermutations);
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}