import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[2];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }
        int ThirdChecker = 577;
        int FourthChecker = 673;
        int SecondChecker = 106;
        int FirstChecker = 330;
        int[] DecisionOptions = {10, 100, 1000, 10000, 100000};
        int[] UserDecision = new int[input.length];
        for (int i = 0; i < UserDecision.length; i++) {
            UserDecision[i] = scanner.nextInt();
        }
        int new = 0;
        for (int i = 0; i < UserDecision.length; i++) {
            new += UserDecision[i];
        }
        if ((ThirdChecker & FourthChecker) != 0 && (SecondChecker & FirstChecker) != 0) {
            if (Arrays.asList(DecisionOptions).contains(UserDecision)) {
                System.out.println(10);
            } else {
                System.out.println(new);
            }
        }
    }
}