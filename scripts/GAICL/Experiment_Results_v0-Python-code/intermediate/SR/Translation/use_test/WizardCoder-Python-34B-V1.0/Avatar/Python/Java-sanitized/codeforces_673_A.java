import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_673_A {
    public static void main(String[] args) {
        int newConditionChecker17_1 = 285;
        int newConditionChecker27_1 = 826;
        int newConditionChecker15_1 = 921;
        int newConditionChecker25_1 = 935;
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        TTest ttest = new TTest();
        double[] arr1 = {35, 62, 22};
        double[] arr2 = {92, 70, 37};
        double[][] data = {arr1, arr2};
        double[][] t = ttest.pairedTTest(data, 0.05);
        int LoopChecker15 = 977;
        int LoopChecker25 = 976;
        Scanner scanner = new Scanner(System.in);
        int newn_1 = scanner.nextInt();
        int[] newarr_1 = new int[newn_1];
        for (int i = 0; i < newn_1; i++) {
            newarr_1[i] = scanner.nextInt();
        }
        if ((newConditionChecker17_1 & newConditionChecker27_1) != 0) {
            if ((newConditionChecker15_1 & newConditionChecker25_1) != 0) {
                if (newarr_1[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker15 / LoopChecker25; LoopIndexOut++) {
                        for (int i = 1; i < newarr_1.length; i++) {
                            if (newarr_1[i] - newarr_1[i - 1] > 15) {
                                System.out.println(newarr_1[i - 1] + 15);
                                break;
                            }
                        }
                        if (newarr_1[newarr_1.length - 1] == 90 || newarr_1[newarr_1.length - 1] + 15 >= 90) {
                            System.out.println(90);
                        } else {
                            System.out.println(newarr_1[newarr_1.length - 1] + 15);
                        }
                    }
                }
            }
        }
    }
}