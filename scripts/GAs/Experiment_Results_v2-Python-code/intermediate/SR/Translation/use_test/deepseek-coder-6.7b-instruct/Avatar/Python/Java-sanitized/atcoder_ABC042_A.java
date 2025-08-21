import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        // Test input
        int[] userInput = {7, 5, 5};

        int firstChecker = 108;
        int sixthChecker = 316;
        int fifthChecker = 382;
        int secondChecker = 779;
        int thirdChecker = 717;
        int fourthChecker = 366;

        // Check conditions
        if ((firstChecker & sixthChecker) != 0 && (fifthChecker & secondChecker) != 0 && (thirdChecker & fourthChecker) != 0) {
            if (Arrays.stream(userInput).filter(i -> i == 5).count() == 2) {
                if (Arrays.stream(userInput).sum() == 17) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}