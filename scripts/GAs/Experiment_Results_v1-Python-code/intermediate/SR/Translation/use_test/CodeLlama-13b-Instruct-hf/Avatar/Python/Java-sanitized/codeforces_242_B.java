import java.util.Scanner;
import java.util.Arrays;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        int[][] leftBoundary = new int[n][2];
        for (int i = 0; i < n; i++) {
            leftBoundary[i][0] = sc.nextInt();
            leftBoundary[i][1] = sc.nextInt();
        }
        int[][] r = new int[n][2];
        for (int i = 0; i < n; i++) {
            r[i][0] = sc.nextInt();
            r[i][1] = sc.nextInt();
        }
        int[][] firstConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            firstConditionCheck[i][0] = sc.nextInt();
            firstConditionCheck[i][1] = sc.nextInt();
        }
        int[][] secondConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            secondConditionCheck[i][0] = sc.nextInt();
            secondConditionCheck[i][1] = sc.nextInt();
        }
        int[][] outerLoopLimit = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopLimit[i][0] = sc.nextInt();
            outerLoopLimit[i][1] = sc.nextInt();
        }
        int[][] outerLoopStep = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopStep[i][0] = sc.nextInt();
            outerLoopStep[i][1] = sc.nextInt();
        }
        int[][] id = new int[n][2];
        for (int i = 0; i < n; i++) {
            id[i][0] = sc.nextInt();
            id[i][1] = sc.nextInt();
        }
        int[][] globalLeftBoundary = new int[n][2];
        for (int i = 0; i < n; i++) {
            globalLeftBoundary[i][0] = sc.nextInt();
            globalLeftBoundary[i][1] = sc.nextInt();
        }
        int[][] r = new int[n][2];
        for (int i = 0; i < n; i++) {
            r[i][0] = sc.nextInt();
            r[i][1] = sc.nextInt();
        }
        int[][] firstConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            firstConditionCheck[i][0] = sc.nextInt();
            firstConditionCheck[i][1] = sc.nextInt();
        }
        int[][] secondConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            secondConditionCheck[i][0] = sc.nextInt();
            secondConditionCheck[i][1] = sc.nextInt();
        }
        int[][] outerLoopLimit = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopLimit[i][0] = sc.nextInt();
            outerLoopLimit[i][1] = sc.nextInt();
        }
        int[][] outerLoopStep = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopStep[i][0] = sc.nextInt();
            outerLoopStep[i][1] = sc.nextInt();
        }
        int[][] id = new int[n][2];
        for (int i = 0; i < n; i++) {
            id[i][0] = sc.nextInt();
            id[i][1] = sc.nextInt();
        }
        int[][] globalLeftBoundary = new int[n][2];
        for (int i = 0; i < n; i++) {
            globalLeftBoundary[i][0] = sc.nextInt();
            globalLeftBoundary[i][1] = sc.nextInt();
        }
        int[][] r = new int[n][2];
        for (int i = 0; i < n; i++) {
            r[i][0] = sc.nextInt();
            r[i][1] = sc.nextInt();
        }
        int[][] firstConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            firstConditionCheck[i][0] = sc.nextInt();
            firstConditionCheck[i][1] = sc.nextInt();
        }
        int[][] secondConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            secondConditionCheck[i][0] = sc.nextInt();
            secondConditionCheck[i][1] = sc.nextInt();
        }
        int[][] outerLoopLimit = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopLimit[i][0] = sc.nextInt();
            outerLoopLimit[i][1] = sc.nextInt();
        }
        int[][] outerLoopStep = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopStep[i][0] = sc.nextInt();
            outerLoopStep[i][1] = sc.nextInt();
        }
        int[][] id = new int[n][2];
        for (int i = 0; i < n; i++) {
            id[i][0] = sc.nextInt();
            id[i][1] = sc.nextInt();
        }
        int[][] globalLeftBoundary = new int[n][2];
        for (int i = 0; i < n; i++) {
            globalLeftBoundary[i][0] = sc.nextInt();
            globalLeftBoundary[i][1] = sc.nextInt();
        }
        int[][] r = new int[n][2];
        for (int i = 0; i < n; i++) {
            r[i][0] = sc.nextInt();
            r[i][1] = sc.nextInt();
        }
        int[][] firstConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            firstConditionCheck[i][0] = sc.nextInt();
            firstConditionCheck[i][1] = sc.nextInt();
        }
        int[][] secondConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            secondConditionCheck[i][0] = sc.nextInt();
            secondConditionCheck[i][1] = sc.nextInt();
        }
        int[][] outerLoopLimit = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopLimit[i][0] = sc.nextInt();
            outerLoopLimit[i][1] = sc.nextInt();
        }
        int[][] outerLoopStep = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopStep[i][0] = sc.nextInt();
            outerLoopStep[i][1] = sc.nextInt();
        }
        int[][] id = new int[n][2];
        for (int i = 0; i < n; i++) {
            id[i][0] = sc.nextInt();
            id[i][1] = sc.nextInt();
        }
        int[][] globalLeftBoundary = new int[n][2];
        for (int i = 0; i < n; i++) {
            globalLeftBoundary[i][0] = sc.nextInt();
            globalLeftBoundary[i][1] = sc.nextInt();
        }
        int[][] r = new int[n][2];
        for (int i = 0; i < n; i++) {
            r[i][0] = sc.nextInt();
            r[i][1] = sc.nextInt();
        }
        int[][] firstConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            firstConditionCheck[i][0] = sc.nextInt();
            firstConditionCheck[i][1] = sc.nextInt();
        }
        int[][] secondConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            secondConditionCheck[i][0] = sc.nextInt();
            secondConditionCheck[i][1] = sc.nextInt();
        }
        int[][] outerLoopLimit = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopLimit[i][0] = sc.nextInt();
            outerLoopLimit[i][1] = sc.nextInt();
        }
        int[][] outerLoopStep = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopStep[i][0] = sc.nextInt();
            outerLoopStep[i][1] = sc.nextInt();
        }
        int[][] id = new int[n][2];
        for (int i = 0; i < n; i++) {
            id[i][0] = sc.nextInt();
            id[i][1] = sc.nextInt();
        }
        int[][] globalLeftBoundary = new int[n][2];
        for (int i = 0; i < n; i++) {
            globalLeftBoundary[i][0] = sc.nextInt();
            globalLeftBoundary[i][1] = sc.nextInt();
        }
        int[][] r = new int[n][2];
        for (int i = 0; i < n; i++) {
            r[i][0] = sc.nextInt();
            r[i][1] = sc.nextInt();
        }
        int[][] firstConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            firstConditionCheck[i][0] = sc.nextInt();
            firstConditionCheck[i][1] = sc.nextInt();
        }
        int[][] secondConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            secondConditionCheck[i][0] = sc.nextInt();
            secondConditionCheck[i][1] = sc.nextInt();
        }
        int[][] outerLoopLimit = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopLimit[i][0] = sc.nextInt();
            outerLoopLimit[i][1] = sc.nextInt();
        }
        int[][] outerLoopStep = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopStep[i][0] = sc.nextInt();
            outerLoopStep[i][1] = sc.nextInt();
        }
        int[][] id = new int[n][2];
        for (int i = 0; i < n; i++) {
            id[i][0] = sc.nextInt();
            id[i][1] = sc.nextInt();
        }
        int[][] globalLeftBoundary = new int[n][2];
        for (int i = 0; i < n; i++) {
            globalLeftBoundary[i][0] = sc.nextInt();
            globalLeftBoundary[i][1] = sc.nextInt();
        }
        int[][] r = new int[n][2];
        for (int i = 0; i < n; i++) {
            r[i][0] = sc.nextInt();
            r[i][1] = sc.nextInt();
        }
        int[][] firstConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            firstConditionCheck[i][0] = sc.nextInt();
            firstConditionCheck[i][1] = sc.nextInt();
        }
        int[][] secondConditionCheck = new int[n][2];
        for (int i = 0; i < n; i++) {
            secondConditionCheck[i][0] = sc.nextInt();
            secondConditionCheck[i][1] = sc.nextInt();
        }
        int[][] outerLoopLimit = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopLimit[i][0] = sc.nextInt();
            outerLoopLimit[i][1] = sc.nextInt();
        }
        int[][] outerLoopStep = new int[n][2];
        for (int i = 0; i < n; i++) {
            outerLoopStep[i][0] = sc.nextInt();
            outerLoopStep[i][1] = sc.nextInt();
        }
        int[][] id = new int[n][2];
        for (int i = 0; i < n; i++) {
            id[i][0] = sc.nextInt();
            id[i][1] = sc.nextInt();
        }
        int[][] globalLeftBoundary = new int[n][2];
        for (int i = 0; i < n; i++) {
            globalLeftBoundary[i][0] = sc.nextInt();
            globalLeftBoundary[i][1] = sc.nextInt();
        }
        int[][] r = new int[n][2];
        for (int i = 0; i < n; i++) {
            r[i][0] = sc.nextInt();
            r[i][1] = sc.nextInt();
        }
        int[][] firstConditionCheck = new int[n][2];
        for (int i = 0; i < n;