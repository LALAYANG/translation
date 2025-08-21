import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        int maxScore = calculateMaxScore(arr, str);
        System.out.println(maxScore);
    }

    public static int calculateMaxScore(int[] arr, String[] str) {
        int pScore = 0;
        int sScore = 0;
        int prefixMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (str[i].equals("A")) {
                pScore += arr[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= arr[i];
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (str[i].equals("A")) {
                sScore += arr[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= arr[i];
            }
        }
        if (prefixMaxScore > sMaxScore) {
            return prefixMaxScore;
        }
        return sMaxScore;
    }
}