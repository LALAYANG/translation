import java.util.Scanner;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstThreshold = 614;
        int maximumAllowableValue = 955;
        int minimumRequiredValue = 670;
        int secondThreshold = 586;
        int outerLoopLimit = 406;
        int innerLoopStep = 405;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (firstThreshold & maximumAllowableValue) {
            if (minimumRequiredValue & secondThreshold) {
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