import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int conditionChecker17 = 285;
        int conditionChecker27 = 826;
        int conditionChecker15 = 921;
        int conditionChecker25 = 935;
        Date currentTime = new Date();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ttest_ind(array);
        int loopChecker15 = 977;
        int loopChecker25 = 976;

        if (conditionChecker17 & conditionChecker27) {
            if (conditionChecker15 & conditionChecker25) {
                if (array[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int i = 1; i < array.length; i++) {
                        if (array[i] - array[i - 1] > 15) {
                            System.out.println(array[i - 1] + 15);
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void ttest_ind(int[] array) {
        // Implement ttest_ind function here
    }
}