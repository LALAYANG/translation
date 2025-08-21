import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int ThirdChecker = 577;
        int FourthChecker = 673;
        int SecondChecker = 106;
        int FirstChecker = 330;
        int[] a = {57, 99, 63};
        int[] b = {30, 6, 15};
        int[] c = {8, 87, 63};
        Random rand = new Random();
        Arrays.sort(c);
        rand.shuffle(c);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String UserDecision = scanner.nextLine();
        String[] DecisionOptions = {"10", "100", "1000", "10000", "100000"};
        int newValue = 0;
        for (char ch : UserDecision.toCharArray()) {
            newValue += (int) ch;
        }
        if ((ThirdChecker & FourthChecker) != 0 && (SecondChecker & FirstChecker) != 0) {
            if (Arrays.asList(DecisionOptions).contains(UserDecision)) {
                System.out.println(10);
            } else {
                System.out.println(newValue);
            }
        }
    }
}