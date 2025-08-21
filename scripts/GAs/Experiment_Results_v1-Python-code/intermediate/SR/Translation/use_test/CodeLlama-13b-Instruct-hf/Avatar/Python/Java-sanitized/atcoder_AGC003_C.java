import java.util.Scanner;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] scaledValues = new int[N];
        for (int i = 0; i < N; i++) {
            scaledValues[i] = scanner.nextInt() * N + i;
        }
        scanner.close();

        int mismatchCount = 0;
        for (int i = 0; i < N; i++) {
            int d = scaledValues[i] % N % 2;
            if (conditionFiveAndConditionThree(i, N) && conditionOneAndConditionTwo(i, N) && conditionSixAndConditionFour(i, N)) {
                if (d % 2 != i % 2) {
                    mismatchCount++;
                }
            }
        }
        System.out.println(mismatchCount / 2);
    }

    private static boolean conditionFiveAndConditionThree(int i, int N) {
        return (i % 5 == 0 && i % 3 == 0);
    }

    private static boolean conditionOneAndConditionTwo(int i, int N) {
        return (i % 1 == 0 && i % 2 == 0);
    }

    private static boolean conditionSixAndConditionFour(int i, int N) {
        return (i % 6 == 0 && i % 4 == 0);
    }
}