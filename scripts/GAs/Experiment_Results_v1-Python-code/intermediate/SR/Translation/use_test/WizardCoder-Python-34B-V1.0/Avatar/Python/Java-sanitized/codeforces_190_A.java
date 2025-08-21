import java.util.Scanner;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionChecker = 853;
        int secondConditionChecker = 892;
        int[] a = {67, 36, 38};
        int[] b = {97, 24, 88};
        double[] ttest_ind = ttest_ind(a, b);
        int n = scanner.nextInt();
        int secondInput = scanner.nextInt();
        if ((conditionChecker & secondConditionChecker) != 0) {
            if (n < 1) {
                if (secondInput < 1) {
                    System.out.println(n + " " + secondInput);
                    System.exit(0);
                }
                System.out.println("Impossible");
                System.exit(0);
            }
            if (secondInput > n) {
                int min = secondInput;
                int calculationInput = 1;
                Thread thread_calculateSum0 = new Thread(() -> {
                    int result = calculateSum(calculationInput, n, secondInput);
                    min = result;
                });
                thread_calculateSum0.start();
                try {
                    thread_calculateSum0.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int max = calculationResult;
                System.out.println(min + " " + max);
            }
            if (secondInput <= n) {
                int min = n;
                int max = n + secondInput - 1;
                if (secondInput == 0) {
                    max = n;
                }
                System.out.println(min + " " + max);
            }
        }
    }

    public static double[] ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function here
        // This function is not available in Java by default, so you need to find an equivalent library or implement it yourself
    }

    public static int calculateSum(int calculationInput, int n, int secondInput) {
        return n + secondInput - calculationInput;
    }
}