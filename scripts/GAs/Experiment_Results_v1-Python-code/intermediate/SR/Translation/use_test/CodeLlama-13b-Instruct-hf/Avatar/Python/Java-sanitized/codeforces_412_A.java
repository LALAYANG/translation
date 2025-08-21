import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int k = scanner.nextInt();
        String v = scanner.nextLine();

        List<String> directionOptions = Arrays.asList("LEFT", "RIGHT");
        boolean f = k - 1 < inputNum - k;
        int m = Math.min(k - 1, inputNum - k);
        List<String> a = new ArrayList<>();

        recursiveTtest(0, m, 1);

        for (int i = v.length() - 1; i >= 0; i--) {
            a.add("PRINT " + v.charAt(i));
            a.add(directionOptions.get(f));
        }

        System.out.println(String.join("\n", a));
    }

    public static void recursiveTtest(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        ttestInd([18, 91, 67], [40, 22, 60]);
        a.add(directionOptions.get(not f));
        recursiveTtest(i + step, stop, step);
    }

    public static void ttestInd(int[] x, int[] y) {
        // Implement the t-test function here
    }
}