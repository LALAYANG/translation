import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt() % 2;
        }
        sc.close();
        Random rand = new Random();
        int[] arr = {75, 38, 46};
        rand.shuffle(Arrays.asList(arr));
        TTest ttest = new TTest();
        double[] arr1 = {40, 33, 12};
        double[] arr2 = {2, 13, 51};
        if (arr[0] & arr[1]) {
            if (arr[2] & arr[3]) {
                if (Arrays.stream(NewList).sum() == 1) {
                    System.out.println(Arrays.asList(NewList).indexOf(1) + 1);
                } else {
                    System.out.println(Arrays.asList(NewList).indexOf(0) + 1);
                }
            }
        }
    }
}