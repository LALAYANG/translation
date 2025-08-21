import java.util.*;

class Main {
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
                    c = calculateDifference(3, c);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                }
            }
        }
    }

    @FunctionalInterface
    interface CalculateDifference {
        int apply(int variable10, int c);
    }

    public static int calculateDifference(int variable10, int c) {
        // ttest_ind([87, 28, 59], [80, 6, 26]);
        return variable10 - c;
    }
}