import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = Integer.parseInt(args[i+1]);
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