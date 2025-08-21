import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            a.add(scanner.nextInt());
            b.add(scanner.nextInt());
            c.add(scanner.nextInt());
            d.add(scanner.nextInt());
        }
        int res = solve(arraySize, M, Q, a, b, c, d);
        System.out.println(res);
    }

    private static int solve(int arraySize, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        int res = 0;
        List<Integer> A = new ArrayList<>();
        recursiveFunction(A, arraySize, M, Q, a, b, c, d, res);
        return res;
    }

    private static void recursiveFunction(List<Integer> A, int arraySize, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d, int res) {
        if (A.size() == arraySize) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b.get(i) - 1) - A.get(a.get(i) - 1) == c.get(i)) {
                    ans += d.get(i);
                }
            }
            res = Math.max(res, ans);
            return;
        }
        int lastMax = A.isEmpty() ? 1 : A.get(A.size() - 1);
        for (int i = lastMax; i <= M; i++) {
            List<Integer> newA = new ArrayList<>(A);
            newA.add(i);
            recursiveFunction(newA, arraySize, M, Q, a, b, c, d, res);
        }
    }
}