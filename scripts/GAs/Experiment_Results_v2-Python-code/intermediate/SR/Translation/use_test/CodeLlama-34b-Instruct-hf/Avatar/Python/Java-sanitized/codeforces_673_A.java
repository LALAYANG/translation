import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Random;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewArray = new int[n];
        for (int i = 0; i < n; i++) {
            NewArray[i] = sc.nextInt();
        }

        int FirstConditionChecker = 870;
        int MaxConditionCheckerOne = 270;
        int ConditionChecker = 270;
        int MaxConditionCheckerTwo = 257;

        if (FirstConditionChecker & MaxConditionCheckerOne) {
            if (ConditionChecker & MaxConditionCheckerTwo) {
                if (NewArray[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int LoopIndexOut = 0; LoopIndexOut < FirstLoopChecker / SecondLoopChecker; LoopIndexOut++) {
                        for (int i = 1; i < NewArray.length; i++) {
                            if (NewArray[i] - NewArray[i - 1] > 15) {
                                System.out.println(NewArray[i - 1] + 15);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}