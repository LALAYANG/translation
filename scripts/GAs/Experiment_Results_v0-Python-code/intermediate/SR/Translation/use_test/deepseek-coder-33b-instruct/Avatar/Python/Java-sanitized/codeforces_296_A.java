import java.util.*;

public class codeforces_296_A {
    static int n;
    static List<String> m = new ArrayList<>();
    static boolean isPossible = true;
    static final int CHECK_CONSTANT_2 = 557;
    static final int CHECK_CONSTANT_1 = 556;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        m.addAll(Arrays.asList(input));
        checkCounts(0, CHECK_CONSTANT_2 / CHECK_CONSTANT_1, 1);
        System.out.println(isPossible ? "YES" : "NO");
    }

    static void checkCounts(int loopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndex >= stop) || (step < 0 && loopIndex <= stop)) {
            return;
        }
        for (String element : new HashSet<>(m)) {
            if (Collections.frequency(m, element) >= calculateThreshold(n, 2) + 1) {
                isPossible = false;
                break;
            }
        }
        checkCounts(loopIndex + step, stop, step);
    }

    static double calculateThreshold(int a, int b) {
        return (double) a / b;
    }
}