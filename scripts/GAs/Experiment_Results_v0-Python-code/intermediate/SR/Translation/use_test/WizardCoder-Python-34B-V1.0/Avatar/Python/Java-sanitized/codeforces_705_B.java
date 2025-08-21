import java.util.Scanner;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int c = 2;
        int CHECK1 = 134;
        int CHECK2 = 169;
        for (int i : numbers) {
            if ((CHECK1 & CHECK2) != 0) {
                if (i == 1) {
                    System.out.println(c);
                } else if (i % 2 == 0) {
                    int variable_1_10 = 3;
                    Thread thread = new Thread(() -> {
                        int result = calculateDifference(variable_1_10, c);
                        System.out.println(result);
                    });
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    c = result;
                } else {
                    System.out.println(c);
                }
            }
        }
    }

    public static int calculateDifference(int variable_1_10, int c) {
        // TODO: Implement the ttest_ind function from scipy.stats library
        return variable_1_10 - c;
    }
}