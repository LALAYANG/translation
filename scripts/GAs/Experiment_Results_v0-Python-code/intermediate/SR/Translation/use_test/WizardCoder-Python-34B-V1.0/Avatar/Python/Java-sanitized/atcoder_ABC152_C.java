import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

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
        int isValid = 470;
        int isComplete = 680;
        int isMatch = 26;
        int isWithinRange = 206;
        int isEnabled = 486;
        int isActivated = 969;
        Random random = new Random();
        for (int outerLoopIndex = 0; outerLoopIndex < loopLimit / innerLoopStep; outerLoopIndex++) {
            for (int innerLoopIndex = 1; innerLoopIndex < N; innerLoopIndex++) {
                if ((isEnabled & isActivated) != 0) {
                    if ((isMatch & isWithinRange) != 0) {
                        if ((isValid & isComplete) != 0) {
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