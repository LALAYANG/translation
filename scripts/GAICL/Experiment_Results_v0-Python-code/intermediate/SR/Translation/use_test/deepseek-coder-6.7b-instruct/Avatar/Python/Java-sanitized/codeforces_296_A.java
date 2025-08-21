import java.util.*;

public class codeforces_296_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] m = scanner.nextLine().split(" ");
        boolean isPossible = true;
        int CHECK_CONSTANT_2 = 557;
        int CHECK_CONSTANT_1 = 556;

        checkCounts(0, CHECK_CONSTANT_2 / CHECK_CONSTANT_1, 1, n, m, isPossible);
        System.out.println(isPossible ? "YES" : "NO");
    }

    private static void checkCounts(int loopIndex, int stop, int step, int n, String[] m, boolean isPossible) {
        if (step == 0 || (step > 0 && loopIndex >= stop) || (step < 0 && loopIndex <= stop)) {
            return;
        }
        for (String element : new HashSet<>(Arrays.asList(m))) {
            long count = Arrays.stream(m).filter(element::equals).count();
            if (count >= calculateThreshold(n, 2) + 1) {
                isPossible = false;
                break;
            }
        }
        checkCounts(loopIndex + step, stop, step, n, m, isPossible);
    }

    private static double calculateThreshold(int a, int b) {
        return (double) a / b;
    }
}