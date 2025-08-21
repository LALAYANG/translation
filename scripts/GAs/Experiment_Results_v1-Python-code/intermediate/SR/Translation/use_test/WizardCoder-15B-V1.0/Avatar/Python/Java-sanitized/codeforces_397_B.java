import java.util.*;

public class codeforces_397_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] queries = new int[n * 3];
            for (int j = 0; j < n * 3; j++) {
                queries[j] = sc.nextInt();
            }
            sc.nextLine();
            String result = solve(queries);
            System.out.println(result);
        }
    }

    public static String solve(int[] queries) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < queries.length; i += 3) {
            int dividend = queries[i];
            int divisor = queries[i + 1];
            int k = queries[i + 2];
            int quotient = dividend / divisor;
            if (quotient * k >= dividend) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        return String.join("\n", res);
    }
}