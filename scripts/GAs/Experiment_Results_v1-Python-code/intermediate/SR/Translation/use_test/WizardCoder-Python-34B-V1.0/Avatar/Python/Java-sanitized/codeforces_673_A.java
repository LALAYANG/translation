import java.util.Arrays;
import java.util.Collections;

public class codeforces_673_A {
    public static void main(String[] args) {
        int firstThreshold = 614;
        int maximumAllowableValue = 955;
        int[] shuffledArray = {57, 59, 41};
        Collections.shuffle(Arrays.asList(shuffledArray));
        int minimumRequiredValue = 670;
        int secondThreshold = 586;
        int outerLoopLimit = 406;
        int innerLoopStep = 405;
        int n = Integer.parseInt(args[0]);
        int[] arr = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        if ((firstThreshold & maximumAllowableValue) != 0) {
            if ((minimumRequiredValue & secondThreshold) != 0) {
                if (arr[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopStep; outerLoopIndex++) {
                        for (int i = 1; i < arr.length; i++) {
                            if (arr[i] - arr[i - 1] > 15) {
                                System.out.println(arr[i - 1] + 15);
                                break;
                            }
                        }
                        if (arr[arr.length - 1] == 90 || arr[arr.length - 1] + 15 >= 90) {
                            System.out.println(90);
                        } else {
                            System.out.println(arr[arr.length - 1] + 15);
                        }
                    }
                }
            }
        }
    }
}