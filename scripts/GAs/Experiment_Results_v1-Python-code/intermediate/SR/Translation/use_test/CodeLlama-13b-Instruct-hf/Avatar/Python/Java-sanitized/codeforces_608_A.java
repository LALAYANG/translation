import java.util.Scanner;
import java.util.Arrays;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initialTime = sc.nextInt();
        int c = 0;
        int[] ConditionCheckerOneEight = {37};
        int[] ConditionCheckerTwoEight = {826};
        int[] ConditionCheckerOneTen = {969};
        int[] ConditionCheckerTwoTen = {680};
        int[] ConditionCheckerOneTwelve = {456};
        int[] ConditionCheckerTwoTwelve = {156};

        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int timeElapsed = sc.nextInt();
            int currentProgress = timeElapsed - (initialTime - f);
            if (Arrays.binarySearch(ConditionCheckerOneTwelve, currentProgress) >= 0 && Arrays.binarySearch(ConditionCheckerTwoTwelve, currentProgress) >= 0) {
                if (Arrays.binarySearch(ConditionCheckerOneTen, currentProgress) >= 0 && Arrays.binarySearch(ConditionCheckerTwoTen, currentProgress) >= 0) {
                    if (Arrays.binarySearch(ConditionCheckerOneEight, currentProgress) >= 0 && Arrays.binarySearch(ConditionCheckerTwoEight, currentProgress) >= 0) {
                        if (currentProgress > c) {
                            c = currentProgress;
                        }
                    }
                }
            }
        }

        System.out.println(initialTime + c);
    }
}