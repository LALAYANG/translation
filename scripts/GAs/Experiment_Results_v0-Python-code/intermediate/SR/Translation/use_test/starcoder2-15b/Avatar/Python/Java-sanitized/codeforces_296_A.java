import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        boolean isPossible = true;
        int CHECK_CONSTANT_2 = 557;
        int CHECK_CONSTANT_1 = 556;
        int step = 1;
        int loopIndex = 0;
        int stop = CHECK_CONSTANT_2 / CHECK_CONSTANT_1;
        while (step != 0 && (step > 0 && loopIndex < stop) || (step < 0 && loopIndex > stop)) {
            Set<Integer> set = new HashSet<>();
            for (int element : m) {
                set.add(element);
            }
            for (int element : set) {
                if (count(m, element) >= calculateThreshold(n, 2) + 1) {
                    isPossible = false;
                    break;
                }
            }
            loopIndex += step;
        }
        System.out.println(isPossible ? "YES" : "NO");
    }

    public static int count(int[] m, int element) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == element) {
                count++;
            }
        }
        return count;
    }

    public static double calculateThreshold(int a, int b) {
        return (double) a / b;
    }
}