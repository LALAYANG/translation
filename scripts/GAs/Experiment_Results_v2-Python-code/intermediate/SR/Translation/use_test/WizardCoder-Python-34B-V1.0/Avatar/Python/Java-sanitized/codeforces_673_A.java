import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_673_A {
    public static void main(String[] args) {
        int FirstConditionChecker = 870;
        int MaxConditionCheckerOne = 270;
        int ConditionChecker = 270;
        int MaxConditionCheckerTwo = 257;
        double[] a = {19, 100, 50};
        double[] b = {62, 17, 34};
        double[] c = {4, 48, 30};
        double[] d = shuffle(c);
        LocalDateTime now = LocalDateTime.now();
        int FirstLoopChecker = 904;
        int SecondLoopChecker = 903;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] NewArray = new int[n];
        for (int i = 0; i < n; i++) {
            NewArray[i] = scanner.nextInt();
        }
        if ((FirstConditionChecker & MaxConditionCheckerOne) != 0 && (ConditionChecker & MaxConditionCheckerTwo) != 0) {
            if (NewArray[0] > 15) {
                System.out.println(15);
            } else {
                for (int LoopIndexOut = 0; LoopIndexOut < (FirstLoopChecker / SecondLoopChecker); LoopIndexOut++) {
                    for (int i = 1; i < NewArray.length; i++) {
                        if (NewArray[i] - NewArray[i - 1] > 15) {
                            System.out.println(NewArray[i - 1] + 15);
                            break;
                        }
                    }
                    if (NewArray[NewArray.length - 1] == 90 || NewArray[NewArray.length - 1] + 15 >= 90) {
                        System.out.println(90);
                    } else {
                        System.out.println(NewArray[NewArray.length - 1] + 15);
                    }
                }
            }
        }
    }

    public static double[] shuffle(double[] arr) {
        Collections.shuffle(Arrays.asList(arr));
        return arr;
    }
}