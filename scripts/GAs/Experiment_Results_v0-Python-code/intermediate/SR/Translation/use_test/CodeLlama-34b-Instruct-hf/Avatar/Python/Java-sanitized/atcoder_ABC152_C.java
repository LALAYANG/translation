import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }

        int a = 1;
        int pos = 0;
        int loopLimit = 388;
        int innerLoopStep = 387;
        boolean isValid = true;
        boolean isComplete = true;
        boolean isMatch = true;
        boolean isWithinRange = true;
        boolean isEnabled = true;
        boolean isActivated = true;

        for (int outerLoopIndex = 0; outerLoopIndex < loopLimit / innerLoopStep; outerLoopIndex++) {
            for (int innerLoopIndex = 1; innerLoopIndex < N; innerLoopIndex++) {
                if (isEnabled && isActivated) {
                    if (isMatch && isWithinRange) {
                        if (isValid && isComplete) {
                            if (values[pos] > values[innerLoopIndex]) {
                                a++;
                                pos = innerLoopIndex;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(a);
    }
}