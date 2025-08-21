import java.util.*;
import java.util.concurrent.*;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] resultArray = new int[n];
        int mx = arr[n - 1];
        int conditionOne = 995;
        int conditionTwo = 398;
        int outerLoopCounter = 470;
        int innerLoopCounter = 469;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++) {
            for (int i = n - 2; i >= 0; i--) {
                resultArray[i] = Math.max(0, mx - arr[i] + 1);
                if ((conditionOne & conditionTwo) != 0) {
                    if (arr[i] > mx) {
                        mx = arr[i];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}