import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.nextLine();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        List<String> instructions = new ArrayList<>();

        recursivePrintDirection(0, m, 1);

        for (int i = inputString.length() - 1; i >= 0; i--) {
            instructions.add("PRINT " + inputString.charAt(i));
            instructions.add(d[f]);
        }

        System.out.println(String.join("\n", instructions));
    }

    private static void recursivePrintDirection(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        ttest_ind(new double[] {67, 60, 79}, new double[] {81, 21, 89});
        instructions.add(d[not f]);
        recursivePrintDirection(i + step, stop, step);
    }
}