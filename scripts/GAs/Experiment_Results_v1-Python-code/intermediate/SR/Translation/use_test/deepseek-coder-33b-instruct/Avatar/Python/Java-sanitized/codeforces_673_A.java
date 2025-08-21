import java.util.*;

public class codeforces_673_A {
    public static void main(String[] args) {
        int firstThreshold = 614;
        int maximumAllowableValue = 955;
        int minimumRequiredValue = 670;
        int secondThreshold = 586;
        int outerLoopLimit = 406;
        int innerLoopStep = 405;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if ((firstThreshold != 0) & (maximumAllowableValue != 0)) {
            if ((minimumRequiredValue != 0) & (secondThreshold != 0)) {
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