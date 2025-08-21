import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        List<String> d = Arrays.asList("LEFT", "RIGHT");
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        List<String> instructions = new ArrayList<>();

        void recursivePrintDirection(int i, int stop, int step) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            // ttest_ind([67, 60, 79], [81, 21, 89]); // This line is not needed in Java
            instructions.add(d.get(!f));
            recursivePrintDirection(i + step, stop, step);
        }

        recursivePrintDirection(0, m, 1);
        for (int i = inputString.length() - 1 + (2 * f); i >= 0; i--) {
            instructions.add("PRINT " + inputString.charAt(i));
            instructions.add(d.get(f));
        }

        System.out.println(String.join("\n", instructions.stream().collect(Collectors.toList()).subList(0, instructions.size() - 1));
    }
}